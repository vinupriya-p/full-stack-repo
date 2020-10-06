package com.infosys.employeeCourse.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.employeeCourse.model.EmployeeCourse;
import com.infosys.employeeCourse.repository.EmployeeCourseRepository;

@Service
public class EmployeeCourseService 
{

	@Autowired
	EmployeeCourseRepository employeeCourseRepository;
	
	public List<EmployeeCourse> getAll()   
	{  
		List<EmployeeCourse> employeeCourses = new ArrayList<EmployeeCourse>();  
		employeeCourseRepository.findAll().forEach(course -> employeeCourses.add(course));  
		return employeeCourses;  
	}  
	
	public void save(EmployeeCourse employeeCourse)   
	{  
		employeeCourseRepository.save(employeeCourse);  
	}  
	
	public EmployeeCourse getEmployeeCourseById(int id)   
	{  
		return employeeCourseRepository.findById(id).get();  
	}  
	
	public void delete(int id)   
	{  
		employeeCourseRepository.deleteById(id);  
	}  
	
}
