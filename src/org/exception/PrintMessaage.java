package org.exception;

public class PrintMessaage {
	
	public static void main(String[] args) {
		
		// To know which exception it is
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		try {
			System.out.println(4/0);
		}
		
		catch(NullPointerException e) {
			System.out.println("Catch Block");
		}
		
		catch(Throwable e) {
			System.out.println("Super Catch Block");
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
		finally {
			System.out.println("Finally block");
			System.out.println(5);
		}
		
	}

}
