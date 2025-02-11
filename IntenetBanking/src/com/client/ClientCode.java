package com.client;

import com.aspect.ObjectProvider;
import com.exception.InvalidAccountNumberException;
import com.exception.LowBalanceException;
import com.services.AccountServices;
import com.services.UserServices;

public class ClientCode {
	public static void main(String[] args) {
		AccountServices aServices = ObjectProvider.createAccountObject();
		int accNo = aServices.createAccount("Savings", 5000.00f);
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
		uServices.signup("akash", "akashPassword", "nothing", "nothing");
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
