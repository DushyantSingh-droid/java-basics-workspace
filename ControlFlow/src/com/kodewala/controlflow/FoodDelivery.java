package com.kodewala.controlflow;

public class FoodDelivery {
	
	public String calculatedBill(String resturant, int orderAmount, int distance) {
		int discount = 0;
		int deliveryCharges = 0;
		
		// Checking for discount category
		if (orderAmount < 0 || distance < 0) 
		{
		    return "invalid input";	
		}
		if(orderAmount <= 500)             
		{
			System.out.println("NO DISCOUNT");
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
			discount = orderAmount * 20 /100;
			
		}
		// Price after discount calculation
		int priceAfterDiscount = orderAmount - discount;
		
		// Checking for the distance category in which it falls 
		if (distance <= 5) 
		{
			deliveryCharges = 40;
		}
		else if(distance <= 10)
		{
			deliveryCharges = 80;
		}
		else
		{
			deliveryCharges = 120;
		}
		// Calculating total bill
		int totalBill = priceAfterDiscount + deliveryCharges;
		
		System.out.println("Resturant : "+ resturant);
		System.out.println("Price After Discount : "+ priceAfterDiscount);
		System.out.println("Total Bill : "+ totalBill);
		System.out.println("Delivery Charges : "+ deliveryCharges);
		System.out.println("Discount : "+ discount);
		
		return "order proccesed succesfully";
	}
}
