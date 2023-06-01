package com.custom.exception;

public class InValidAgeException extends RuntimeException {

	public InValidAgeException() {
		super();
	}

	public InValidAgeException(String message) {
		super(message);
	}

}
