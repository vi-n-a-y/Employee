package com.vin;

import java.io.IOException;
import java.sql.SQLException;

import com.vin.employeeDao.EmployeeDAO;
import com.vin.employeeDto.AdminDTO;
import com.vin.employeeDto.EmployeeDTO;
import com.vin.employeeDto.SalaryDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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

			registerAdmin(request, response);

			break;

		case "adminLogin":

			loginAdmin(request, response);

			break;
		case "employeeRegister":
			registerEmployee(request, response);
			break;

		case "getEmployeeDetails":
			try {
				getEmployeeDetails(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "updateEmployee":
			try {
				updateEmployeeDetails(request, response);
			} catch (IOException e) {

				e.printStackTrace();
			}
			break;

		case "getEmployeeDetailsForUpdate":
			try {
				getEmployeeDetailsForUpdate(request, response);
			} catch (ClassNotFoundException | SQLException | IOException e) {

				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "removeEmployee":
			try {
				removeEmployee(request,response);
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			break;

		case "viewSalary":
			System.out.println("in view salary switch case");
			viewSalary(request, response);
			
			break;
			
		case "viewUpdateSalary":
			viewSalary(request, response);
			break;	

		case "addSalary":
			addSalary(request, response);
			break;

		case "updateSalary":
			updateSalary(request, response);
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
			{
		EmployeeDAO emp = new EmployeeDAO();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(name + " " + password);
		RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
		try {
			if (emp.adminLogin(name, password)) {
				rd.forward(request, response);
				System.out.println("login success");
			}else {
				
				try {
					response.sendRedirect("error.jsp");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}																																																																																																																																																																																																																																																																												

	}
																																																														
	public void registerAdmin(HttpServletRequest request, HttpServletResponse response)
			 {

		EmployeeDAO emp = new EmployeeDAO();
		String name = request.getParameter("name1");
		String password = request.getParameter("password");
		String mail = request.getParameter("mail");
		AdminDTO admin = new AdminDTO();
		admin.setName(name);
		admin.setPassword(password);
		admin.setMail(mail);
		RequestDispatcher rd = request.getRequestDispatcher("/adminLogin.jsp");
		if (emp.registerAdmin(admin)) {
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else {
			try {
				response.sendRedirect("error.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void registerEmployee(HttpServletRequest request, HttpServletResponse response)
			 {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String mail = request.getParameter("mail");
		String jobRole = request.getParameter("jobRole");
//		Double salary = Double.parseDouble(request.getParameter("salary"));
		String phone = request.getParameter("phone");
		EmployeeDAO empDao = new EmployeeDAO();
		EmployeeDTO empDto = new EmployeeDTO();
		empDto.setName(name);
		empDto.setAge(age);
		empDto.setGender(gender);
		empDto.setMail(mail);
		empDto.setJobRole(jobRole);
//		empDto.setSalary(salary);
		empDto.setPhone(phone);
		RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
		if (empDao.registerEmployee(empDto)) {
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("register success");

		}

		System.out.println(name);

	}

	public boolean getEmployee(HttpServletRequest request, HttpServletResponse response)
			 {
		int id = Integer.parseInt(request.getParameter("empId"));
		System.out.println(id);
		EmployeeDAO emp = new EmployeeDAO();
		EmployeeDTO empl;
		HttpSession session = request.getSession();
		try {
			empl = emp.getEmployeeDetails(id);
			if (empl != null) {
				session.setAttribute("empl", empl);
				

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
		// System.out.println(request.getContextPath());
		// System.out.println(request.getPathInfo());
//		System.out.println("get server name  "+ request.getServerName());
//		System.out.println("get server port  "+request.getServerPort());
//		System.out.println("get path Translated : "+request.getPathTranslated());
//		System.out.println("get query string : "+request.getQueryString());
//		System.out.println("get Remote User : "+request.getRemoteUser());
//		System.out.println("get Request Uri : "+request.getRequestURI());
//		
//		System.out.println("get user principal : "+request.getUserPrincipal());


	}

	public void getEmployeeDetails(HttpServletRequest request, HttpServletResponse response)
			 {
		try {
			if (getEmployee(request, response)) {
				request.getRequestDispatcher("/viewEmployee.jsp").forward(request, response);
			}
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void getEmployeeDetailsForUpdate(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (getEmployee(request, response)) {
			request.getRequestDispatcher("/updateEmployee.jsp").forward(request, response);
		}

	}

	// System.out.println("getContextPath"+request.getContextPath());
//			System.out.println("getServletInfo"+ ServletContext.getRealPath(null));

	// System.out.println("getRequestURl :"+request.getRequestURL());
	// System.out.println("getServletName :"+request.getServerName());
	// System.out.println(response.encodeRedirectURL(getServletInfo()));
	// System.out.println(response.getContentType());
//			System.out.println(request.getPathInfo());

	public  void updateEmployeeDetails(HttpServletRequest request, HttpServletResponse response) throws IOException
			 {

		int empId = Integer.parseInt(request.getParameter("empId"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String mail = request.getParameter("mail");
		String jobRole = request.getParameter("jobRole");
//		Double salary = Double.parseDouble(request.getParameter("salary"));
		String phone = request.getParameter("phone");
		EmployeeDTO emp = new EmployeeDTO(empId, name, gender, age, mail, jobRole, phone);
		EmployeeDAO empDao = new EmployeeDAO();

		if (empDao.updateEmployee(emp)) {
			System.out.println("details updated successfully");
			try {
				request.getRequestDispatcher("/viewEmployee.jsp").forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			response.sendRedirect("employeeDetails.jsp");
		}

	}
	
	
	public void removeEmployee(HttpServletRequest request, HttpServletResponse response)throws Exception {
		long id=Long.parseLong(request.getParameter("empId"));
	EmployeeDAO emp=new EmployeeDAO();
	if(emp.removeEmployee(id)) {
		System.out.println("removed success fully");
		request.getRequestDispatcher("/employeeDetails.jsp").forward(request, response);
	}else {
		response.sendRedirect("removeEmployee.jsp");
	}
		
		
	}

	public void viewSalary(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		EmployeeDAO empDao = new EmployeeDAO();
		Long id = Long.parseLong(request.getParameter("empId"));
		SalaryDTO salDto = empDao.getSalary(id);
		String action=request.getParameter("action");
		
		if (salDto != null) {
			HttpSession session = request.getSession();
			session.setAttribute("salDto", salDto);
			if(action.equals("viewSalary")) {
				
				request.getRequestDispatcher("/viewSalary.jsp").forward(request, response);

			}else {
				request.getRequestDispatcher("/updateSalary.jsp").forward(request, response);
				
			}
		} else {
			response.sendRedirect("salary.jsp");
		}
		
		

	}

	public void addSalary(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("empId"));
		double hra = Double.parseDouble(request.getParameter("HRA"));

		double da = Double.parseDouble(request.getParameter("DA"));
		double med = Double.parseDouble(request.getParameter("MED"));
		double pf = Double.parseDouble(request.getParameter("PF"));
		double basicSalary = Double.parseDouble(request.getParameter("basicSalary"));
		SalaryDTO addSal = new SalaryDTO(id, hra, da, med, pf, basicSalary);
		System.out.println(addSal);
		EmployeeDAO empDao = new EmployeeDAO();
		if (empDao.addSalary(addSal)) {
			request.getRequestDispatcher("/salary.jsp").forward(request, response);
		} else {
			response.sendRedirect("home.jsp");
		}

	}

	public void updateSalary(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		long id = Long.parseLong(request.getParameter("empId"));
		double hra = Double.parseDouble(request.getParameter("HRA"));
		double da = Double.parseDouble(request.getParameter("DA"));
		double med = Double.parseDouble(request.getParameter("MED"));
		double pf = Double.parseDouble(request.getParameter("PF"));
		double basicSalary = Double.parseDouble(request.getParameter("basicSalary"));
		SalaryDTO updateSal = new SalaryDTO(id, hra, da, med, pf, basicSalary);

		EmployeeDAO empDao = new EmployeeDAO();
		if (empDao.updateSalary(updateSal)) {
			

			request.getRequestDispatcher("/salary.jsp").forward(request, response);
		} else {
			response.sendRedirect("home.jsp");
		}

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
