package com.cleanarchitecture.interfaceadapters.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleanarchitecture.interfaceadapters.dto.request.RegisterRequest;
import com.cleanarchitecture.interfaceadapters.dto.response.ApiResponse;
import com.cleanarchitecture.interfaceadapters.dto.response.RegisterResponse;
import com.cleanarchitecture.usecase.IUserService;

@RestController
@RequestMapping("/auth")
public class Authentication {

	@Autowired
	private IUserService userService;

	@PostMapping(value = "/register")
	public ApiResponse<RegisterResponse> register(@RequestBody @Valid RegisterRequest request) {
		RegisterResponse results = userService.register(request);
		ApiResponse<RegisterResponse> response = new ApiResponse<>();
		response.setResult(results);
		return response;
	}
}
