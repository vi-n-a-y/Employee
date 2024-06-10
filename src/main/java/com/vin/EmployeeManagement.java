package com.vin;

import java.io.IOException;
import java.sql.SQLException;

import com.vin.employeeDao.EmployeeDAO;
import com.vin.employeeDto.AdminDTO;
import com.vin.employeeDto.EmployeeDTO;

import jakarta.servlet.RequestDispatcher;
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

			try {
				registerAdmin(request, response);
			} catch (ClassNotFoundException |  SQLException e) {

				e.printStackTrace();
			}

			break;

		case "adminLogin":

			try {
				loginAdmin(request, response);
			} catch (ClassNotFoundException | ServletException | IOException | SQLException e) {

				e.printStackTrace();
			}

			break;
		case "employeeRegister":
			registerEmployee(request, response);
			break;

		case "getEmployeeDetails":
			try {
				getEmployeeDetails(request, response);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		default:
			System.out.println("in switch case");

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	public void loginAdmin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		EmployeeDAO emp = new EmployeeDAO();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(name + " " + password);
		RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
		if (emp.adminLogin(name, password)) {
			rd.forward(request, response);
			System.out.println("login success");
		}

	}

	public void registerAdmin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException, ClassNotFoundException {

		EmployeeDAO emp = new EmployeeDAO();
		String name = request.getParameter("name1");
		String password = request.getParameter("password");
		String mail = request.getParameter("mail");
		AdminDTO admin = new AdminDTO();
		admin.setName(name);
		admin.setPassword(password);
		admin.setMail(mail);
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		if (emp.registerAdmin(admin)) {
			rd.forward(request, response);

		}

	}

	public void registerEmployee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String mail = request.getParameter("mail");
		String jobRole = request.getParameter("jobRole");
		Double salary = Double.parseDouble(request.getParameter("salary"));
		String phone = request.getParameter("phone");
		EmployeeDAO empDao = new EmployeeDAO();
		EmployeeDTO empDto = new EmployeeDTO();
		empDto.setName(name);
		empDto.setAge(age);
		empDto.setGender(gender);
		empDto.setMail(mail);
		empDto.setJobRole(jobRole);
		empDto.setSalary(salary);
		empDto.setPhone(phone);
		RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
		if (empDao.registerEmployee(empDto)) {
			rd.forward(request, response);

			System.out.println("register success");

		}

		System.out.println(name);

	}

	public void getEmployeeDetails(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, SQLException {
		int id = Integer.parseInt(request.getParameter("empId"));
		EmployeeDAO emp = new EmployeeDAO();
		EmployeeDTO empl = emp.getEmployeeDetails(id);
		System.out.println(empl.getName());

	}

}

//create database employeeManagement;
//use employeeManagement;
//show tables;
//select * from employeedetails;
//insert into employeedetails(name,gender,age,mail,jobRole,salary,phone)
// values ("vinay","male",23,"vinay@eg.com","developer",23000,"9215487623");
// select * from employeedetails;
// create table admin(
// admin_id int auto_increment primary key,
// userName varchar(50) unique,
// password varchar(30) not null,
// mail varchar(255) unique);
// insert into admin ( userName,password,mail) values ("vinay","vinay","vinay@eg.com");
// select * from admin;
// 
// ALTER TABLE admin
//RENAME COLUMN userName to name;
