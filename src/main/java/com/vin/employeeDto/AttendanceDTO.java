package com.vin.employeeDto;

import java.sql.Date;

public class AttendanceDTO {
	private long empId;
	private String firstHalf;
	private String secondHalf;
	private Date date;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getFirstHalf() {
		return firstHalf;
	}
	public void setFirstHalf(String firstHalf) {
		this.firstHalf = firstHalf;
	}
	public String getSecondHalf() {
		return secondHalf;
	}
	public void setSecondHalf(String secondHalf) {
		this.secondHalf = secondHalf;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public  AttendanceDTO(long empId, String firstHalf, String secondHalf, Date date) {
		super();
		this.empId = empId;
		this.firstHalf = firstHalf;
		this.secondHalf = secondHalf;
		this.date = date;
	}
	public  AttendanceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Attendance [empId=" + empId + ", firstHalf=" + firstHalf + ", secondHalf=" + secondHalf + ", date="
				+ date + "]";
	}
	
	
	

}
