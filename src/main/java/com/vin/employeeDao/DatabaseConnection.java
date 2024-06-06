package com.vin.employeeDao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
	public static Connection getConnection()  {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails","root","root");
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return con;
		
		
	}
	
	
	public static Connection closeConnection(Connection con) throws Exception{
	if(con!=null) {
		con.close();
	}
	return con;
	}

}
