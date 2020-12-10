package com.praj.omss.exception;

@SuppressWarnings("serial")
public class InvalidInputException extends Exception {

String message;
	 
	 public InvalidInputException(String message) {
		 super(message);
	 }
 
}
