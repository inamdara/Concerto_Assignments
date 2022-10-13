package com.concerto.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.concerto.demo.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String>{


}
