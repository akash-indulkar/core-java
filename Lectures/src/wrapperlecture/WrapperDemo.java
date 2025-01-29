package wrapperlecture;

public class WrapperDemo {
	public static void main(String[] args) {
		String name = args[0];
		Integer salary = Integer.parseInt(args[1]); //String[] args -> command line arguments
		System.out.println(name);
		System.out.println(salary);
		
		int a = 10;
		Integer b = a; //Auto-boxing -> automatic conversion from primitive to wrapper object by compiler
		
		Integer c = new Integer(20);
		int d = c; //Auto-unboxing -> automatic conversion from wrapper object to primitive by compiler
	}
}
