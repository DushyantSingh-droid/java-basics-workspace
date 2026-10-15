package com.kodewala.oops;

public class StudentMain {
	public static void main(String args[]) {
		Student s1 = new Student("Dushyant", 78);
		Student s2 = new Student("Ravi", 500);
		System.out.println(s1.getName());
		System.out.println(s1.getMarks());
		System.out.println(s2.getName());
		System.out.println(s2.getMarks());
		System.out.println("invalid marks :)");

	}
}
