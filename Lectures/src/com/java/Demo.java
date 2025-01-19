package com.java;

public class Demo {
	private static int val1;
	private int val2 = 200;
	
	static {
		System.out.println("Inside demo static block");
		val1 = 100;
	}
	
	public static void print1() {
		System.out.println("static method");
	}
	
	public void print2() {
		System.out.println("instance method");
	}
	
	public static void main(String[] args) {
		System.out.println("In Demo main method");
		System.out.println(val1);
		Demo d1 = new Demo();
		System.out.println(d1.val2);
		print1();
		d1.print2();
	}
}

class Another{
	static {
		System.out.println("Inside another static block");
	}
	public static void main(String[] args) {
		System.out.println("In another main method");
//		Demo.print1();
//		Demo d1 = new Demo();
//		d1.print1();
//		d1.print2();
	}
}
