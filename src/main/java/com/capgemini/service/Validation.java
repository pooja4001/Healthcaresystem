package com.capgemini.service;

import java.util.regex.Pattern;

import com.capgemini.dto.DiagnosticCenter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;

@SuppressWarnings("unused")
public class Validation {
	
	HealthCareServiceImpl siv = new HealthCareServiceImpl();
	
	public boolean validateCenterName(String centerName)
	{
		if(!centerName.matches("[A-Z][a-z,A-Z,0-9,\\s]*"))
		{
			System.out.println("\n*Note:| Center name should not be blank             |\n      | fist letter should be capital Alphabet only |\n      | Name should not be there in Center list     |");
			return false;
		}
		else if(siv.isCenterNamePresent(centerName))
		{
			System.out.println("Center Name already exist in the list");
			return false;
		}
		return true;
	}
	
	public boolean validateCenterId(String centerId)
	{
		if(centerId.matches(""))
		{
			System.out.println("Center Id  can not be Null");
			return false;
		}
		else if(!siv.isCenterIdPresent(centerId))
		{
			System.out.println("Center Id does not exit in the center list");
			return false;
		}
		
		return true;
	}
	
	public boolean validateCenterTest(DiagnosticCenter centerObject,String testName)
	{
		
		if(!testName.matches("[A-Z][a-z,A-Z,0-9,\\s]*"))
		{
			System.out.println("\n*Note:| Test name should not be blank               |\n      | fist letter should be capital Alphabet only |\n      | Name should not be there in Test list       |");
			return false;
		}
		else if(siv.isTestNamePresent(centerObject,testName))
		{
			System.out.println("Test Name already there in the test list of "+centerObject.getCenterName());
			return false;
		}
		return true;
	}
	
	public boolean validateCenterTestId(DiagnosticCenter centerObject,String testId)
	{
		if(testId.matches(""))
		{
			System.out.println("Test Id  can not be Null");
			return false;
		}
	else if(!siv.isTestIdPresent(centerObject, testId))
		{
			System.out.println("Entered Test Id does not exit in the test list of "+centerObject.getCenterName());
			return false;
		}
		return true;
	}
	
//public boolean validateDate(String dateToValidate, String dateFromat){
//		
//		if(dateToValidate == null){
//			return false;
//		}
//		
//		SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
//		sdf.setLenient(true);
//		
//		try {
//			
//			//if not valid, it will throw ParseException
//			Date date = sdf.parse(dateToValidate);
//			//System.out.println(date);
//		
//		} catch (ParseException e) {
//			
//			e.printStackTrace();
//			return false;
//		}
//		
//		return true;
//	}

	public boolean validateDate(String date) {
		
		String regex = "^(1[0-2]|0[1-9])/(3[01]"
                + "|[12][0-9]|0[1-9])/[0-9]{4}$"; 
		Pattern pattern = Pattern.compile(regex); 
		Matcher matcher = pattern.matcher((CharSequence)date); 
		return matcher.matches(); 
//		if(matcher.matches())
//		{
//		Date dd = new Date(date);
//		Date now = new Date();
//		System.out.println(dd);
//		System.out.println(now);
//		if(dd.before(now))
//			return false;
//		return true;
//		}
//		return false;
	}
	

}
