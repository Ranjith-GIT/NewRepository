package com.learning.java;

public class Reinizialization {
	
	static int j = 100;
		   int k = 150;

	public static void main(String[] args) {
		int i = 50;
		System.out.println(i); // 50
		System.out.println(i=500); // 500
		 
		System.out.println(j); // 100
		Reinizialization.j = 1000;
		System.out.println(j);  // 1000
		
		Reinizialization r = new Reinizialization();
		System.out.println(r.k); // 150
		
		r.k = 1500;
		System.out.println(r.k); // 1500

	}

}
