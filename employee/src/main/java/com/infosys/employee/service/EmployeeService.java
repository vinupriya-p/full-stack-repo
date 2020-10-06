package com.infosys.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.employee.repository.EmployeeRepository;
import com.infosys.employee.dto.EmployeeDTO;
import com.infosys.employee.model.Employee;

@Service
public class EmployeeService 
{


	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<EmployeeDTO> getAll()   
	{  
		List<Employee> employees = (List<Employee>) employeeRepository.findAll();  
		List<EmployeeDTO> employeeDTOs = new ArrayList<EmployeeDTO>();
		employees.forEach(employee -> employeeDTOs.add(Employee.toEmployeeDTO(employee))); 
		return employeeDTOs;  
	}  
	
	public void save(EmployeeDTO employeeDTO)   
	{  
		employeeRepository.save(EmployeeDTO.toEmployee(employeeDTO));  
	}  
	
	public EmployeeDTO getEmployeeById(int id)   
	{  
		 Employee employee = employeeRepository.findById(id).get();  
		 EmployeeDTO employeeDTO = Employee.toEmployeeDTO(employee);
		 return employeeDTO;
	}  
	
	public List<EmployeeDTO> getEmployeeByName(String name)
	{
		List<Employee> employees = (List<Employee>) employeeRepository.findAll();
		List<EmployeeDTO> employeeDTOs = new ArrayList<EmployeeDTO>();
		employees.stream()
				.forEach(employee -> employeeDTOs.add(Employee.toEmployeeDTO(employee)));

		return employeeDTOs.stream()
				.filter(employee->employee.getEmp_name().startsWith(name))
				.collect(Collectors.toList());
	}
	public void delete(int id)   
	{  
		employeeRepository.deleteById(id);  
	}  
	
}

