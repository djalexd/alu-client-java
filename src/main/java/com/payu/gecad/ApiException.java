package com.payu.gecad;

public class ApiException extends RuntimeException {
	public ApiException() {
	}

	public ApiException(Throwable cause) {
		super(cause);
	}

	public ApiException(String message) {
		super(message);
	}

	public ApiException(String message, Throwable cause) {
		super(message, cause);
	}
}
