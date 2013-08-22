package com.alta189.beaker.exceptions;

public class EventRegistrationException extends RuntimeException {
	public EventRegistrationException(Throwable cause) {
		super(cause);
	}

	public EventRegistrationException(String message, Throwable cause) {
		super(message, cause);
	}

	public EventRegistrationException(String message) {
		super(message);
	}
}
