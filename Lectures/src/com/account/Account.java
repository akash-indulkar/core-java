package com.account;

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
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public void setAccType(String accType) {
		this.accType= accType;
	}
	
	public void setAccBal(float accBal) {
		this.accBal= accBal;
	}
	
	public int getAccNo() {
		return this.accNo;
	}
	
	public String getAccType() {
		return this.accType;
	}
	
	public float getAccBal() {
		return this.accBal;
	}
	
	@Override
	public String toString() {
		return "Account Number is: " + this.accNo + " || Account type is: " + this.accType +" || Account balance is: " + this.accBal;
	}
	
	
}
