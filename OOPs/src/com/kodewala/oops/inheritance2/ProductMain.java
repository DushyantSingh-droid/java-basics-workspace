package com.kodewala.oops.inheritance2;

public class ProductMain {
	public static void main (String args[]) {
		Product p1 = new Iphone("Electronic Product",1,2,"2");
		p1.productDetails();
		Product p2 = new Vegetables("Grocery", 10,"Fresh from the farm","tomato");
		p2.productDetails();
	}
}
