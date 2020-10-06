package com.infosys.employeeTraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.employeeTraining.dto.EmployeeTrainingDTO;
import com.infosys.employeeTraining.model.EmployeeTraining;
import com.infosys.employeeTraining.repository.EmployeeTrainingRepository;

@Service
public class EmployeeTrainingService 
{
	@Autowired
	EmployeeTrainingRepository employeeTrainingRepository;
	
	public List<EmployeeTrainingDTO> getAll()   
	{  
		List<EmployeeTraining> employeeTrainings = (List<EmployeeTraining>) employeeTrainingRepository.findAll();  
		List<EmployeeTrainingDTO> employeeTrainingDTOs = new ArrayList<EmployeeTrainingDTO>();
		employeeTrainings.forEach(employeeTraining -> employeeTrainingDTOs.add(EmployeeTraining.toEmployeeTrainingDTO(employeeTraining))); 
		return employeeTrainingDTOs; 
	}  
	
	public List<EmployeeTrainingDTO> getEmployeeTrainingById(int id)
	{
		List<EmployeeTraining> employeeTrainings = (List<EmployeeTraining>) employeeTrainingRepository.findByEmpId(id);
		List<EmployeeTrainingDTO> employeeTrainingDTOs = new ArrayList<EmployeeTrainingDTO>();
		employeeTrainings.forEach(employeeTraining -> employeeTrainingDTOs.add(EmployeeTraining.toEmployeeTrainingDTO(employeeTraining))); 
		return employeeTrainingDTOs; 
		
	}
	
}
