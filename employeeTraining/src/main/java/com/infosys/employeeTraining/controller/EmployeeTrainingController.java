package com.infosys.employeeTraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.employeeTraining.service.EmployeeTrainingService;
import com.infosys.employeeTraining.dto.EmployeeTrainingDTO;


@RestController
@CrossOrigin(value = "http://localhost:4200")
public class EmployeeTrainingController 
{
	@Autowired
	EmployeeTrainingService employeeTrainingService;
	
	@GetMapping(value = "employee-training/getall")  
	public List<EmployeeTrainingDTO> getAll()   
	{  
		return employeeTrainingService.getAll();  
	}  
	
	@GetMapping(value = "employee-training/id/{id}")
	public List<EmployeeTrainingDTO> getEmployeeTraining(@PathVariable("id") int id)
	{
		return employeeTrainingService.getEmployeeTrainingById(id);
	}

}
