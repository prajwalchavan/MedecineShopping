package com.praj.omss.exception;


@SuppressWarnings("serial")
public class UserNotFoundException extends Exception{
	
	public UserNotFoundException(String message)
	{
		super(message);
		System.out.println(message);
	}

}
