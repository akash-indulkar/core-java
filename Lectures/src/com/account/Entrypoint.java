package com.account;

public class Entrypoint {
	public static void main(String[] args) {
		AccountOperation ops = new AccountOperation();
		int accNo = ops.createAccount("current", 500.01f);
		ops.deposit(accNo, 12.20f);
		ops.balanceEnquiry(accNo);
		System.out.println(ops);
	}
}
