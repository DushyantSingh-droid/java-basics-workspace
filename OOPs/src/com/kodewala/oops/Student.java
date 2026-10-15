package com.kodewala.oops;

public class Student {
	private final String name;
	private int marks;

	public Student(String name, int marks) {
		if (marks < 0 || marks > 100) {
			throw new IllegalArgumentException("Marks must be between 0 and 100");
		}
		this.name = name;
		this.marks = marks;
	}

	public boolean setMarks(int marks) {
		if (marks >= 0 && marks <= 100) {
			this.marks = marks;
			return true;
		} else {
			return false;
		}
	}

	public int getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}
}
