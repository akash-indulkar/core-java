package com.serviceimpl;

import com.beans.Account;
import com.services.AccountServices;

public class AccountServicesImpl implements AccountServices {
	Account acc;
	public int createAccount(String accType, float accBal) {
		acc = new Account(accType, accBal);
		return acc.getAccNo();
	}
	
	public String getAccountDetails(int accNo) {
		return acc.getAccNo() != accNo ? "Invalid Account Number" : acc.toString();
	}
}
