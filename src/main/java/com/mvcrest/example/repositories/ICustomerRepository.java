package com.mvcrest.example.repositories;


import com.mvcrest.example.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
