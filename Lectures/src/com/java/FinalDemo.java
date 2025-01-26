package com.java;

public class FinalDemo {
	final int var = 10;
//	private FinalDemo() {  // blocks has a relationship, but also is a relationship is blocked
//		System.out.println("In the final demo default constructor");
//	}
	public final void print() {
		System.out.println("in the final method");
	}
	
	private void greet() { // controls access
		System.out.println("Namaste");
	}
	
	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
//		fd.var = 20; // cannot reassign final variable
	}
}

final class Helper extends FinalDemo{ // controls inheritance
//	@Override
//	public final void print() {     //cannot override final method from superclass
//		System.out.println("Hello I'm Helper");
//	}
	
//	@Override
//	public void greet() { //cannot override private methods
//		System.out.println("Hello world");
//	}
	
	public static void main(String[] args) {
		final Helper h = new Helper();
//		h = new Helper(); //reassignment to final variable is not possible
		h.print(); //but we can use it
//		h.greet(); //cannot access private method from super class
	}
}

//class SubHelper{ // cannot extend final class
//	Helper h; //but contentment relation is still possible
//}

