package com.services;

public interface AccountServices {
	int createAccount(String accType, float accBal);
	String getAccountDetails(int accNo);
}
