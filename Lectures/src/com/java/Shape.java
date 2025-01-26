package com.java;

public class Shape {
	String name;
	
	public float calculateArea() {
		return 0.0f;
	}
}

class Circle extends Shape {
	float radius;
	
	@Override
	public float calculateArea() {
		return 3.14f * this.radius * this.radius;
	}
}

class Square extends Shape {
	float side;
	
	@Override
	public float calculateArea() {
		return this.side * this.side;
	}
}

class Test{
	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius = 4;
		c.calculateArea();
		
		Square s = new Square();
		s.side = 4;
		s.calculateArea();
	}
}