package com.capgemini.employeeapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.employeeapp.model.Manager;

public class ManagerTest {

	@Test
	public void testManagerGrossSalary() {
		Manager manager1= new Manager(101,"Deo",24000,2000);
		assertEquals(43760,manager1.findGrossSalary(),0.01);
	}

	@Test
	public void testManagerNetSalary() {
		Manager manager1= new Manager(101,"Deo",24000,2000);
		manager1.findGrossSalary();
		assertEquals(40680,manager1.findNetSalary(),0.01);
	}

}
