package com.vin;
import com.vin.employeeDto.EmployeeDTO;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeeManagement extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EmployeeManagement() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		EmployeeDTO emp=new EmployeeDTO();
		
		long empId=Long.parseLong(request.getParameter("empId"));
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String mail=request.getParameter("mail");
		String jobRole=request.getParameter("jobRole");
		Double salary=Double.parseDouble(request.getParameter("salary"));
		System.out.println(name);
		emp.setName(name);
		emp.setEmpId(empId);
//		emp.setPassword(pass);
//		emp.setAddress(address);
		
		
		
		
		
	
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
