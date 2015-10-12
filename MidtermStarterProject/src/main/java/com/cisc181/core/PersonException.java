package com.cisc181.core;

import java.util.Date;
import java.util.regex.Pattern;

import org.junit.Test;

public class PersonException extends Exception {
	Date Current_Date = 10-11-2015;
	exception e = getDOB() + 100 > Current_Date;

	public PersonException() {
		super();
		
		
	}
	@Test 
	public void DOB_Test(){
		try{
			Date DOB = getDOB();  
		}
		catch(exception e throw)
	}
	String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
	 
	Pattern pattern = Pattern.compile(regex);
	 
	for(String phone : getPhone())
	{
	    Matcher matcher = pattern.matcher(Phone_number);
	    
	}


	
	}


