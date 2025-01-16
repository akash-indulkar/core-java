package com.java;

public class Student {
	private int rollNo;
	private String name;
	
	public Student(){
		this.rollNo = 21;
		this.name = "Krish";
	}
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public void print(){
		System.out.println("Student roll number is: " + this.rollNo + " || Student name is: " + this.name);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.print();
		Student s2 = new Student(3, "Akash");
		s2.print();
	}
}
