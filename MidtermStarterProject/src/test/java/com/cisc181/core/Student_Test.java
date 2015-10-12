package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		ArrayList<String> Course = new ArrayList<String>();
		ArrayList<String> Section = new ArrayList<String>();
		ArrayList<String> Student = new ArrayList<String>();

		ArrayList<String> Semester = new ArrayList<String>();
		Semester.add("Fall");
		Semester.add("Spring");
		Course.add(123,"Physics", 89, PHYSICS);
		Course.add(124,"CISC", 81, CISC);
		Course.add(125,"Chemistry", 91, CHEM);
		Section.add(10, "10");
		Section.add(11, "11");
		Section.add(12, "12");
		Section.add(13, "13");
		Section.add(14, "14");
		Section.add(15, "15");
		Student(String FirstName, String MiddleName, String LastName,Date DOB, String Major,
				String Address, String Phone_number, String Email)
		Student.add("Dave", "Moss", 5-7-1995, "CISC", "123 South Street", "302-444-5555", "DMoss@udel.edu");
		Student.add("Jack", "Reiger", 2-28-1996, "Business", "34 North Street", "610-999-0987", "JRieger@udel.edu");
		Student.add("Sam", "Furio", 10-4-1995, "Econ", "45 West Street", "484-999-0099", "SFurio@udel.edu");
		Student.add("Jimmy", "Ford", 10-17-1996, "Engineering", "78 East Street", "565-888-0999", "JFord@udel.edu");
		Student.add("John", "Stefanidis", 3-8-1996, "Leadership", "55 Gromble Street", "657-888-9908", "JStef@udel.edu");
		Student.add("Nick", "Albenzi", 12-12-1995, "Nutrition", "1234 Jones Way", "610-987-0099", "NAl@udel.edu");
		Student.add("Seth", "Martinez", 2-26-1996, "Engineering", "55 Elkton Street", "232-887-0099", "SMart@udel.edu");
		Student.add("Cole", "Fetcho", 2-16-1996, "Math", "44 Haines Street", "789-009-9987", "CFetch@udel.edu");
		Student.add("Claude", "Giroux", 3-14-1994, "Kinesiology", "12 Broad Street", "484-778-0099", "G@udel.edu");
		Student.add("Wayne", "Simmons", 5-9-1995, "Chemistry", "13 Broad Street", "610-987-0977", "WS@udel.edu");




		

	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void GPA_Test() {
		assertEquals(Student[0] = 3.2);
		assertEquals(Student[1] = 3.0);
		assertEquals(Student[2] = 3.3);
		assertEquals(Student[3] = 3.0);
		assertEquals(Student[4] = 2.0);
		assertEquals(Student[5] = 2.9);
		assertEquals(Student[6] = 3.5);
		assertEquals(Student[7] = 3.8);
		assertEquals(Student[8] = 3.2);
		assertEquals(Student[9] = 3.7);
	}
	@Test
	public void avg_grade(){
		assertEquals(Course[0] == 85);
		assertEquals(Course[1] == 82);
		assertEquals(Course[2] == 87);
	
		
	}
	public void change_major(){
		Student[0][3] = "Physics";
	}

}
