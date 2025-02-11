package com.exception;

public class InvalidAccountNumberException extends Exception{
	String message;
	
	public InvalidAccountNumberException(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return this.message;
	}
}
