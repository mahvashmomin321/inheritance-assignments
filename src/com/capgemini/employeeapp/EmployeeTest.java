package com.capgemini.employeeapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employeeapp.model.Employee;

public class EmployeeTest {

	private Employee employee1;

	@Before
	public void setUp() {
		 employee1 = new Employee(101, "John", 24000, 2000);
	}

	@Test
	public void testEmployeeObjectIsCreatedWithDefaultConstructor() {
		Employee employee1 = new Employee();
		assertNotNull(employee1);
	}

	@Test
	public void testEmployeeObjectIsCreatedWithParameterizedConstructor() {
		Employee employee1 = new Employee(101, "John", 24000, 2000);
		assertNotNull(employee1);
		assertEquals(101, employee1.getEmployeeId());
		assertEquals("John", employee1.getEmployeeName());
		assertEquals(24000, employee1.getBasicSalary(),0.01);
		assertEquals(2000, employee1.getMedical(),0.01);
	}


	@Test
	public void testGrossSalary() {
		 employee1.findGrossSalary();
		assertEquals(38000.0,employee1.getGrossSalary(),0.01);
	}
	
	@Test
	public void testNetSalary() {
		employee1.findGrossSalary();
		employee1.findNetSalary();
		assertEquals(34920.0,employee1.getNetSalary(),0.01);
	}

}
