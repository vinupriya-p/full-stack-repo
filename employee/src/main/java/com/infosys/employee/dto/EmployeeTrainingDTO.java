package com.infosys.employee.dto;

import java.sql.Date;

public class EmployeeTrainingDTO 
{

	private int course_id;
	
	private int score;
	private int hours_spent;
	
	private Date date_completed;
	
	private String status;
	

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
	

}
