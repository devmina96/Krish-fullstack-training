package com.fualdistributionallocation.allocationservice.controller;

import com.fualdistributionallocation.allocationservice.logic.allocationLogic;
import com.fualdistributionallocation.allocationservice.model.Order;
import com.fualdistributionallocation.allocationservice.repository.orderRepository;
import com.fualdistributionallocation.allocationservice.service.allocateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;
import java.util.Optional;

@Service
public class orderController {


    @Autowired
    private allocationLogic allocationlogic;

    @Autowired
    Order order1;

    @Autowired
    private allocateService allocateservice;


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String topic = "schedule";


 /*   @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@RequestBody Order order){
        orderrepository.save(order);
        return "";
    }*/


    @KafkaListener(topics = "neworder", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);

        if(message.length()==6) {
            allocationlogic.setIdValues(message.substring(0, 4));
            allocationlogic.setFualTypeValues(message.substring(4, 5));
            allocationlogic.setCapacityValues(message.substring(5, 6));

            if(allocationlogic.allocate()){
                allocateservice.save(order1);

                Order od = allocateservice.fetchOrderById(order1.getId());
                System.out.println(od.toString());
                Gson gson = new Gson();
                String odr = gson.toJson(od);
                kafkaTemplate.send(topic, odr);
            }
        }
        else
            System.out.println("Wrong ID");
    }


    @KafkaListener(topics = "schedule-state", groupId = "group_id")
    public void consumeScheduleState(String message) {
        Gson gson = new Gson();
        String odr = gson.toJson(message);
        System.out.println("Consumed message: " + odr);
    }


/*
    @KafkaListener(topics = "neworder", groupId = "group_json",
            containerFactory = "orderKafkaListenerFactory")
    public void consumeJson(Order order) {
        System.out.println("Consumed JSON Message: " + order);
    }*/
/*
    @KafkaListener(topics = "neworder", groupId = "group_json")
    public void consumeJson(List<Order> order) {
        System.out.println("Consumed JSON Message: " + order.toString());
        System.out.println(ord.getId());
    }*/

}
