package com.account;

public class AccountOperation {
	
	private Account acc;
	
	public int createAccount(String accType, float accBal) {
		acc = new Account(accType, accBal);
		return acc.getAccNo();
	}
	
	public float deposit(int accNo, float amount) {
		if(acc.getAccNo() == accNo) {
			float accBal = acc.getAccBal() + amount;
			acc.setAccBal(accBal);
			return accBal;
		}
		System.out.println("Invalid account number");
		return 00.0f;
	}
	
	public float withdrawal(int accNo, float amount) {
		if(acc.getAccNo() == accNo) {
			float accBal = acc.getAccBal() - amount;
			acc.setAccBal(accBal);
			return accBal;
		}
		System.out.println("Invalid account number");
		return 00.0f;
	}
	
	public float balanceEnquiry(int accNo) {
		if(acc.getAccNo()== accNo) {
			return acc.getAccBal();
		}
		System.out.println("Invalid account number");
		return 00.0f;
	}
	
	public void print() {
		System.out.println("Account Number is: " + acc.getAccNo() + " || Account type is: " + acc.getAccType() +" || Account balance is: " + acc.getAccBal());
	}
	
	@Override
	public String toString() {
		return "Account Number is: " + acc.getAccNo() + " || Account type is: " + acc.getAccType() +" || Account balance is: " + acc.getAccBal();
	}
}
