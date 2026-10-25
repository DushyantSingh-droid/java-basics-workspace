package com.kodewala.oops.inheritance2;

public class CarMain {

	public static void main(String[] args) {
		Car c = new Car("Tata", 4);
		System.out.println(c.accelerate(30));
		System.out.println(c.accelerate(-5));
		System.out.println(c.getSpeed());
		c.honk();
		System.out.println(c.getDoors());
		

	}

}
