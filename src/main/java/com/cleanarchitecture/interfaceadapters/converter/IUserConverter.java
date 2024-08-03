package com.cleanarchitecture.interfaceadapters.converter;

import com.cleanarchitecture.entity.UserEntity;
import com.cleanarchitecture.interfaceadapters.dto.request.RegisterRequest;
import com.cleanarchitecture.interfaceadapters.dto.response.RegisterResponse;

public interface IUserConverter {
   UserEntity toEntity(RegisterRequest request);
   RegisterResponse toDTO(UserEntity entity);
}
