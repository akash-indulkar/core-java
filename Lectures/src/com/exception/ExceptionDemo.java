package com.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
//		Thread.sleep(500); Non-runtime exceptions are forced to handled
//		System.out.println(args[0]); //but runtime exceptions are not forced to handled
		
		try {			// try block contains risky code
			int i = Integer.parseInt(args[0]);
			if(i<0) {
				throwNewException();
				throw new NegativeNumberException("Negative numbers not allowed"); //we use throw keyword throw exception manually
			}
		}catch(IndexOutOfBoundsException e) { //though it is not forced to handle runtime exception, it is always recommended to handle all exceptions
			e.printStackTrace();
		}catch(NumberFormatException e) { //catch block contains handling code, and will work if there is any specific exception
			e.printStackTrace();
		}catch(Exception e) { //generalized catch block, it should be at last, otherwise it will be compile time error, and it will get executed if upper catch blocks are not able catch a particular exception 
			e.printStackTrace();
		}finally {
			System.out.println("In finally block"); //it will always work whether the exception occurs or not
		}
		System.out.println("End statement");
		
	}
	
	public static void throwNewException() throws Exception{ //throws keyword to delegate the responsibility of handling exception to call method
		throw new Exception(); 
	}
}
