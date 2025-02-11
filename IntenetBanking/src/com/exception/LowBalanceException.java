package com.exception;

public class LowBalanceException extends Exception{
	String message;
	
	public LowBalanceException(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return this.message;
	}
}
