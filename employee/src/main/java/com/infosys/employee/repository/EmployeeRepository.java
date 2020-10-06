package com.infosys.employee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infosys.employee.model.Employee;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Integer>{

}