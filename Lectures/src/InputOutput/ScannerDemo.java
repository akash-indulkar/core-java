package InputOutput;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //To take inputs from the console
		int i = sc.nextInt(); //various methods for various data types
		String name= sc.next();
		float amount = sc.nextFloat(); //no need to explicit type-casting
		float population = sc.nextLong();
		System.out.println(i);
		System.out.println(name);
		System.out.println(amount);
		System.out.println(population);
	}
}
