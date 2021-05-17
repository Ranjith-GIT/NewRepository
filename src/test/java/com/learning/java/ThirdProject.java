package com.learning.java;

public class ThirdProject {

	public static void main(String[] args) {

int a=10, b=20;
System.out.println("Before Swapping the values are " + a + " " + b);

/*int t=a; // t = 10
a=b; // a=20
b=t; // b= 10
*/

a= a+b; // a= 30
b=a-b; // b = 10
a=a-b; // a=20


System.out.println("After Swapping the values are "  + a + " "+ b);


	}

}
