package com.infosys.employeeCourse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.employeeCourse.model.EmployeeCourse;
import com.infosys.employeeCourse.service.EmployeeCourseService;

@RestController
public class EmployeeCourseController 
{

	@Autowired
	EmployeeCourseService employeeCourseService;
	
	@GetMapping(value = "/employee_course/getall")  
	public List<EmployeeCourse> getAll()   
	{  
		return employeeCourseService.getAll();  
	}  
	
	@PostMapping(value = "/employee_course")  
	private int save(@RequestBody EmployeeCourse employeeCourse)   
	{  
		employeeCourseService.save(employeeCourse);  
		return employeeCourse.getCourse_id();  
	}  
	
	@GetMapping(value = "/employee_course/{id}") 
	private EmployeeCourse getEmployeeCourse(@PathVariable("id") int id)   
	{  
		return employeeCourseService.getEmployeeCourseById(id);  
	}  
	
	@DeleteMapping(value = "/employee_course/{id}")  
	private void delete(@PathVariable("id") int id)   
	{  
		employeeCourseService.delete(id);  
	}  
	
}
