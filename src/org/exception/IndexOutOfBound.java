package org.exception;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBound {
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(10);
		
		Integer ge = li.get(20);
		System.out.println(ge);
	}

}
