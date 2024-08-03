package com.cleanarchitecture.interfaceadapters.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(value = Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ApiResponse<T> {

	private int code = 200;
	private String message;
	private T result;

}
