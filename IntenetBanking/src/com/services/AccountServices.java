package com.services;

import com.exception.InvalidAccountNumberException;
import com.exception.LowBalanceException;

public interface AccountServices {
	int createAccount(String accType, float accBal);
	String getAccountDetails(int accNo) throws InvalidAccountNumberException;
	float balEnquiry(int accNo) throws InvalidAccountNumberException;
	float withdraw(int accNo, int amount)throws InvalidAccountNumberException, LowBalanceException;
}
