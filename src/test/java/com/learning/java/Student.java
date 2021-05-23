package com.learning.java;

public class Student {

	// public static String className = "7thClass";
	private String studentName;
	private long studentPhoneNumber;

	public Student(String studentName, long studentPhoneNumber) {
		this.studentName = studentName;
		this.studentPhoneNumber = studentPhoneNumber;
	}

	public static void main(String[] args) {
		Student ranjith = new Student("Ranjith Kumar", 8147028313l);
		System.out.println(ranjith.getStudentName());
		System.out.println(ranjith.getStudentPhoneNumber());
		ranjith.setStudentPhoneNumber(8147028313l, 9886035510l);
		System.out.println(ranjith.getStudentPhoneNumber());
		System.out.println();
		Student naveen = new Student("Naveen Kumar", 1235647890l);
		System.out.println(naveen.getStudentName());
		System.out.println(naveen.getStudentPhoneNumber());
		naveen.setStudentPhoneNumber(1235647890l, 9876543210l);
		System.out.println(naveen.getStudentPhoneNumber());

		Student[] info = new Student[50];
		info[0] = ranjith;
		info[1] = naveen;
		for (Student info1 : info) {
			try {
				System.out.println(info1.getStudentName() + " " + info1.getStudentPhoneNumber());
			} catch (Exception ex) {

			}
		}
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getStudentPhoneNumber() {
		return studentPhoneNumber;
	}

	public void setStudentPhoneNumber(long studentPhoneNumber, long PhoneNumber) {
		if (this.studentPhoneNumber == Student.getPhoneNumber(studentPhoneNumber)) {
			this.studentPhoneNumber = Student.updatePhoneNumber(PhoneNumber);
			System.out.println("Inside if condition");
		}
	}

	public static long getPhoneNumber(long PhoneNumber) {
		return PhoneNumber;
	}

	public static long updatePhoneNumber(long PhoneNumber) {
		return PhoneNumber;
	}
}
