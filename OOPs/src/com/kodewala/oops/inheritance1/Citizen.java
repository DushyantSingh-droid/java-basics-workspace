package com.kodewala.oops.inheritance1;

public class Citizen {
	String name;
	int age;
	String occupation;

	public Citizen(String name, int age, String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}

	public void viewDetails() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Occupation : " + occupation);
	}

}
