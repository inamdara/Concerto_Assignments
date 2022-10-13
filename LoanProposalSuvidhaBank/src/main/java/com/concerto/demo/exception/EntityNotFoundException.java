package com.concerto.demo.exception;

public class EntityNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5436780009321251621L;

	public EntityNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public EntityNotFoundException(String message) {
		super();
		this.message = message;
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
