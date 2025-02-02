package com.vaddi.java.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomException extends RuntimeException{
	
	private String message;
	private Integer statusCode;

}
