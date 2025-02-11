package com.assertion;

public class AssertionDemo {
	public static void main(String[] args) {
		int birthYear=Integer.parseInt(args[0]);
//		int age = birthYear - 2000; //this should give negative age
		int age = 2025 - birthYear;
		assert(age>0) : "Your age cannot be negative"; //assert is used to test a particular output of code
	}
}
