package com.kodewala.oops.inheritance1;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student("Asha", "101", 85);
		s1.setMarks(150); // prints the invalid message
		System.out.println(s1.getMarks()); // 85
		s1.setMarks(90);
		System.out.println(s1.getMarks()); // 90
		Student s2 = new EngineeringStudent("Dushyant", "897", 90, "AIML");
		s2.displayDetails();
		Student s3 = new SchoolStudent("Dushyant", "897", 90,"A");
		s3.displayDetails();
	}

}
