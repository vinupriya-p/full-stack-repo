package com.infosys.employeeTraining.model;

import java.sql.Date;



//import java.util.Date;


//import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.infosys.employeeTraining.dto.EmployeeTrainingDTO;

@Entity
@IdClass(EmployeeTrainingId.class)
public class EmployeeTraining {

//	@EmbeddedId
//	private EmployeeTrainingId employeeTrainingId = new EmployeeTrainingId();
	
	@Id
	@JsonProperty("emp_id")
	private int empId;

	@Id
	@JsonProperty("course_id")
	private int courseId;

	private int score;
	private int hours_spent;
	
//	@Temporal(TemporalType.DATE)
//	@JsonFormat(pattern="dd-MM-yyyy")
	private Date date_completed;
	
	private String status;



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
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

	public int getHours_spent() {
		return hours_spent;
	}

	public void setHours_spent(int hours_spent) {
		this.hours_spent = hours_spent;
	}
	
	public static EmployeeTrainingDTO toEmployeeTrainingDTO(EmployeeTraining employeeTraining)
	{

		EmployeeTrainingDTO employeeTrainingDTO = new EmployeeTrainingDTO();
		employeeTrainingDTO.setEmp_id(employeeTraining.getEmpId());
		employeeTrainingDTO.setCourse_id(employeeTraining.getCourseId());
		employeeTrainingDTO.setScore(employeeTraining.getScore());
		employeeTrainingDTO.setDate_completed(employeeTraining.getDate_completed());
		employeeTrainingDTO.setHours_spent(employeeTraining.getHours_spent());
		employeeTrainingDTO.setStatus(employeeTraining.getStatus());
		return employeeTrainingDTO;
	}
}
