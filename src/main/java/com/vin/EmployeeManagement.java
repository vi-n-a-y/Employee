package com.vin;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeeManagement extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmployeeManagement() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		switch (action) {
		case "adminRegister":
			RegisterAdmin(request, response);
			break;

		case "adminLogin":
			loginAdmin(request, response);
			break;
		case "employeeRegister":
			registerEmployee(request,response);	
			break;	

		}

//		response.getWriter().append("Served at: ").append(request.getContextPath());

//		EmployeeDTO emp=new EmployeeDTO();
//		
//		long empId=Long.parseLong(request.getParameter("empId"));
//		String name=request.getParameter("name");
//		String gender=request.getParameter("gender");
//		String mail=request.getParameter("mail");
//		String jobRole=request.getParameter("jobRole");
//		Double salary=Double.parseDouble(request.getParameter("salary"));
//		System.out.println(name);
//		emp.setName(name);
//		emp.setEmpId(empId);
//		emp.setPassword(pass);
//		emp.setAddress(address);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	public void loginAdmin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
	}

	public void RegisterAdmin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String mail = request.getParameter("mail");
	}

	public void registerEmployee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			}

}

//use employeeManagement;
//create table employeeDetails(
//empId int primary key auto_increment,
//name varchar(255) not null,
//gender varchar(20) not null,
//age int not null,
//mail varchar(255) unique,
//jobRole varchar(50) not null,
//salary double not null,
//phone varchar(20) unique);
