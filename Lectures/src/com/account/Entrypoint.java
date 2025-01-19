package com.account;

public class Entrypoint {
	public static void main(String[] args) {
		AccountOperation ops1 = new AccountOperation();
		int accNo = ops1.createAccount("current", 500.01f);
		ops1.deposit(accNo, 12.20f);
		ops1.balanceEnquiry(accNo);
		System.out.println(ops1);
		AccountOperation ops2 = new AccountOperation();
		ops2.createAccount("savings", 684.57f);
		System.out.println(ops2);
	}
}
