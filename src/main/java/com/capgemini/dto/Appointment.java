package com.capgemini.dto;

import java.math.BigInteger;

public class Appointment {
	private BigInteger appointmentid;
	private DiagnosticCenter centerid;
	private Test testid;
	private String date;
	private boolean approved;
	
	public Appointment(BigInteger appointmentid, DiagnosticCenter centerid, Test testid, String date,
			boolean approved) {
		super();
		this.appointmentid = appointmentid;
		this.centerid = centerid;
		this.testid = testid;
		this.date = date;
		this.approved = approved;
	}

	public BigInteger getAppointmentid() {
		return appointmentid;
	}

	public void setAppointmentid(BigInteger appointmentid) {
		this.appointmentid = appointmentid;
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Appointment [appointmentid=" + appointmentid + ", centerid=" + centerid + ", testid=" + testid
				+ ", date=" + date + ", approved=" + approved + "]";
	}

	public DiagnosticCenter getCenterid() {
		return centerid;
	}
	public void setCenterid(DiagnosticCenter centerid) {
		this.centerid = centerid;
	}
	public Test getTestid() {
		return testid;
	}
	public void setTestid(Test testid) {
		this.testid = testid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	
}
