package com.learning.java;

public class FourthProject {
	public static void main(String args []) {
		System.out.println("Ranjith"+"Kumar"); 
		System.out.println('A'+'B');
		System.out.println ('A'+10);
		System.out.println ('A' + "JAVA");
		System.out.println(10 + 20 + "SUM");
		System.out.println('A' + 'B' + "SUM");
		System.out.println("SUM" + 10 + 20);
		System.out.println('a'); //
		System.out.println(true);
		System.out.println();
		System.out.print("print");
		System.out.println("name");
		System.out.println("Ranjith\"Kumar\"");
		System.out.println("Ranji" + "\t" + "Kumar");
		
		System.out.println(add (10, 20, 30));
		
		int[] ar = {10, 20, 50, 70};
		System.out.println(add1 (ar));
		
	}
	
	public static int add (int... numbers) {
		return numbers [1] + numbers [0];
	}
	
	public static int add1 (int[] numbers) {
		return numbers [3];
	}
}
