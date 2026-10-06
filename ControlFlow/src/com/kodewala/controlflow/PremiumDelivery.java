package com.kodewala.controlflow;

public class PremiumDelivery {
	public String calculatedBill(String resturant,int orderAmount,int distance, boolean isPrime) {
		int discount = 0;
		int deliveryCharges = 0;
		if(orderAmount < 0 || distance < 0)
		{
			return "Invalid input";
		}
		// Checking for Discount Category ---------------
		if (orderAmount <= 500)
		{
			discount = 0;
		}
		else if(orderAmount <= 1000)
		{
			discount = orderAmount * 10 / 100 ;
		}
		else if(orderAmount <= 2000)
		{
			discount = orderAmount * 15 / 100;
		}
		else 
		{
			discount = orderAmount * 20 / 100;
		}
		// calculating price after discount  --------------
		int priceAfterDiscount = orderAmount - discount;
		
		if (distance <= 5)
		{
			deliveryCharges = 40;
			if (isPrime) {      
				deliveryCharges = 0;
			}
		}
		else if (distance <= 10)
		{
			deliveryCharges = 80;
			if (isPrime) { 
				deliveryCharges = 0;
			}
	
		}
		else
		{
			deliveryCharges = 120;
			if (isPrime) {  
				deliveryCharges = 50;
			}
	
		}
		// Calculated total bill 
		int totalBill = priceAfterDiscount + deliveryCharges;
		
		// printing outputs --------------------------------------
		System.out.println("Resturant : "+ resturant);
		System.out.println("Total Bill : "+ totalBill);
		System.out.println("Delivery Charges : "+ deliveryCharges);
		System.out.println("Discount : "+ discount);
		System.out.println("Prime Member : "+ isPrime);

      return "order processed ";
		
	}
}
