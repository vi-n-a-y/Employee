package com.vin.employeeDto;

public class EmployeeDTO {
	private long empId;
	private String name;
	private String gender;
	private int age;
	private String mail;
	private String jobRole;
	private String phone;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public EmployeeDTO() {
		super();
		
	}
	public EmployeeDTO(long empId, String name, String gender, int age, String mail, String jobRole, String phone) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.mail = mail;
		this.jobRole = jobRole;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", name=" + name + ", gender=" + gender + ", age=" + age + ", mail="
				+ mail + ", jobRole=" + jobRole + ", phone=" + phone + "]";
	}

}
