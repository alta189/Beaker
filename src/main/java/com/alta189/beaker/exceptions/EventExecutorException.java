package com.alta189.beaker.exceptions;

public class EventExecutorException extends Exception {
	public EventExecutorException() {
		super();
	}

	public EventExecutorException(String message) {
		super(message);
	}

	public EventExecutorException(String message, Throwable cause) {
		super(message, cause);
	}

	public EventExecutorException(Throwable cause) {
		super(cause);
	}
}
