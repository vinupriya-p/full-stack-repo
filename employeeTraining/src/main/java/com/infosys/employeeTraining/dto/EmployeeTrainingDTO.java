package com.infosys.employeeTraining.dto;

import java.sql.Date;

import com.infosys.employeeTraining.model.EmployeeTraining;


public class EmployeeTrainingDTO 
{

	private int emp_id;

	private int course_id;
	
	private int score;
	private int hours_spent;
	
	private Date date_completed;
	
	private String status;
	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getHours_spent() {
		return hours_spent;
	}

	public void setHours_spent(int hours_spent) {
		this.hours_spent = hours_spent;
	}

	public Date getDate_completed() {
		return date_completed;
	}

	public void setDate_completed(Date date_completed) {
		this.date_completed = date_completed;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public static EmployeeTraining toEmployeeTraining(EmployeeTrainingDTO employeeTrainingDTO)
	{

		EmployeeTraining employeeTraining = new EmployeeTraining();
		employeeTraining.setEmpId(employeeTrainingDTO.getEmp_id());
		employeeTraining.setCourseId(employeeTrainingDTO.getCourse_id());
		employeeTraining.setScore(employeeTrainingDTO.getScore());
		employeeTraining.setDate_completed(employeeTrainingDTO.getDate_completed());
		employeeTraining.setHours_spent(employeeTrainingDTO.getHours_spent());
		employeeTraining.setStatus(employeeTrainingDTO.getStatus());
		return employeeTraining;
	}
}
