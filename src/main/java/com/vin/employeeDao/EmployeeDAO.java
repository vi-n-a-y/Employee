package com.vin.employeeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vin.employeeDto.AdminDTO;
import com.vin.employeeDto.EmployeeDTO;

public class EmployeeDAO {

//	public boolean registerEmployee(EmployeeDTO empl) throws Exception {
//
//		String st = "insert into emp(name,gender,age,mail,jobRole,salary,phone) values (" + empl.getName() + ","
//				+ empl.getGender() + "," + empl.getAge() + "," + empl.getMail() + "," + empl.getJobRole() + ","
//				+ empl.getSalary() + "," + empl.getPhone() + ")";
//
//		Connection con = DatabaseConnection.getConnection();
//		PreparedStatement ps = con.prepareStatement(st);
//		boolean update = ps.execute();
//		ps.execute();
//		DatabaseConnection.closeConnection(con);
//		System.out.println(update);
//		return update;
//
//	}

	public boolean registerAdmin(AdminDTO admin) {
		System.out.println(admin.getName());
		String str = "insert into admin(name,password,mail)" + "values('" + admin.getName() + "','"
				+ admin.getPassword() + "','" + admin.getMail() + "')";

		System.out.println(str);


		Connection con;
		try {
			con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(str);
			ps.execute();
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return true;

	}

	public boolean adminLogin(String name, String password) throws ClassNotFoundException, SQLException {
		String str = "select * from admin where name='" + name + "' and password='" + password + "'";
		System.out.println(str);
		Connection con = DatabaseConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(str);
		if (rs.next()) {
			return true;

		}else
		return false;

	}

	public boolean registerEmployee(EmployeeDTO empDto) {
		String query = "insert into employeedetails (name,gender,age,mail,jobRole,salary,phone)" + "values" + "('"
				+ empDto.getName() + "','" + empDto.getGender() + "','" + empDto.getAge() + "','" + empDto.getMail()
				+ "','" + empDto.getJobRole() + "','" + empDto.getPhone() + "')";
		System.out.println(query);

		try {
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
		return true;

	}
	
	public EmployeeDTO getEmployeeDetails(int id) throws ClassNotFoundException, SQLException {
		String str="select * from employeedetails where empId='"+id+"'";
		System.out.println(str);
		EmployeeDTO empl=new EmployeeDTO();
		
		Connection con=DatabaseConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(str);
		if(rs.next()) {
			empl.setEmpId(rs.getLong("empId"));
			empl.setName(rs.getString("name"));
			empl.setAge(rs.getInt("age"));
			empl.setGender(rs.getString("gender"));
			empl.setMail(rs.getString("mail"));
			empl.setJobRole(rs.getString("jobrole"));
//			empl.setSalary(rs.getDouble("salary"));
			empl.setPhone(rs.getString("phone"));
		}if(empl.getEmpId()==0) {
			return null;
		}
			return empl;
	}
	
	public boolean updateEmployee(EmployeeDTO emp) {
		
		String query="update employeedetails set name='"+emp.getName()+"','"+emp.getAge()+"','"+emp.getGender()+"','"+emp.getMail()+"','"+emp.getJobRole()+"','"+emp.getPhone()+"'where id='"+emp.getEmpId()+"'";
		
				System.out.println(query);
		   
		
		 
		try {
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement(query);
			ps.execute();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
		
		
		return true;
	}


}


//String str1 = "insert into admin(name,password,mail)" +"values ('" + admin.getName() + "','" + admin.getPassword()
//+ "','" + admin.getMail() + "')";

// String str = "insert into admin"+ "(name,password,mail) values "+"(?,?,?)";



//ps.setString(1,admin.getName() );
//ps.setString(2,admin.getPassword());
//ps.setString(3, admin.getMail());

