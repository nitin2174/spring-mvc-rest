package com.mvcrest.example.services;


import com.mvcrest.example.domain.Customer;

import java.util.List;

public interface ICustomerService {
    Customer findCustomersById(Long id);
    List<Customer> findAllCustomers();
	Customer SaveCustomer(Customer customer);
}
