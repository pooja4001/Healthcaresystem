package com.capgemini.service;

import java.math.BigInteger;

import com.capgemini.dao.HealthCareDaoImpl;
import com.capgemini.dto.DiagnosticCenter;
import com.capgemini.util.*;
import com.capgemini.dto.Appointment;
import com.capgemini.dto.Test;

public class HealthCareServiceImpl implements HealthCareService {
	
	HealthCareDaoImpl hcdi = new HealthCareDaoImpl();
	
	public boolean addCenter(DiagnosticCenter center)
	{
		return hcdi.addCenter(center); //calling the addCenter method of the HealthCareDaoImpl class that interacts with the DiagnosticCenter arrayList.
	}
	
	public boolean removeCenter(DiagnosticCenter center)
	{
		return hcdi.removeCenter(center); //calling the removeCenter method of the HealthCareDaoImpl class that interacts with the DiagnosticCenter arrayList.
	}
	
	public String addTest(DiagnosticCenter center,Test test)
	{
		return hcdi.addTest(center,test); //calling the addTest method of the HealthCareDaoImpl class that interacts with the DiagnosticCenter arrayList and the objects respective Test ArrayList.
	}
	
	public boolean removeTest(DiagnosticCenter center,Test test)
	{
		return hcdi.removeTest(center,test);
	}
	
	public void viewCenters()
	{
		hcdi.viewCenters();
	}
	
	public void viewCentersAndTests()
	{
		hcdi.viewCentersAndTests();
	}
	
	public void viewCenterRepectiveTests(String centerId)
	{
		hcdi.viewCenterRepectiveTests(centerId);
	}
	
	public DiagnosticCenter getCenterObjectOfcenterId(String centerId)
	{
		return hcdi.getCenterObjectOfcenterId(centerId); //calling the getCenterObject method of the HealthCareDaoImpl class that interacts with the DiagnosticCenter arrayList.
	}
	
	public boolean isCenterNamePresent(String centerName)
	{
		return hcdi.isCenterNamePresent(centerName); //calling the getCenterObject method of the HealthCareDaoImpl class that interacts with the DiagnosticCenter arrayList.
	}
	
	public boolean isCenterIdPresent(String centerId)
	{
		return hcdi.isCenterIdPresent(centerId);
	}
	
	public Test getTestObject(DiagnosticCenter center, String testId) 
	{
		return hcdi.getTestObject(center, testId);
	}
	
	public boolean isTestNamePresent(DiagnosticCenter centerObject,String testName)
	{
		return hcdi.isTestNamePresent(centerObject,testName); //calling the getCenterObject method of the HealthCareDaoImpl class that interacts with the DiagnosticCenter arrayList.
	}
	
	public boolean isTestIdPresent(DiagnosticCenter centerObject,String testId)
	{
		return hcdi.isTestIdPresent(centerObject,testId); //calling the getCenterObject method of the HealthCareDaoImpl class that interacts with the DiagnosticCenter arrayList.
	}
	public boolean makeAppointment(BigInteger appointmentid, DiagnosticCenter center, Test test, String date, boolean approved){

		return hcdi.makeAppointment(appointmentid, center, test, date, approved);
	}
	public boolean addAppointment(Appointment appointment){
		return hcdi.addAppointment(appointment);
	}
	
	public void viewAppointments(){
		System.out.println("AppointmentId"+"   "+"Date"+"            "+"Center"+"         "+"Test"+"            "+"Approval");
		System.out.println();

		for(Appointment ap:HealthCareDataBase.AppointmentList)
		{
			System.out.println(ap.getAppointmentid()+"          "+ap.getDate()+"     "+ap.getCenterid()+"        "+ap.getTestid()+"    "+ap.isApproved());
		}
	}
	
}
