package com.java;

public class Account {
	private int accNo;
	private String accType;
	private float accBal;
	
	public Account() {
		this.accNo = 111;
		this.accType = "Current";
		this.accBal = 11.1f;
	}
	
	public Account(int accNo, String accType, float accBal) {
		this.accNo = accNo;
		this.accType = accType;
		this.accBal = accBal;
	}
	
	public void print() {
		System.out.println("Account Number is: " + this.accNo + " || Account type is: " + this.accType +" || Account balance is: " + this.accBal);
	}
	
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.print();
		Account a2 = new Account(222, "Saving", 22.2f);
		a2.print();
	}
}
