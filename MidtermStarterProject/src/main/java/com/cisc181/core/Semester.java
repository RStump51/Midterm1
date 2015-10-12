package com.cisc181.core;

import java.util.Date;
import java.util.UUID;
//Attributes for Semester
public class Semester {
	public UUID SemesterID;
	public Date StartDate;
	public Date EndDate;
	//Getters and setters for attributes
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
	

}
