package com.abstractdemo;

public abstract class Account {
	int accNo;
	String accType;
	float accBalance;
	static int counter = 1;
	
	public Account(String accType, float accBalance) {
		System.out.println("In Account class constructor");
		this.accNo = counter;
		counter++;
		this.accType = accType;
		this.accBalance = accBalance;
	}
	
	public abstract float calculateIntrest();
	
	public void print() {
		System.out.println("Account no. " + this.accNo + " || Account type is " + this.accType + " || Account balance is " + this.accBalance);
	}
}

class SavingAccount extends Account{
	float intrestRate;
	
	public SavingAccount(String accType, float accBalance, float intrestRate) {
		super(accType, accBalance);
		System.out.println("In Saving account class constructor");
		this.intrestRate = intrestRate;
	}
	
	@Override
	public float calculateIntrest() {
		return (this.accBalance * this.intrestRate) / 100;
	}
	
	@Override
	public void print() {
		System.out.println("Account no. " + this.accNo + " || Account type is " + this.accType + " || Account balance is " + this.accBalance + " || Account intrest rate is " + this.intrestRate);
	}
	
	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount("Saving", 1000, 12);
		System.out.println(sa.calculateIntrest());
	}
}