package Generics;

public class BoundedGenericsDemo <T extends Number> { //Generics with bounded restrictions, Only bounded class and subclasses allowed
//public class BoundedGenericsDemo <R extends String> { //We cannot use final classes for bounded types as final classes cannot be extended
	T a;
//	R b;
	public BoundedGenericsDemo(T a) {
//	public BoundedGenericsDemo(T a, R b) {
		super();
		this.a = a;
//		this.b = b;
	}
	
	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

//	public R getB() {
//		return b;
//	}

//	public void setB(R b) {
//		this.b = b;
//	}

	public static void main(String[] args) {
//		BoundedGenericsDemo<Number> BD1 = new BoundedGenericsDemo<Integer>(); //CE - even if it is parent child relation it is not allowed, RHS and LHS types should matched
		BoundedGenericsDemo<Number> BD2 = new BoundedGenericsDemo<Number>(54); 
		BoundedGenericsDemo<Integer> BD3 = new BoundedGenericsDemo<Integer>(54); 
	}
}
