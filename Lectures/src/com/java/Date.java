package com.java;

public class Date {

	private int dd;
	private int mm;
	private int yyyy;
	
	Date(int dd, int mm, int yyyy) {
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	
	public void setDD(int dd) {
		this.dd = dd;
	}
	
	public void setMM(int mm) {
		this.mm = mm;
	}
	
	public void setYYYY(int yyyy) {
		this.yyyy = yyyy;
	}
	
	public int getDD() {
		return this.dd;
	}
	
	public int getMM() {
		return this.mm;
	}

	public int getYYYY() {
		return this.yyyy;
	}
	
	public String toString() {
		return dd + "/" + mm + "/" + yyyy;
	}
	
	public static void main(String[] args) {

	}

}
