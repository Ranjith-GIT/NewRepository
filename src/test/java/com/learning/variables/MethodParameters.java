package com.learning.variables;

public class MethodParameters {
	
	public static void main(String[] args) {
		
		System.out.println("Inside the main method");
		int sum = MethodParameters.add(10, 50); // calling method
		System.out.println(sum);
		
		MethodParameters mp = new MethodParameters();
		System.out.println(mp);
		MethodParameters mp1 = mp.objectLevelMethod(mp);
		System.out.println(mp1);
		
		System.out.println(mp.objectLevelMethod(new MethodParameters()));
	}
	
	public static int add (int n1, int n2) { // n1, n2 = Method parameters
		System.out.println("Inside the add method");
		
		double decimal = MethodParameters.decimal(105.5, 14.5);
		System.out.println(decimal);
		
		return n1+n2;
	}
	
	public static double decimal (double d1, double d2) {  // d1, d2 = Method parameters
		System.out.println("Inside the double method");
		return d1+d2;
	}

	public MethodParameters objectLevelMethod (MethodParameters m1) { // m1 = method parameter (non static)
		return m1;
	}
}
