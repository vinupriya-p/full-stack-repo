package com.infosys.employee.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infosys.employee.dto.EmployeeDTO;
import com.infosys.employee.dto.EmployeeTrainingDTO;

import com.infosys.employee.service.EmployeeService;

@RestController

@RequestMapping("/employee")
public class EmployeeController 
{
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value = "/getall")  
	public List<EmployeeDTO> getAll()   
	{  
		return employeeService.getAll();  
	}  
	
	@PostMapping(value = "/save")  
	private int save(@RequestBody EmployeeDTO employee)   
	{  
		employeeService.save(employee);  
		return employee.getEmp_id();  
	}  
	
	@GetMapping(value = "/id/{id}") 
	private EmployeeDTO getEmployee(@PathVariable("id") int id)   
	{  
		EmployeeDTO employeeDTO = employeeService.getEmployeeById(id);  
		ResponseEntity<EmployeeTrainingDTO[]> entity =  new RestTemplate().getForEntity("http://localhost:8082/employee-training/id/" + employeeDTO.getEmp_id(), EmployeeTrainingDTO[].class);
		 List<EmployeeTrainingDTO> employeeTraining = Arrays.asList(entity.getBody());
		 employeeDTO.setEmployeeTrainings(employeeTraining);
		return employeeDTO;
	}  
	
	@GetMapping(value = "/name/{name}") 
	private List<EmployeeDTO> getEmployeeByName(@PathVariable("name") String name)   
	{  
		return employeeService.getEmployeeByName(name);  
	}  
	
	@DeleteMapping(value = "/{id}")  
	private void delete(@PathVariable("id") int id)   
	{  
		employeeService.delete(id);  
	}  
	
}
