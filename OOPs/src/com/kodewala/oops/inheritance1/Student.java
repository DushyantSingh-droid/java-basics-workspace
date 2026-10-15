package com.kodewala.oops.inheritance1;

public class Student {
	private String name;
	private String rollNo;
	private int marks;

	public Student(String name, String rollNo, int marks) {
		if (marks < 0 || marks > 100) {
			throw new IllegalArgumentException("Marks must be between 0 and 100");
		}
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public boolean setMarks(int marks) {
		if (marks < 0 || marks > 100) {
			System.out.println("Invalid marks! Must be between 0 and 100.");
			return false;
		} else {
			this.marks = marks;
			return true;
		}
	}

	public int getMarks() {
		return marks;
	}

	public void displayDetails() {
		System.out.println("The name is : " + name);
		System.out.println("The Roll No is : " + rollNo);
		System.out.println("The marks of student is : " + marks);
	}
}
