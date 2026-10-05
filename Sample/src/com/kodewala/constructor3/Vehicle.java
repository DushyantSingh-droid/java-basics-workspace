package com.kodewala.constructor3;

 public class Vehicle {
	 String brand;
	 Vehicle(String _brand)
	 {
		 this.brand = _brand;
	 }
}
 
 class Car extends Vehicle{
	
	 String model;
	 int price;
	 Car(String _brand,String _model,int _price)
	 {
		 super("Toyota");
		this.model = _model;
		this.price = _price;
		this.brand = _brand;
	 }
	 Car(int _price)
	 {
		super("Toyota");
		System.out.println(_price);
	 }
 }
