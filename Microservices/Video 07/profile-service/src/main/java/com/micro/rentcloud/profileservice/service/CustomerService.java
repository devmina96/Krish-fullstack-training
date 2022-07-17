package com.micro.rentcloud.profileservice.service;

import org.micro.rentcloud.commons.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
