package com.kodewala.oops.inheritance1;

public class Doctor extends Citizen {
	String speciality;
	int experience;
	int surgerys;

	public Doctor(String name, int age, String occupation, String speciality, int experience, int surgerys) {
		super(name, age, occupation);
		this.speciality = speciality;
		this.experience = experience;
		this.surgerys = surgerys;
	}

	@Override
	public void viewDetails() {
		System.out.println("-----------------Doctors Details----------------");
		super.viewDetails();
		System.out.println("Speciality : " + speciality);
		System.out.println("Experirnce : " + experience);
		System.out.println("Surgerys Performed : " + surgerys);

	}
}
