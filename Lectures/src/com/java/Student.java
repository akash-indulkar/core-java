package com.java;

public class Student {
	private int rollNo;
	private String name;
	private Date DOB;
	
	public Student(){
		this.rollNo = 21;
		this.name = "Krish";
		this.DOB = new Date(1,1,2001);
	}
	
	public Student(int rollNo, String name, Date DOB) {
		this.rollNo = rollNo;
		this.name = name;
		this.DOB = DOB;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setDOB(Date DOB) {
		this.DOB= DOB;
	}
	
	public int getRollNo() {
		return this.rollNo;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Date getDOB() {
		return this.DOB;
	}
	
	@Override
	public String toString() {
		return "Student roll number is: " + this.rollNo + " || Student name is: " + this.name + " || Student DOB is: " + DOB;
	}
	
	public void print(){
		System.out.println("Student roll number is: " + this.rollNo + " || Student name is: " + this.name + " || Student DOB is: " + DOB);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
//		s1.print();
		System.out.println(s1);
		Student s2 = new Student(3, "Akash", new Date(12, 10, 2000));
//		s2.print();
		System.out.println(s2);
		
	}
}
