package com.example.springbootdemo.apis;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.springbootdemo.exceptions.RecordNotFoundException;

@ControllerAdvice
public class GeneralExceptionHandlerAdvice {
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> handleRecordNotFoundException(RecordNotFoundException rnfe) {
		System.out.println("Record Not Found: " + rnfe.getMessage());
		
		return ResponseEntity.badRequest().build();
	}
	
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<?> handleArithmeticException(ArithmeticException rnfe) {
		System.out.println("Arithmetic Exception: " + rnfe.getMessage());
		
		return ResponseEntity.status(455).build();
	}
}
