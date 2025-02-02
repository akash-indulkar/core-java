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
	
	public void greetEmployee() {
		System.out.println("Hello employee!");
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
	
	public void greetManager() {
		System.out.println("Hello manager!");
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
	
	public void greetAreaSalesManager() {
		System.out.println("Hello area sales manager!");
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
//		AreaSalesManager asm = new AreaSalesManager("Prakash Patil", 120000, 15000, 3500, 7000, 900);
//		asm.print();
//		int pack = asm.calculatePackage();
//		System.out.println(pack);
		
//		Employee e1 = new Employee();
//		System.out.println(e1.calculatePackage()); 
//		Manager e2 = new Manager();
//		System.out.println(e2.calculatePackage()); 
//		AreaSalesManager e3 = new AreaSalesManager();
//		System.out.println(e3.calculatePackage()); 
		
//		In the above lines of code(113-118), is not a good  approach to call object specific method as it creates unnecessary memory usage and lefts reachable objects, better approach |>
		
		Employee e =(Manager) new Manager("Akash", 68754, 2000); // we can hold child class object with super class reference -> principle of poly-morphism
		((Manager) e).greetManager(); // to call child class special method, we have to downcast it
		e = (AreaSalesManager)new AreaSalesManager("Prakash", 68754, 2000, 1000, 500, 20000);
		System.out.println(e.calculatePackage());
		((AreaSalesManager) e).greetAreaSalesManager();
		
//		It is a better approach(122-126) as it leaves unreachable object for GC, and better memory usage, more details below
		
//		Object obj =  new Employee("abc", 123000); // We can also use Object class reference as Object is the cosmic super class to all classes
//		((Employee)obj).greetEmployee();
//		System.out.println(((Employee)obj).calculatePackage());
//		obj =  new Manager("abc", 456000, 456);
//		((Manager) obj).greetManager(); 
//		System.out.println(((Manager)obj).calculatePackage());
//		obj =  new AreaSalesManager("abc", 789000, 789, 789, 789, 78999);
//		((AreaSalesManager) obj).greetAreaSalesManager();
//		System.out.println(((AreaSalesManager)obj).calculatePackage());
	}
}

