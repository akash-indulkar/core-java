package com.java;

public class OuterClass {
	private int o = 12;
	public void outerMethod() {
		System.out.println("In the outer method");
	}
	class InnerClass{ //1.Simple Inner Class
		int i = 11;
//		static int i = 11; //simple inner classes doesn't support static declarations
		public void innerMethod() {
			System.out.println("In the inner method");
//			System.out.println(o); //Inner class can access outer class private data directly
			outerMethod();
		}
	}
	
	public void test() {
		class MethodLocalInnerClass{ //3. Method local Inner class //cannot make method local inner class as static
			int i =32;
			public void print() {
				System.out.println("In the method local class method");
			}
		}
		MethodLocalInnerClass mld = new MethodLocalInnerClass(); //can create object method local inner class within method scope only
		System.out.println(mld.i);
		mld.print();
	}
	
	static class StaticInnerClass{ //1.Static Inner Class
		static int i = 11; //static inner classes support static declarations
		public void innerMethod() {
			System.out.println("In the static class inner method");
//			System.out.println(o); //cannot reference to not static directly
//			outerMethod(); //cannot reference to not static directly
			OuterClass ot = new OuterClass();
			System.out.println(ot.o);
			ot.outerMethod(); //can access through outer class object
		}
		public static void main(String[] args) {
			StaticInnerClass inner = new StaticInnerClass();
			System.out.println(StaticInnerClass.i);
			inner.innerMethod();
		}
	}
	public static void main(String[] args) {
		OuterClass ot = new OuterClass();
		InnerClass in = ot.new InnerClass(); 
		System.out.println(in.i);//we have to use outer class as qualifier to access inner class data
		in.innerMethod();
		
		StaticInnerClass sin = new StaticInnerClass(); //static class objects can be created directly outer class qualifier
		System.out.println(StaticInnerClass.i);
		sin.innerMethod();
	}
}

class AnotherClass{
	public static void main(String[] args) {
		OuterClass ot = new OuterClass();
		OuterClass.InnerClass in = ot.new InnerClass(); //we have to use both outer class object and name as qualifier to create object of simple inner class in some another class
//		System.out.println(in.i); //cannot access private data of both outer and inner class in some another class
		in.innerMethod();
		
		OuterClass.StaticInnerClass sin = new OuterClass.StaticInnerClass(); //In order to create static inner class object in another class we have to use outer class name as qualifier
		System.out.println(OuterClass.StaticInnerClass.i);
		sin.innerMethod();
	}
}
