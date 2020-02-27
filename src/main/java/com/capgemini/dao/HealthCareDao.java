package com.capgemini.dao;

import com.capgemini.dto.DiagnosticCenter;
import com.capgemini.dto.Appointment;
import com.capgemini.dto.Test;

public interface HealthCareDao {
	
	public boolean addCenter(DiagnosticCenter center);
	
	public boolean removeCenter(DiagnosticCenter center);
	
	public String addTest(DiagnosticCenter center,Test test);
	
	public boolean removeTest(DiagnosticCenter center,Test test);
	
	public void viewCenters();
	
	public void viewCentersAndTests();
	
	public DiagnosticCenter getCenterObjectOfcenterId(String centerId);
	
	public boolean isCenterNamePresent(String centerName);
	
	public boolean isCenterIdPresent(String centerId);
	
	public Test getTestObject(DiagnosticCenter center, String testId);
	
	public boolean isTestNamePresent(DiagnosticCenter centerObject,String testName);
	
	public boolean isTestIdPresent(DiagnosticCenter centerObject,String testId);

	public boolean addAppointment(Appointment appointment);
}
