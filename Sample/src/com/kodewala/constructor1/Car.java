package com.kodewala.constructor1;

public class Car {
	int price;
	String brand;
	
	Car()
	{
		System.out.println("About Car");
	}
    Car(int _price, String _brand)
    {
    	System.out.println("About Car (int _price, String _brand)");
    	this.price = _price;
    	this.brand = _brand;
    }
}
