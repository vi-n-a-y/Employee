package com.vin.employeeDto;

public class SalaryDTO {
	private long empId;
	private double HRA;
	private double DA;
	private double MED;
	private double PF;
	private double basicSalary;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public double getHRA() {
		return HRA;
	}
	public void setHRA(double hRA) {
		HRA = hRA;
	}
	public double getDA() {
		return DA;
	}
	public void setDA(double dA) {
		DA = dA;
	}
	public double getMED() {
		return MED;
	}
	public void setMED(double mED) {
		MED = mED;
	}
	public double getPF() {
		return PF;
	}
	public void setPF(double pF) {
		PF = pF;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public SalaryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalaryDTO(long empId, double hRA, double dA, double mED, double pF, double basicSalary) {
		super();
		this.empId = empId;
		HRA = hRA;
		DA = dA;
		MED = mED;
		PF = pF;
		this.basicSalary = basicSalary;
	}
	@Override
	public String toString() {
		return "SalaryDTO [empId=" + empId + ", HRA=" + HRA + ", DA=" + DA + ", MED=" + MED + ", PF=" + PF
				+ ", basicSalary=" + basicSalary + "]";
	}
	
	
	

}
