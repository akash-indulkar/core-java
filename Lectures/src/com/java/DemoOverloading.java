package com.java;

public class DemoOverloading {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, float b) {
		System.out.println( a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b);
	}
	
	public void add(float a, int b) {
		System.out.println(a+b);
	}
	
//	public int add(int a, int b, int c) { 
//		return a+b+c;
//	}
	
	public static void main(String[] args) {
		DemoOverloading d1 = new DemoOverloading();
		d1.add(10, 10);
		d1.add(24.0f, 10);
		d1.add(28, 10.54f);
		d1.add(10, 10, 20);
	}
}
