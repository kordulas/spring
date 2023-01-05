package com.example.oszczedzaMy.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerServiceImplementation {

    private final CustomerRepository customerRepository;

    public CustomerServiceImplementation(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createNewCustomer(Customer customer){
        log.info("Creating new Customer {}",customer);
        if(customer.getId() != null){
            throw new ExistCustomerException("Customer has already DB ID, update is not permitted!");
        }
        customerRepository.save(customer);
        return customer;
    }
}
