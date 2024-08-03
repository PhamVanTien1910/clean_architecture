package com.cleanarchitecture.usecase;

import com.cleanarchitecture.interfaceadapters.dto.request.RegisterRequest;
import com.cleanarchitecture.interfaceadapters.dto.response.RegisterResponse;

public interface IUserService {
   RegisterResponse register(RegisterRequest request);
}
