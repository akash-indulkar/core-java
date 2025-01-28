package com.inheritance;

public class SalaryNotification {

	public static void printSalary(Employee emp) {
		if(emp instanceof Manager) { // instanceof operator is used to check whether a object is a given type of class
			System.out.println(emp.calculatePackage());
		}else {
			System.out.println("Invalid designation");
		}
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		printSalary(emp);
		emp = new Manager();
		printSalary(emp);
	}
}
