package com.kodewala.oops.inheritance2;

public class Vehicle {
	private final String brand;
	private int speed;
	public Vehicle(String brand) {
		this.brand = brand;
		this.speed = 0;
	}
   public String getBrand() {
	   return brand;
   }
   public int getSpeed() {
	   return speed;
   }
   public boolean accelerate(int amount) {
	   if (amount > 0) {
		   speed = speed + amount;
		   return true;
	   }
	   else {
		   return false;
	   }
   }
	
}
class Car extends Vehicle{
	private int doors;
	public Car(String brand,int doors){
		super(brand);
		this.doors = doors;
	}
	public int getDoors() {
		return doors;
	}
	public void honk() {
		System.out.println(getBrand()+ " says beep");
	}
}
