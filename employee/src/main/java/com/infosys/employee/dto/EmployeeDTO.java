package com.infosys.employee.dto;

import java.sql.Date;
import java.util.List;

import com.infosys.employee.model.Employee;



public class EmployeeDTO 
{
	
	private int emp_id;	
	private String emp_name;
	private String city;
	private long contact_number;
	private String emailAddress;
	
	private Date dob;
	

	private List<EmployeeTrainingDTO> employeeTrainings;
	
	
	public List<EmployeeTrainingDTO> getEmployeeTrainings() {
		return employeeTrainings;
	}

	public void setEmployeeTrainings(List<EmployeeTrainingDTO> employeeTrainings) {
		this.employeeTrainings = employeeTrainings;
	}

	
	public int getEmp_id() {
		return emp_id;
	}
	
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	

	
	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
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
	
	public EmployeeDTO() {
		
	}


	public EmployeeDTO(int emp_id, String emp_name, String city, long contact_number, String emailAddress, Date dob,
			List<EmployeeTrainingDTO> employeeTrainings) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.city = city;
		this.contact_number = contact_number;
		this.emailAddress = emailAddress;
		this.dob = dob;
		this.employeeTrainings = employeeTrainings;
	}

	public static Employee toEmployee(EmployeeDTO employeeDTO)
	{
		String[] name = employeeDTO.getEmp_name().split(" ");
		Employee employee = new Employee();
		employee.setEmp_id(employeeDTO.getEmp_id());
		if(name.length==3)
		{
			employee.setFirst_name(name[0]);
			employee.setMiddle_name(name[1]);
			employee.setLast_name(name[2]);
		}
		else if(name.length==2)
		{
			employee.setFirst_name(name[0]);
			employee.setMiddle_name("");
			employee.setLast_name(name[1]);
		}
		employee.setDob(employeeDTO.getDob());
		employee.setCity(employeeDTO.getCity());
		employee.setContact_number(employeeDTO.getContact_number());
		employee.setEmailAddress(employeeDTO.getEmailAddress());

		return employee;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [emp_id=" + emp_id + ", emp_name=" + emp_name + ", city=" + city + ", contact_number="
				+ contact_number + ", emailAddress=" + emailAddress + ", dob=" + dob + ", employeeTrainings="
				+ employeeTrainings + "]";
	}



	
}
