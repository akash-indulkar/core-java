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
	
	public int calculatePackage() {
		return (this.salary * 12)/100000;
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
	
	@Override
	public void print() {
		System.out.println("Manager ID is: " + this.ID + " Manager name is: " + this.name + " Manager salary is: "+ this.salary + " Manager incentive is: " + this.inc);
	}
	
	@Override
	public int calculatePackage() {
		return ((this.salary + this.inc) * 12)/100000;
	}
	
	public static void main(String[] args) {
		Manager m = new Manager("Ravi Shastri", 100000, 10000);
		m.print();
		int pack = m.calculatePackage();
		System.out.println(pack);
	}
}

class AreaSalesManager extends Manager{
	int petrolAllowance;
	int rentAllowance;
	int mobileAllowance;
	
	public AreaSalesManager() {
		System.out.println("In the Area sales manager default constructor");
		this.petrolAllowance = 3000;
		this.rentAllowance = 5000;
		this.mobileAllowance = 399;
	}
	
	public AreaSalesManager(String name, int salary, int inc, int petrolAllowance, int rentAllowance, int mobileAllowance) {
		super(name, salary, inc);
		System.out.println("In the Area sales manager parameterized constructor");
		this.petrolAllowance = petrolAllowance;
		this.rentAllowance = rentAllowance;
		this.mobileAllowance = mobileAllowance;
	}
	
	@Override
	public void print() {
		System.out.println("Area sales manager ID is: " + this.ID + " Area sales manager name is: " + this.name + " Area sales manager salary is: "+ this.salary + " Area sales manager incentive is: " + this.inc + " Area sales manager petrol allowance is: " + this.petrolAllowance + " Area sales manager rent allowance is: " + this.rentAllowance + " Area sales manager mobile allowance is: " + this.mobileAllowance);
	}
	
	@Override
	public int calculatePackage() {
		return ((this.salary + this.inc + this.petrolAllowance + this.rentAllowance + this.mobileAllowance) * 12) / 100000;
	}
	
	public static void main(String[] args) {
		AreaSalesManager asm = new AreaSalesManager("Prakash Patil", 120000, 15000, 3500, 7000, 900);
		asm.print();
		int pack = asm.calculatePackage();
		System.out.println(pack);
	}
}

