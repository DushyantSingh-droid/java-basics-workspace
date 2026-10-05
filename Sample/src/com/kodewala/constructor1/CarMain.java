package com.kodewala.constructor1;

public class CarMain {
	public static void main(String args[]) {
		
		Car c = new Car();
		System.out.println(c.price + " and " + c.brand);
		Car c1 = new Car(30000000, "Mercedes");
		System.out.println(c1.price + " and " + c1.brand);
	}
    
}
