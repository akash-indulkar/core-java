package com.serviceimpl;

import com.beans.User;
import com.services.UserServices;

public class UserServicesImpl implements UserServices{
	User user;
	
	@Override
	public void signup(String username, String password, String q, String a) {
		user = new User(username, password, q, a);
		System.out.println("New User created with username " + user.getUsername());
	}

	@Override
	public boolean signin(String username, String password) {
		return (user.getUsername().equals(username) && user.getPassword().equals(password));
	}

	@Override
	public String forgetPassword(String username, String q, String a) {
		if(user.getUsername().equals(username) && user.getQ().equals(q) && user.getA().equals(a)) {
			String tempPassword = "awjdKDe_ds64dDk$wgvs#";
			user.setPassword(tempPassword);
			return tempPassword;
		}
		return "Invalid credentials";
	}

	@Override
	public void updatePassword(String username, String oldPassword, String newPassword) {
		if(user.getUsername().equals(username) && user.getPassword().equals(oldPassword)) {
			user.setPassword(newPassword);
			return;
		}
		System.out.println("Invalid old password");
	}
	
	@Override
	public void getUserDetails() {
		System.out.println(user.getUsername() + " " + user.getQ());
	}
}
