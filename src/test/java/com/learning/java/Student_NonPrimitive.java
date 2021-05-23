package com.learning.java;

public class Student_NonPrimitive {

	public static String StudentName = "Student1";
	public String StudentName1 = "Student2"; 
	
	public static void main(String[] args) {
		
		String s1 = Student_NonPrimitive.StudentName;
		//int i = 10;
		
		Student_NonPrimitive s2 = new Student_NonPrimitive ();
		String s3 = s2.StudentName1; 
		System.out.println(s1);
		System.out.println(s3);
		
		
	}

}
