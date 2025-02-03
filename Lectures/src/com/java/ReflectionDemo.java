package com.java;

import java.lang.reflect.Constructor; // present in java reflect package
import java.lang.reflect.Field; // present in java reflect package
import java.lang.reflect.Method; // present in java reflect package

public class ReflectionDemo {
	public static void main(String[] args) {
		try {
			// summary of user defined Date class
			Class c1 = Class.forName("com.java.Date");
			Field[] f1 = c1.getDeclaredFields(); //summary of fields
			for(int i=0; i<f1.length; i++) {
				System.out.println(f1[i]);
			}
			System.out.println("=======================================");
			Method[] m1 = c1.getDeclaredMethods(); //summary of methods
			for(int i=0; i<m1.length; i++) {				
				System.out.println(m1[i]);
			}
			System.out.println("=======================================");
			Constructor[] con1 = c1.getDeclaredConstructors(); //summary of constructors
			for(int i=0; i<con1.length; i++) {				
				System.out.println(con1[i]);
			}
			System.out.println("=======================================");
			
			// summary of predefined Object class
			Class c2 = Class.forName("java.lang.Object");
			Field[] f2 = c2.getDeclaredFields(); //summary of fields
			for(int i=0; i<f2.length; i++) {
				System.out.println(f2[i]);
			}
			System.out.println("=======================================");
			Method[] m2 = c2.getDeclaredMethods(); //summary of methods
			for(int i=0; i<m2.length; i++) {				
				System.out.println(m2[i]);
			}
			System.out.println("=======================================");
			Constructor[] con2 = c2.getDeclaredConstructors(); //summary of constructors
			for(int i=0; i<con2.length; i++) {				
				System.out.println(con2[i]);
			}
			System.out.println("=======================================");
			
			// summary of predefined StringBuilder class
			Class c3 = Class.forName("java.lang.StringBuilder");
			Field[] f3 = c3.getDeclaredFields(); //summary of fields
			for(int i=0; i<f3.length; i++) {
				System.out.println(f3[i]);
			}
			System.out.println("=======================================");
			Method[] m3 = c3.getDeclaredMethods(); //summary of methods
			for(int i=0; i<m3.length; i++) {				
				System.out.println(m3[i]);
			}
			System.out.println("=======================================");
			Constructor[] con3 = c3.getDeclaredConstructors(); //summary of constructors
			for(int i=0; i<con3.length; i++) {				
				System.out.println(con3[i]);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
