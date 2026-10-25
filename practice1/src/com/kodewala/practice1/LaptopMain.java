package com.kodewala.practice1;

public class LaptopMain {

	public static void main(String[] args) {
		Laptop a = new Laptop("Dell", 16, 1024);
		Laptop b = new Laptop("HP", 16);
		Laptop c = new Laptop("Lenovo");
		a.showDetails();
		b.showDetails();
		c.showDetails();
		System.out.println(Laptop.getCount());

	}

}
