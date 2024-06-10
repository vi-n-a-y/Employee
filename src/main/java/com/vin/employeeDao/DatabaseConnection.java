package com.vin.employeeDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection con = null;

		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeManagement", "root", "root");

		return con;

	}

	public static Connection closeConnection(Connection con) throws Exception {
		if (con != null) {
			con.close();
		}
		return con;
	}

}
