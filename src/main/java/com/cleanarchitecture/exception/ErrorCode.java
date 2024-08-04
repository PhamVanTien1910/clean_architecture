package com.cleanarchitecture.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum ErrorCode {
	
    USER_EXISTED(210, "User existed", HttpStatus.BAD_REQUEST),
	UNCATEGORIZED_EXCEPTION(250, "Uncategorized exception", HttpStatus.INTERNAL_SERVER_ERROR),
	USERNAME_INVALID(230, "User must be at least 4 character",HttpStatus.BAD_GATEWAY),
	PASSWORD_INVALID(220, "Password must be at least 8 character", HttpStatus.BAD_REQUEST ),
	EMAIL_INVALID(210, "Invalid email field format", HttpStatus.BAD_REQUEST),
	UNAUTHENTICATED(250, "Unauthenticated", HttpStatus.UNAUTHORIZED),
	PASSWORD_CONFIRMPASSWORD_INVALID(211, "Password and confirm password do not match", HttpStatus.BAD_REQUEST);
	
	private int code;
	private String message;
	private HttpStatus statusCode;
	
    ErrorCode(int code, String message, HttpStatus statusCode){
		this.code = code;
		this.message = message;
		this.statusCode = statusCode;
		
	}
	
}
