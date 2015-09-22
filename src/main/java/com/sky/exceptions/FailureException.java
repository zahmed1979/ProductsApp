package com.sky.exceptions;

public class FailureException extends RuntimeException {
	
	private static final long serialVersionUID = 1997753363232807009L;

	 
	public FailureException() { }
	public FailureException(String message) { super(message);}
	public FailureException(Throwable cause) { super(cause); }
	public FailureException(String message, Throwable cause) { super(message, cause);}
	
}


