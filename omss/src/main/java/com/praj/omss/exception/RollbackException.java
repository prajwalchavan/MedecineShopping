package com.praj.omss.exception;

@SuppressWarnings("serial")
public class RollbackException extends Exception {
	public RollbackException(String message) {
		super(message);
		System.out.println(message);
	}

}
