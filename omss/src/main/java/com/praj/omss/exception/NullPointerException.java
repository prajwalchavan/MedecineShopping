package com.praj.omss.exception;

@SuppressWarnings("serial")
public class NullPointerException extends Exception{
	
	
	public NullPointerException(String message) {
		super(message);
		System.out.println(message);
	}

}

