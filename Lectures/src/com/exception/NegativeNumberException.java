package com.exception;

public class NegativeNumberException extends Exception{ //if you want to have your own custom exception class then it must extend Exception class
	String message;
	
	public NegativeNumberException(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return this.message;
	}
}
