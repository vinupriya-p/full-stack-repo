package com.infosys.employeeTraining.model;

import java.io.Serializable;

//import javax.persistence.Embeddable;


public class EmployeeTrainingId implements Serializable{

	
	private int empId;
	
	private int courseId;
	
	public EmployeeTrainingId()
	{
		
	}
	
	public EmployeeTrainingId(int emp_id, int course_id) {
		super();
		this.empId = emp_id;
		this.courseId = course_id;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseId;
		result = prime * result + empId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeTrainingId other = (EmployeeTrainingId) obj;
		if (courseId != other.courseId)
			return false;
		if (empId != other.empId)
			return false;
		return true;
	}
	
}
