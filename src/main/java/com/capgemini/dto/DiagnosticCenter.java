package com.capgemini.dto;

import java.util.ArrayList;
import java.util.List;

public class DiagnosticCenter {
	
	private String centerId;
	
	private String centerName;
	
	private List<Test> listOfTests = new ArrayList<Test>();
	
	public DiagnosticCenter(String centerId, String centerName) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
	}
	
	public DiagnosticCenter(String centerId, String centerName, List<Test> listOfTests) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.listOfTests = listOfTests;
	}

	@Override
	public String toString() {
		//return "DiagnosticCenter [centerId=" + centerId + ", centerName=" + centerName + ", listOfTests=" + listOfTests+ "]";
				return "["+centerName+"]";
	}

	public String getCenterId() {
		return centerId;
	}
	
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	
	public String getCenterName() {
		return centerName;
	}
	
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	
	public  List<Test> getListOfTests() {
		return listOfTests;
	}
	
	public void setListOfTests(List<Test> listOfTests) {
		this.listOfTests = listOfTests;
	}
	
}
