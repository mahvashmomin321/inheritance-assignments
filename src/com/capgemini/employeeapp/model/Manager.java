package com.capgemini.employeeapp.model;

public class Manager extends Employee {
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	
	public Manager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId,employeeName,basicSalary,medical);
		this.petrolAllowance= basicSalary* 0.08;
		this.foodAllowance= basicSalary * 0.13;
		this.otherAllowance=basicSalary * 0.03;
	}
	
	
	@Override
	public double findGrossSalary() {

		double managerGrossSalary;
		managerGrossSalary=super.findGrossSalary() + petrolAllowance + foodAllowance + otherAllowance; 
		setGrossSalary(managerGrossSalary);
		return managerGrossSalary;
	}
	

	
}
