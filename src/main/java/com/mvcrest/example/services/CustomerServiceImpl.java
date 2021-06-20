package com.mvcrest.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mvcrest.example.domain.Customer;
import com.mvcrest.example.repositories.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {

	private final ICustomerRepository customerRepository;
	
	public CustomerServiceImpl(ICustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer findCustomersById(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id).get();
	}

	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer SaveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

}
