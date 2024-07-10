package com.vin.employeeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vin.employeeDto.AdminDTO;
import com.vin.employeeDto.EmployeeDTO;
import com.vin.employeeDto.SalaryDTO;

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

		} else
			return false;

	}

	public boolean registerEmployee(EmployeeDTO empDto) {
		String query = "insert into employeedetails (name,gender,age,mail,jobRole,phone)" + "values" + "('"
				+ empDto.getName() + "','" + empDto.getGender() + "','" + empDto.getAge() + "','" + empDto.getMail()
				+ "','" + empDto.getJobRole() + "','" + empDto.getPhone() + "')";
		System.out.println(query);

		try {
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.executeUpdate();
			DatabaseConnection.closeConnection(con);
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
		return true;

	}

	public EmployeeDTO getEmployeeDetails(int id) throws Exception {
		String str = "select * from employeedetails where empId='" + id + "'";
		System.out.println(str);
		EmployeeDTO empl = new EmployeeDTO();

		Connection con = DatabaseConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(str);
		if (rs.next()) {
			empl.setEmpId(rs.getLong("empId"));
			empl.setName(rs.getString("name"));
			empl.setAge(rs.getInt("age"));
			empl.setGender(rs.getString("gender"));
			empl.setMail(rs.getString("mail"));
			empl.setJobRole(rs.getString("jobrole"));
			empl.setPhone(rs.getString("phone"));
		}
		DatabaseConnection.closeConnection(con);
		if (empl.getEmpId() == 0) {
			return null;
		} else

			return empl;
	}

	public boolean updateEmployee(EmployeeDTO emp) {

		String query = "update employeedetails set name='" + emp.getName() + "',age='" + emp.getAge() + "',gender='"
				+ emp.getGender() + "',mail='" + emp.getMail() + "',jobRole='" + emp.getJobRole() + "',phone='"
				+ emp.getPhone() + "'where empId='" + emp.getEmpId() + "'";

		System.out.println(query);

		try {
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.execute();
			DatabaseConnection.closeConnection(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public SalaryDTO getSalary(Long empId) {
		String query = "select * from salary where empId='" + empId + "'";
		System.out.println(query);

		SalaryDTO sal = new SalaryDTO();
		try {
			Connection con = DatabaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			if (rs.next()) {
				sal.setEmpId(rs.getLong("empId"));
				sal.setHRA(rs.getDouble("HRA"));
				sal.setDA(rs.getDouble("DA"));
				sal.setMED(rs.getDouble("MED"));
				sal.setPF(rs.getDouble("PF"));
				sal.setBasicSalary(rs.getDouble("basicSalary"));
				System.out.println(sal.getBasicSalary());
			}
			DatabaseConnection.closeConnection(con);
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (sal.getEmpId() == 0) {
			return null;
		} else
			return sal;

	}

	public boolean addSalary(SalaryDTO sal) {
		String query = "insert into salary (empId,HRA,DA,MED,PF,basicSalary) values('" + sal.getEmpId() + "','"
				+ sal.getHRA() + "','" + sal.getDA() + "','" + sal.getMED() + "','" + sal.getPF() + "','"
				+ sal.getBasicSalary() + "')";
		System.out.println(query);

		try {
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.execute();
			DatabaseConnection.closeConnection(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;

	}

	public boolean updateSalary(SalaryDTO upSal) {

		String query = "update salary set hra='" + upSal.getHRA() + "',da='" + upSal.getDA() + "',med='"
				+ upSal.getMED() + "',pf='" + upSal.getPF() + "',basicSalary='" + upSal.getBasicSalary()
				+ "' where empId='" + upSal.getEmpId() + "'";
		System.out.println(query);

		try {
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.execute();
			DatabaseConnection.closeConnection(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;

	}
	
	
	public boolean removeEmployee(long id) {
		String query1="delete from salary where EmpId='"+id+"'";
		String query2="delete from employeeDetails where EmpId='"+id+"'";
		System.out.println(query1);
		System.out.println(query2);
		Connection con=null;
		try {
			 con=DatabaseConnection.getConnection();
			PreparedStatement ps1=con.prepareStatement(query1);
			PreparedStatement ps2=con.prepareStatement(query2);
			ps1.execute();
			ps2.execute();
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
		finally {
			try {
				DatabaseConnection.closeConnection(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
		
	}


	public AttendanceDTO getAttendance(Long empId) {
		String query = "select * from attendance where empId='" + empId + "'";
		System.out.println(query);

		AttendanceDTO attend = new AttendanceDTO();
		try {
			Connection con = DatabaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			if (rs.next()) {
				attend.setEmpId(rs.getLong("empId"));
				attend.setDate(rs.getDate("date"));
				attend.setFirstHalf(rs.getString("firstHalf"));
				attend.setSecondHalf(rs.getString("secondHalf"));

			}
			DatabaseConnection.closeConnection(con);
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (attend.getEmpId() == 0) {
			return null;
		} else
			return attend;

	}	

}

//String str1 = "insert into admin(name,password,mail)" +"values ('" + admin.getName() + "','" + admin.getPassword()
//+ "','" + admin.getMail() + "')";

// String str = "insert into admin"+ "(name,password,mail) values "+"(?,?,?)";

//ps.setString(1,admin.getName() );
//ps.setString(2,admin.getPassword());
//ps.setString(3, admin.getMail());
