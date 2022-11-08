package com.example.demo.exceptions;

public class InvalidCredentialException extends RuntimeException {

	public InvalidCredentialException() {
	}

	public InvalidCredentialException(String message) {
		super(message);
	}

	public InvalidCredentialException(Throwable cause) {
		super(cause);
	}

	public InvalidCredentialException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidCredentialException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
