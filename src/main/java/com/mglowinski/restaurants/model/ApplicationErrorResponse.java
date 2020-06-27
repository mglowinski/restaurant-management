package com.mglowinski.restaurants.model;

import lombok.Getter;

import java.util.Collections;
import java.util.List;

@Getter
public class ApplicationErrorResponse {

	private final int code;
	private final String message;
	private final List<String> errors;

	public ApplicationErrorResponse(ApplicationErrorResponseCodes applicationErrorResponseCodes) {
		this.code = applicationErrorResponseCodes.getCode();
		this.message = applicationErrorResponseCodes.getMessage();
		this.errors = Collections.emptyList();
	}

	public ApplicationErrorResponse(ApplicationErrorResponseCodes applicationErrorResponseCodes, List<String> errors) {
		this.code = applicationErrorResponseCodes.getCode();
		this.message = applicationErrorResponseCodes.getMessage();
		this.errors = errors;
	}

}
