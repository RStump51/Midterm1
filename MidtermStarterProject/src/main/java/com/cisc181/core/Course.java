package com.cisc181.core;

import java.util.UUID;
//Setting Attributes for Course
public class Course {
	public UUID CourseID;
	public String CourseName;
	public int GradePoints;
	public String eMajor;
	//Getters and setters for course attributes
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	public String geteMajor() {
		return eMajor;
	}
	public void seteMajor(String eMajor) {
		this.eMajor = eMajor;
	}
	
	

}
