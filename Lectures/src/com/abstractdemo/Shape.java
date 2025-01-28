package com.abstractdemo;

import java.util.GregorianCalendar;

public abstract class Shape { //class should also be marked as abstract
	String name;
	
	public Shape(String name) { //abstract class can have constructor
		System.out.println("In Shape class constructor");
		this.name = name;
	}
	
	abstract public float calculateArea(); //generic method, no implementation, marked as abstract
	
	public void print() { //abstract class can also contain concrete method
		System.out.println("Name is " + this.name);
	}
}

class Circle extends Shape { 
	
	float radius;
	
	public Circle(String name, float radius) {
		super(name);
		System.out.println("In Circle class constructor");
		this.radius = radius;
	}
	
	public void greetCircle() {
		System.out.println("Hello I'm a Circle!");
	}
	
	@Override //we have to compulsory override abstract method if we are extending abstract class
	public float calculateArea() {
//		super.calculateArea(); //cannot use super keyword with abstract method
//		super.print(); //but can use super keyword with concrete method
		return 3.14f * this.radius * this.radius;
	}
	
	@Override //can also override concrete method, but it is not compulsion
	public void print() {
		System.out.println("Radius of " + this.name + " is " + this.radius);
	}
}

class Square extends Shape {
	float side;
	
	public Square(String name, float side) {
		super(name);
		System.out.println("In Square class constructor");
		this.side = side;
	}
	
	public void greetSquare() {
		System.out.println("Hello I'm a Square!");
	}
	
	@Override
	public float calculateArea() {
		return this.side * this.side;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Side of " + this.name + " is " + this.side);
	}
}

class Test{
	public static void main(String[] args) {
//		Shape s =new Shape("octagon"); //cannot instantiate abstract class / cannot create objects of abstract class / cannot use new keyword with abstract class 
//		Circle c = new Circle("Circle", 6.56f);
//		System.out.println(c.calculateArea());
//		
//		Square s = new Square("Square", 8);
//		System.out.println(s.calculateArea());
		
		
//		Shape s = new Circle("circle", 3.56f);
//		System.out.println(s.calculateArea());
//		((Circle)s).greetCircle();
//		s = new Square("square", 65.2f);
//		System.out.println((s.calculateArea()));
//		((Square) s).greetSquare();
		
		Object obj = new Square("square", 62.2f);
		System.out.println(((Square)obj).calculateArea());
		((Square)obj).greetSquare();
	}
}