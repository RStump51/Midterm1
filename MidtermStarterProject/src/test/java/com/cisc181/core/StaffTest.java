package com.cisc181.core;

import static org.junit.Assert.*;

import java.awt.geom.Arc2D.Double;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StaffTest {
	ArrayList<Double> StaffList = new ArrayList<Double>();
	double avg_salary;
	double first;
	double second;
	double third;
	double fourth;
	double fifth;
	Exception e;
	
	
	

	
	@Before
	public void setUp() throws Exception {
		first = StaffList.add(100000);
		second =StaffList.add(150000);
		third = StaffList.add(80000);
		fourth = StaffList.add(50000);
		fifth = StaffList.add(75000);
		avg_salary = (first + second + third + fourth + fifth) / 2;
		
	}
	
	@After
	public void tearDown() throws Exception {
		StaffList = null;
	}

	@Test
	public void AverageSalaryTest() {
		
		assertTrue(avg_salary == 91,000.00);
	}
	@Test
	public void phonenumber_DOB_test(){
		assertTrue(Staff(DOB) == e);
		assertTrue(Staff(Phone_number) == e);
		
	}


}
