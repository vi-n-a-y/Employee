package com.vin.employeeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.vin.employeeDto.EmployeeDTO;

public class EmployeeDAO {
	
	public int registerEmployee(EmployeeDTO emp)throws Exception {
		EmployeeDTO empl=new EmployeeDTO();
		String st="insert into emp(name,gender,age,mail,jobRole,salary,phone) values ("+empl.getName()+","+empl.getGender()+","+empl.getAge()+","
		                    +empl.getMail()+","+empl.getJobRole()+","+empl.getSalary()+","+empl.getPhone()+")";
		
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement ps=con.prepareStatement(st);
		
		
		
		int update=ps.executeUpdate();
		DatabaseConnection.closeConnection(con);
		System.out.println(update);
		return update;
				
	}
	
	
	

}
//		ps.setString(0, empl.getName());
//		ps.setString(1, empl.getGender());
//		ps.setInt(2,empl.getAge());
//		ps.setString(3,empl.getMail());
//		ps.setString(4,empl.getJobRole());
//		ps.setDouble(5, empl.getSalary());
//		ps.setString(6,empl.getPhone());

