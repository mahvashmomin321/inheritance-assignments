package com.capgemini.employeeapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.employeeapp.model.MarketExecutive;

public class MarketExecutiveTest {

	@Test
	public void testMarketExectuiveGrossSalary() {
		MarketExecutive marketexcutive= new MarketExecutive(101,"Deo",24000,2000,100);
		assertEquals(40000,marketexcutive.findGrossSalary(),0.01);
	}
	
	@Test
	public void testMarketExectuivenetSalary() {
		MarketExecutive marketexcutive= new MarketExecutive(101,"Deo",24000,2000,100);
		marketexcutive.findGrossSalary();
		assertEquals(36920,marketexcutive.findNetSalary(),0.01);
	}

}
