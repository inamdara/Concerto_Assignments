package com.concerto.demo.service;

import java.util.Optional;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concerto.demo.model.Customer;
import com.concerto.demo.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer findCustomerByEmail(String customerEmail) {
		Optional<Customer> optional = this.customerRepository.findById(customerEmail);
		return optional.orElseThrow(() -> new EntityNotFoundException("Customer is Not Found"));
	}
	
	public boolean addCustomer(Customer customer) {
		if (!this.customerRepository.existsById(customer.getCustomerEmailId())) {
			this.customerRepository.save(customer);
			return true;
		}
		throw new EntityExistsException("Customer already exist!!");
	}
	
}
