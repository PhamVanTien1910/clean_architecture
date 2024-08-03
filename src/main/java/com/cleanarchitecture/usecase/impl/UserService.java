package com.cleanarchitecture.usecase.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cleanarchitecture.entity.UserEntity;
import com.cleanarchitecture.exception.AppException;
import com.cleanarchitecture.exception.ErrorCode;
import com.cleanarchitecture.infrastructure.repository.IUserRepository;
import com.cleanarchitecture.interfaceadapters.converter.IUserConverter;
import com.cleanarchitecture.interfaceadapters.dto.request.RegisterRequest;
import com.cleanarchitecture.interfaceadapters.dto.response.RegisterResponse;
import com.cleanarchitecture.usecase.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserConverter userConverter;

	@Autowired
	private IUserRepository userRepository;

	@Override
	public RegisterResponse register(RegisterRequest request) {
		if (!request.getPassWord().equals(request.getConfirmPassword())) {
			throw new AppException(ErrorCode.PASSWORD_CONFIRMPASSWORD_INVALID);
		}
		UserEntity existingUser = userRepository.findByUserName(request.getUserName());
		if (existingUser != null) {
			throw new AppException(ErrorCode.USER_EXISTED);
		}
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
		String encodedPassword = passwordEncoder.encode(request.getPassWord());
		UserEntity entity = userConverter.toEntity(request);
		entity.setPassword(encodedPassword);
		entity = userRepository.save(entity);
		return userConverter.toDTO(entity);
	}

}
