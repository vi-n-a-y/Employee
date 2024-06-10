package com.vin.employeeDto;

public class AdminDTO {
	
	private String adminId;
	private String name;
	private String password;
	private String mail;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "AdminDTO [adminId=" + adminId + ", name=" + name + ", password=" + password + ", mail=" + mail + "]";
	}

	public AdminDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminDTO(String adminId, String name, String password, String mail) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.password = password;
		this.mail = mail;
	}
	
	
	
	
}
