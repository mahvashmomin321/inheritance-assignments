package com.capgemini.employeeapp.model;

public class MarketExecutive extends Employee {
	
	private double kilometerTravelled;
	private double tourAllowance;
	private double telephoneAllowance;
	
	
	public MarketExecutive(int employeeId, String employeeName, double basicSalary, double medical,double kilometerTravalled) {
		super(employeeId,employeeName,basicSalary,medical);
		this.kilometerTravelled=kilometerTravalled;
	}
	
	@Override
	public double findGrossSalary() {
		
		double grossSalary;
		telephoneAllowance=1500;
		tourAllowance=5*kilometerTravelled;
		grossSalary=super.findGrossSalary() + tourAllowance + telephoneAllowance; 
		setGrossSalary(grossSalary);
		return grossSalary;
	}
}


