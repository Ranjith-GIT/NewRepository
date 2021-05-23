package com.learning.variables;

public class GlobalVariables {
	
	static int i = 5; 	   // global (static) variable - static keyword
		   int j = 10; //  global (non static) variable - without static keyword
		   
	static GlobalVariables gv1 = new GlobalVariables (); // object created in static way
		  
	public static void main(String[] args) {
		int i = 20; // local variable
		
		System.out.println(GlobalVariables.i); // calling static variable
		
		System.out.println(gv1.j); // calling non static variable using static reference
		
		GlobalVariables gv = new GlobalVariables(); // calling non static variable
		System.out.println(gv.j);
		
		System.out.println(i); // calling local variable
	}
	
}
