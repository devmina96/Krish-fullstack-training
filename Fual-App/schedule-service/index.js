
//import { Kafka as kafka } from 'kafkajs'
//import dbConfig from './helper/dbconfig'
//import express, { json } from 'express'
//import { connect, connection } from 'mongoose'
//import { scheduleIncomingMesssage as scheduleIncoming } from './service/scheduler'
const Kafka = require('kafkajs').Kafka
const express = require('express')
const mongoose = require('mongoose')

const scheduleIncoming = require('../schedule-service/service/scheduler')
const url = 'mongodb://localhost/CPC'

const index = express()

mongoose.connect(url,{useNewUrlParser:true})

const con = mongoose.connection

con.on('open', ()=>{
    console.log("connected ...")
})
index.use(express.json)
const Kafkaconsumer = new Kafka({
    clientId: "allocation-topic-consumer1",
    brokers: ["localhost:9092"],
  });

  const consumer = Kafkaconsumer.consumer({
    groupId: "allocation-topic-consumer-group",
  });

  const run = async () => {
    await consumer.connect();
    await consumer.subscribe({ topic: "schedule", fromBeginning: true });
  
    await consumer.run({
      eachMessage: async ({ topic, partition, message }) => {
        //console.log(message.value.toString)
        try {
          scheduleIncoming.scheduleIncomingMesssage(message)
        } catch (error) {
          console.log(error)
        }

        console.log({value: message.value.toString(),
        });
      },
    });
  };
  run().catch(console.error);

