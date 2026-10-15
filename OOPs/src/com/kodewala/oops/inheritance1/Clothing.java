package com.kodewala.oops.inheritance1;

public class Clothing extends Product {
	String fabric;
	String colour;
	String type;
	public Clothing(String productName, String description, int quantity, String status, String fabric, String colour,
			String type) {
		super(productName, description, quantity, status);
		this.fabric = fabric;
		this.colour = colour;
		this.type = type;
	}
	public void veiwDetails1() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		System.out.println(fabric);
		System.out.println(colour);
		System.out.println(type);
	}
}
