package com.kodewala.constructor4;

public class StudentMain {
	public static void main (String args[]) {
		Student s1 = new Student("Dushyant",20,"Aiml");
		System.out.println(s1.name+" "+s1.age+" "+ s1.course);
		
		StudentD d1 = new StudentD();
		d1.defaultValues();
	}

}
