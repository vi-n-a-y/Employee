package com.vin.employeeDto;

import java.sql.Date;

public class EmployeeDTO {
	private long empId;
	private String name;
	private String gender;
	private String mail;
	private String jobRole;
	private double salary;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public EmployeeDTO() {
		super();
		
	}
	public EmployeeDTO(long empId, String name, String gender, String mail, String jobRole, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.mail = mail;
		this.jobRole = jobRole;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", name=" + name + ", gender=" + gender + ", mail=" + mail + ", jobRole="
				+ jobRole + ", salary=" + salary + "]";
	}

	
	

	
	
	

}
