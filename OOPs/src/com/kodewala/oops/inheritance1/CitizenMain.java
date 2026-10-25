package com.kodewala.oops.inheritance1;

public class CitizenMain {

	public static void main(String[] args) {
		Doctor d1 = new Doctor("ANUJ", 31, "Doctor", "Neurologist", 5, 8);
		d1.viewDetails();
		ArmyPersonel armyPersonel = new ArmyPersonel("Abhay Singh", 21, "Military", 4, "Captain");
		armyPersonel.viewDetails();
		Citizen c = new Doctor("ANUJ", 31, "Doctor", "Neurologist", 5, 8);
		c.viewDetails();
		
	}

}
