package com.kodewala.controlflow;

public class FlightFareMain {

	public static void main(String[] args) {
		 FlightFare f1 = new FlightFare();

	        int discount = f1.calculateDiscount(
	                "Delhi",
	                "Mumbai",
	                15000,
	                25,
	                35
	        );

	        System.out.println("Final Discount : " + discount);

	}

}
