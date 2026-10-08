package com.kodewala.control.flow2;

public class EcommerceApplication {
    public String calculateDiscount(String type,int orderValue) {
    	
    	if(orderValue <= 1000) 
    	{
    		return "Discount not Applied";
    	}
    	int discount = 0;
    	
    	switch(type) {
    
    	case "Gold" :
    	    discount = orderValue * 20 / 100;
    		if(discount > 2500) {
    			discount = 2500;
    		}
    		System.out.println("Discount : " + discount+ " Type " + type);
    		break;
    	case "Silver" :
    		discount = orderValue * 10 / 100;
    		if(discount > 2500) {
    			discount = 2500;
    		}
    		System.out.println("Discount : " + discount+ " Type " + type);
    		break;
    	case "Regular" :
    		discount = orderValue * 5 / 100;
    		if(discount > 2500) {
    			discount = 2500;
    		}
    		System.out.println("Discount : " + discount + " Type " + type);
    		break;
    	default:
    	    return "Invalid customer type";	
    		
    	}
    	int totalBill = orderValue - discount;
    	System.out.println("Total Bill is : " + totalBill);
    	return "Discount";
    	
    }
    public static void main(String args[]) {
    	EcommerceApplication e1 = new EcommerceApplication();
    	String type = args [0];
    	int price = Integer.parseInt(args [1]);
    	e1.calculateDiscount(type,price);
    }
}
