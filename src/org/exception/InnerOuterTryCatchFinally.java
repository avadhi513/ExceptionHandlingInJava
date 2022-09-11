package org.exception;

public class InnerOuterTryCatchFinally {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		try {
			System.out.println(4);
			System.out.println("Outer Try Block");
			
			try {
				System.out.println(4/0);
				System.out.println("Inner Try Block");
			}
			
			catch(ArithmeticException e) {
				System.out.println("Inner Catch Block");
			}                           
			
			finally {
				System.out.println("Inner Finally Block");
			}
			
		}
		
		catch(Throwable e) {
			System.out.println("Outer Catch Block");
		}
		
		finally {
			System.out.println("Finally block");
			System.out.println(5);
		}
		
	}

}
