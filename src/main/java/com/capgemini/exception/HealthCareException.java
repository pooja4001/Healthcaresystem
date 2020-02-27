package com.capgemini.exception;

@SuppressWarnings("serial")
public class HealthCareException extends Exception {
	
	@SuppressWarnings("unused")
	private String message;

	public HealthCareException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
