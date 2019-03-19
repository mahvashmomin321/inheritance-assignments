package com.capgemini.employeeapp.model;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double medical;
	private double grossSalary;
	private double netSalary;
	

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}
	
	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	
	
	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double findGrossSalary() {
		double hra=basicSalary * (0.5);
		grossSalary= basicSalary + (hra) + medical;
		return grossSalary;
	}

	public double findNetSalary() {
		double pf=basicSalary*0.12;
		double pt=200;
		netSalary= getGrossSalary()-(pt+pf);
		return netSalary;
	}

}
