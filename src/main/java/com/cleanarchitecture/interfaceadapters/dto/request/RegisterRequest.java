package com.cleanarchitecture.interfaceadapters.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {

	@Size(min = 4, message = "USERNAME_INVALID")
	private String userName;
	@Email(message = "EMAIL_INVALID", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
	private String email;
	@Size(min = 8, message = "PASSWORD_INVALID")
	private String passWord;
	private String confirmPassword;
}
