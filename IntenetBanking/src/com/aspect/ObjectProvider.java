package com.aspect;

import com.serviceimpl.AccountServicesImpl;
import com.serviceimpl.UserServicesImpl;
import com.services.AccountServices;
import com.services.UserServices;

public class ObjectProvider {
	public static AccountServices createAccountObject() {
		return new AccountServicesImpl();
	}
	
	public static UserServices createUserObject() {
		return new UserServicesImpl();
	}
}
