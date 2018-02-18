package com.example.controller.faults;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.models.faults.ErrorInfo;

@RestControllerAdvice
public class GenericErrorHandler {

	@ExceptionHandler(value = RuntimeException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorInfo handleRuntimeExceptions(RuntimeException exception) {
		ErrorInfo errorBody = new ErrorInfo();

		errorBody.setExceptionType(exception.getClass().getSimpleName());
		errorBody.setMessage(exception.getLocalizedMessage());

		return errorBody;

	}

}
