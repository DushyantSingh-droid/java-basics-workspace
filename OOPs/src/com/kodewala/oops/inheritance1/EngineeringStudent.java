package com.kodewala.oops.inheritance1;

public class EngineeringStudent extends Student {
	private String branch;

	EngineeringStudent(String name, String rollNo, int marks, String branch) {
		super(name, rollNo, marks);
		this.branch = branch;

	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Branch is : " + branch);
	}

}
