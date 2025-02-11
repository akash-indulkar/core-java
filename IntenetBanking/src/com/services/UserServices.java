package com.services;

public interface UserServices {
	public void signup(String username, String password, String q, String a);
	public boolean signin(String username, String password);
	public String forgetPassword(String username, String q,String a);
	public void updatePassword(String username, String oldPassword, String newPassword);
	public void getUserDetails();
}
