package com.vin.employeeDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.vin.employeeDto.EmployeeDTO;

public class EmployeeDAO {
	
	public int registerEmployee(EmployeeDTO emp)throws Exception {
		String st="insert into emp(name,mail,gender,jobRole,salary) values(?,?,?,?,?)";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
		PreparedStatement ps=con.prepareStatement(null);
		
		
		return 0;
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
