package com.learning.java;

public class Concatination {t
	public static void main(String args []) {
		System.out.println("Ranjith"+"Kumar"); // RanjithKumar
		System.out.println('A'+'B');           // 131
		System.out.println ('A'+10);           // 75
		System.out.println ('A' + "JAVA");     // AJAVA
 		System.out.println(10 + 20 + "SUM");   // 30SUM
		System.out.println('A' + 'B' + "SUM"); // 131SUM
		System.out.println("SUM" + 10 + 20);   // SUM1020
		System.out.println('A'); 			   // A
		System.out.println(true);              // true
		System.out.println();  				   // 
		System.out.print("print");			   // printname
		System.out.println("name");			   // 
		System.out.println("Ranjith\"Kumar\""); //  Ranjith "Kumar"
		System.out.println("Ranji" + "\t" + "Kumar"); //  Ranji		Kumar
		
		System.out.println(add (10, 20, 30));
		
		int[] ar = {10, 20, 50, 70};
		System.out.println(add1 (ar));
		
	}
	
	public static int add (int... numbers) {
		return numbers [2] + numbers [0];
	}
	
	public static int add1 (int[] numbers) {
		return numbers [3];
	}
}
