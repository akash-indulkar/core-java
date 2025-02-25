package Generics;

public class GenericsDemo<T> {
	T i;
	public GenericsDemo(T i) {
		super();
		this.i = i;
	}

	public T getI() {
		return i;
	}

	public void setI(T i) {
		this.i = i;
	}

	public static void main(String[] args) {
		GenericsDemo<String> gd1 = new GenericsDemo<String>("Akash"); //used to avoid type unsafe operations
		GenericsDemo<Integer> gd2 = new GenericsDemo<Integer>(54); //compiler will replace T with Object/bounded type at the time of compilation
		GenericsDemo<Float> gd3= new GenericsDemo<>(554.54f); //diamond operator - no need to write type on LHS
//		GenericsDemo<Integer> gd4 = new GenericsDemo<String>(); //CE - RHS and LHS types should matched
//		GenericsDemo<Number> gd5 = new GenericsDemo<Integer>(); //CE - even if it is parent child relation it is not allowed, RHS and LHS types should matched
		
	}
}
