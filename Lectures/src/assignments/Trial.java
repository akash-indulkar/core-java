package assignments;

public abstract class Trial { //only public, final, abstract are applicable for class 
	public static void main(String[] args) { //we can also apply final to the standard main method, but child class cannot have main method
		System.out.println("Hello world");
	}
	
	public static void main(int i) { //we can overload main method but JVM will call default/standard main method
		System.out.println(i);
	}
	
	public static void doNothing() {
		System.out.println("_");
	}
	
//	public abstract static void aMethod(); //illegal combination of abstract and static
}

class Helper extends Trial{
	public static void doNothing() { //we can override static methods also
		System.out.println("Hello, I'm doing nothing");
	}
	
	public static void main(String[] args) {
		Trial.doNothing();
	}
}
