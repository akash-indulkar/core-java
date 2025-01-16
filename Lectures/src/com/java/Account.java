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
	
	public void print() {
		System.out.println("Account Number is: " + this.accNo + " || Account type is: " + this.accType +" || Account balance is: " + this.accBal);
	}
	
	public float deposit(int accNo, float amount) {
		if(this.accNo == accNo) {
			this.accBal += amount;
			return this.accBal;
		}
		System.out.println("Invalid account number");
		return 00.0f;
	}
	
	public float withdrawal(int accNo, float amount) {
		if(this.accNo == accNo) {
			this.accBal -= amount;
			return this.accBal;
		}
		System.out.println("Invalid account number");
		return 00.0f;
	}
	
	public float balanceEnquiry(int accNo) {
		if(this.accNo == accNo) {
			return this.accBal;
		}
		System.out.println("Invalid account number");
		return 00.0f;
	}
	
	public static void main(String[] args) {
		Account a1 = new Account();
//		a1.print();
		System.out.println(a1);
		Account a2 = new Account(222, "Saving", 22.2f);
		a2.deposit(222, 22.2f);
		System.out.println(a2);
		a2.withdrawal(222, 1.1f);
		System.out.println(a2.balanceEnquiry(222));
		
//		a2.print();
	}
}
