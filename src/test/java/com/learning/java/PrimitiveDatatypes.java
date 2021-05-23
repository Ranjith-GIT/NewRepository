package com.learning.java;

public class PrimitiveDatatypes {

	public static void main(String[] args) {
		// Whole Numbers
		byte b = 127;
		byte b1 = (byte) 128; //casting
		short s = 32767;
		short s1 = (short) 32768; //casting
		int i =  2147483647;
		long l = 922337203685477580l;
		// Decimals
		float f = 22/7f;
		double d = 22.0/7;
		//Others
		char c = 'c';
		boolean t = true;
		boolean f1 = false;
		
		Integer i1 = Integer.valueOf(10);   // Non Primitive datatype - Calling Static Method from Integer Class - Concept of wrapper class
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(t);
		System.out.println(f1);
		System.out.println(i1);

	}
}
