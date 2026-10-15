package com.kodewala.oops.inheritance1;

public class Driver {

	public static void main(String[] args) {
		Product p1 = new Product("iphone","this is iphone",12,"In stock");
		p1.viewProductDetails();
		ElectronicProduct e1 = new ElectronicProduct("iphone","this is iphone",12,"In stock",true,3);
		e1.viewDetails();
		Clothing c1 = new Clothing("pajama","comfortable",5,"In transit","red","cotton","rajasthani");
		c1.veiwDetails1();
	}

}
