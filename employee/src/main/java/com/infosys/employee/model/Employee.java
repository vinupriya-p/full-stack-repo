package com.infosys.employee.model;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.Id;


import com.infosys.employee.dto.EmployeeDTO;

@Entity
public class Employee 
{
	
	@Id
	private int emp_id;
	
	private String first_name;
	private String middle_name;
	private String last_name;
	private String city;
	private long contact_number;
	private String emailAddress;
	
	private Date dob;
	
	
	public Employee() {
	
	}



	public Employee(int emp_id, String first_name, String middle_name, String last_name, String city,
			long contact_number, String emailAddress, Date dob) {
		super();
		this.emp_id = emp_id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.city = city;
		this.contact_number = contact_number;
		this.emailAddress = emailAddress;
		this.dob = dob;

	}




	public int getEmp_id() {
		return emp_id;
	}
	
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getMiddle_name() {
		return middle_name;
	}
	
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public long getContact_number() {
		return contact_number;
	}
	
	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public static EmployeeDTO toEmployeeDTO(Employee employee)
	{
		String name = (employee.getFirst_name()+" "+employee.getMiddle_name()).trim()+" "+employee.getLast_name();
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmp_id(employee.getEmp_id());
		employeeDTO.setEmp_name(name);

		employeeDTO.setDob(employee.getDob());
		employeeDTO.setCity(employee.getCity());
		employeeDTO.setContact_number(employee.getContact_number());
		employeeDTO.setEmailAddress(employee.getEmailAddress());

		return employeeDTO;
	}



	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", first_name=" + first_name + ", middle_name=" + middle_name
				+ ", last_name=" + last_name + ", city=" + city + ", contact_number=" + contact_number
				+ ", emailAddress=" + emailAddress + ", dob=" + dob +  "]";
	}
	

	
}

