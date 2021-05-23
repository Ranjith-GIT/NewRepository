package com.learning.variables;

public class LocalVariables {
	static {
		int i = 10;
		System.out.println(i);
	}

	public static void main(String[] args) {
		int i = 30;
		System.out.println(i);
		
		LocalVariables.add();   // calling add method inside main method
		
	}

	public static void add() {   // add method
		int i = 20;
		System.out.println(i);
	}
}
