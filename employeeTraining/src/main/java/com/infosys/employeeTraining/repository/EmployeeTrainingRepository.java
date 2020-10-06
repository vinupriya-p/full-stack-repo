package com.infosys.employeeTraining.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infosys.employeeTraining.model.EmployeeTraining;
import com.infosys.employeeTraining.model.EmployeeTrainingId;

@Repository
public interface EmployeeTrainingRepository extends CrudRepository<EmployeeTraining, EmployeeTrainingId> 
{

	List<EmployeeTraining> findByEmpId(int emp_id);
}
