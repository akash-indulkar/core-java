package com.serviceimpl;

import com.beans.Account;
import com.exception.InvalidAccountNumberException;
import com.exception.LowBalanceException;
import com.services.AccountServices;

public class AccountServicesImpl implements AccountServices {
	Account acc;
	
	@Override
	public int createAccount(String accType, float accBal) {
		acc = new Account(accType, accBal);
		return acc.getAccNo();
	}
	
	@Override
	public String getAccountDetails(int accNo) throws InvalidAccountNumberException{
		if( acc.getAccNo() != accNo ) {
			throw new InvalidAccountNumberException("Invalid account number");
		}
		return acc.toString();
	}

	@Override
	public float balEnquiry(int accNo) throws InvalidAccountNumberException{
		if(acc.getAccNo() != accNo ) {
			throw new InvalidAccountNumberException("Invalid account number");
		}
		return acc.getAccBal() ;
	}

	@Override
	public float withdraw(int accNo, int amount) throws InvalidAccountNumberException, LowBalanceException{
		if(acc.getAccNo() != accNo) {
			throw new InvalidAccountNumberException("Invalid account number");
		}else if(acc.getAccBal()<amount) {
			throw new LowBalanceException("Your balance is less than amount entered");
		}
		acc.setAccBal(acc.getAccBal() - amount);
		System.out.println("Amount withdrawen: " + amount + " with new account balance: " + acc.getAccBal());
		return acc.getAccBal();
	}
}
