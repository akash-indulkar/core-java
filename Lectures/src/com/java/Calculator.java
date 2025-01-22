package com.java;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, float b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	public void sub(int a, float b) {
		System.out.println(a-b);
	}
	
	public void sub(int a, int b, int c) {
		System.out.println(a-b-c);
	}
	
	public void mul(int a, int b) {
		System.out.println(a*b);
	}
	
	public void mul(int a, float b) {
		System.out.println(a+b);
	}
	
	public void mul(int a, int b, int c) {
		System.out.println(a*b*c);
	}
	
	public void div(int a, int b) {
		System.out.println(a/b);
	}
	
	public void div(int a, int b, int c) {
		System.out.println((a/b)/c);
	}
	
	public void div(int a, float b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.add(10, 12.2f);
		cal.add(10, 20, 30);
		cal.add(51, 54);
		System.out.println("===============");
		
		cal.sub(10, 12.2f);
		cal.sub(10, 20, 30);
		cal.sub(51, 54);
		
		System.out.println("===============");
		cal.mul(10, 12.2f);
		cal.mul(10, 20, 30);
		cal.mul(51, 54);
		
		System.out.println("===============");
		cal.div(10, 12.2f);
		cal.div(580, 15, 2);
		cal.div(51, 2);
	}
	
	
}
