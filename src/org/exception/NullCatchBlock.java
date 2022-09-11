package org.exception;

public class NullCatchBlock {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		try {
			String s = null;
			System.out.println(s.length());
		}
		
		catch(NullPointerException e) {
			System.out.println("Catch Block");
		}
		
		finally {
			System.out.println("Finally block");
			System.out.println(5);
		}
		
	}

}
