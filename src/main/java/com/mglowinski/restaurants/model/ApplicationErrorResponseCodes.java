package com.mglowinski.restaurants.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class ApplicationErrorResponseCodes {

	private final int code;
	private final String message;
}
