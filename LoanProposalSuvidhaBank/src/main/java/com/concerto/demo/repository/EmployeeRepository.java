package com.concerto.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.concerto.demo.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String>{

}
