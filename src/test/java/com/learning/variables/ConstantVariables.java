package com.learning.variables;

public class ConstantVariables {
	
	static final int i = 55;
		   final double d = 63.70;
	
	public static void main(String[] args) {
		
		final int j = 100;
		
		System.out.println(j);
		
		System.out.println(i);
	//  System.out.println(i = 60); // we cannnot change the values which are final
		
		ConstantVariables cv = new ConstantVariables();
		System.out.println(cv.d);
		
	//	System.out.println(cv.d = 50); // cannot change the value
		
	}

}
