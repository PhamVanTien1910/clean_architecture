package com.cleanarchitecture.interfaceadapters.converter.impl;

import org.springframework.stereotype.Component;

import com.cleanarchitecture.entity.UserEntity;
import com.cleanarchitecture.interfaceadapters.converter.IUserConverter;
import com.cleanarchitecture.interfaceadapters.dto.request.RegisterRequest;
import com.cleanarchitecture.interfaceadapters.dto.response.RegisterResponse;

@Component
public class UserConverter implements IUserConverter {

	@Override
	public UserEntity toEntity(RegisterRequest request) {
		UserEntity entity = new UserEntity();
		entity.setUserName(request.getUserName());
		entity.setEmail(request.getEmail());
		entity.setPassword(request.getPassWord());
		return entity;
	}

	@Override
	public RegisterResponse toDTO(UserEntity entity) {
		RegisterResponse response = new RegisterResponse();
		response.setId(entity.getId());
		response.setUserName(entity.getUserName());
		response.setEmail(entity.getEmail());
		return response;
	}

}
