package com.client;

import java.util.Scanner;

import com.aspect.ObjectProvider;
import com.exception.InvalidAccountNumberException;
import com.exception.LowBalanceException;
import com.services.AccountServices;
import com.services.UserServices;

public class ClientCode {
	public static void main(String[] args) {
		AccountServices aServices = ObjectProvider.createAccountObject();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account type: ");
		String accType = sc.next();
		System.out.println("Enter account balance: ");
		float accBal = sc.nextFloat();
		int accNo = aServices.createAccount(accType, accBal);
		try {
			System.out.println(aServices.getAccountDetails(accNo));
			System.out.println(aServices.withdraw(accNo, 500));
			System.out.println(aServices.balEnquiry(accNo));
		}catch(InvalidAccountNumberException e) {
			e.printStackTrace();
		}catch(LowBalanceException e) {
			e.printStackTrace();
		}
		
		UserServices uServices = ObjectProvider.createUserObject();
		System.out.println("Enter a username: ");
		String username = sc.next();
		System.out.println("Enter a password: ");
		String password = sc.next();
		System.out.println("Enter a secret question: ");
		String q = sc.next();
		System.out.println("Enter the answer: ");
		String a = sc.next();
		uServices.signup(username, password, a, a);
		System.out.println(uServices.signin("akash", "akashPassword"));
		uServices.getUserDetails();
		String tempPassword = uServices.forgetPassword("akash", "nothing", "nothing");
		System.out.println(tempPassword);
		System.out.println(uServices.signin("akash", "akashPassword"));
		System.out.println(uServices.signin("akash", tempPassword));
		uServices.updatePassword("akash", tempPassword, "nope");
		System.out.println(uServices.signin("akash", tempPassword));
		System.out.println(uServices.signin("akash", "nope"));
		
	}
}
