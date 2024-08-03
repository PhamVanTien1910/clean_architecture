package com.cleanarchitecture.interfaceadapters.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterResponse {

	private Long id;
	private String userName;
	private String email;
}
