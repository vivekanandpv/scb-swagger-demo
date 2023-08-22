package com.example.springbootdemo.exceptions;

public class RecordNotFoundException extends RuntimeException {
	public RecordNotFoundException(String message) {
		super(message);
	}
}
