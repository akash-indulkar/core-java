package com.client;

import com.aspect.ObjectProvider;
import com.services.AccountServices;
import com.services.UserServices;

public class ClientCode {
	public static void main(String[] args) {
		AccountServices aServices = ObjectProvider.createAccountObject();
		int accNo = aServices.createAccount("Savings", 5000.00f);
		System.out.println(aServices.getAccountDetails(accNo));
		
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
