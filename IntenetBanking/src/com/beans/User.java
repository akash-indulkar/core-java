package com.beans;

public class User {
	private int UID;
	private String username;
	private String password;
	private String Q;
	private String A;
	private static int series = 1;
	
	public User(String username, String password, String q, String a) {
		super();
		this.UID = series;
		series++;
		this.username = username;
		this.password = password;
		this.Q = q;
		this.A = a;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQ() {
		return Q;
	}

	public void setQ(String q) {
		Q = q;
	}

	public String getA() {
		return A;
	}

	public void setA(String a) {
		A = a;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", Q=" + Q + ", A=" + A + "]";
	}

	
}