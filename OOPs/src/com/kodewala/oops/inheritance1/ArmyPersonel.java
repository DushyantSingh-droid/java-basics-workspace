package com.kodewala.oops.inheritance1;

public class ArmyPersonel extends Citizen {
	int served;
	String rank;

	public ArmyPersonel(String name, int age, String occupation, int served, String rank) {
		super(name, age, occupation);
		this.served = served;
		this.rank = rank;
	}

	@Override
	public void viewDetails() {
		System.out.println("----------------Army Personel----------------");
		super.viewDetails();
		System.out.println("Served : " + served);
		System.out.println("Rank : " + rank);
	}
}
