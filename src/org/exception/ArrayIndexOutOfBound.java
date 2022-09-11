package org.exception;

public class ArrayIndexOutOfBound {
	
	public static void main(String[] args) {
		
		// Array Index Out of Bound
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 10;
		a[2] = 10;
		a[3] = 10;
		a[4] = 10;
		a[5] = 10;
		
		System.out.println(a[10]);
		// 2 ways we can represent array index out of bound
		// 1. by declaring more number of arrays than the length
		// 2. by declaring to print index out of bound 
		
	}

}
