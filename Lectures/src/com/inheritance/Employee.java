package com.inheritance;

public class Employee {
	protected int ID;
	protected String name;
	protected int salary;
	private int series = 1;
	
	public Employee() {
		System.out.println("in employee default constructor");
		this.ID = series;
		series++;
		this.name = "randomName";
		this.salary = 151;
	}
	
	public Employee(String name, int salary) {
		System.out.println("in employee parameterized constructor");
		this.ID = series;
		series++;
		this.name = name;
		this.salary = salary;
	}
	
	public void print() {
		System.out.println("Employee ID is: " + this.ID + " Employee name is: " + this.name + " Employee salary is: "+ this.salary);
	}
}

class Manager extends Employee{
	protected int inc;
	
	public Manager() {
		System.out.println("in manager default constructor");
		this.inc = 11;
	}
	
	public Manager(String name, int salary, int inc) {
		super(name, salary);
		System.out.println("in manager parameterized constructor");
		this.inc  = inc;
	}
	
	public void print() {
		System.out.println("Manager ID is: " + this.ID + " Manager name is: " + this.name + " Manager salary is: "+ this.salary + " Manager incentive is: " + this.inc);
	}
	
	public static void main(String[] args) {
		Manager m = new Manager("Ravi Shastri", 1000000, 10000);
		m.print();
	}
}

