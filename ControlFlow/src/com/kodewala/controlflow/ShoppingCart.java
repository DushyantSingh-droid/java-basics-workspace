package com.kodewala.controlflow;

public class ShoppingCart {
    public String cart(String product,String quantity,int price)
    {   
    	if(price < 0)
    	{
    		return "invalid input";
    	}
    	String suggestion;
    	
    	if (price <= 2000)
    	{
    		int Discount = price * 0;
    		suggestion = "No discount for you buddy";
    		System.out.println(suggestion + " "+ "Discount : " + Discount);
    	}
    	else if (price <= 5000)
    	{
    		int Discount = price * 5/100;
    		suggestion = "discount applied for you buddy";
    		System.out.println(suggestion + " "+ "Discount : " + Discount);
    	}
    	else if (price <= 10000)
    	{
    		int Discount = price * 10/100;
    		suggestion = "discount applied for you buddy";
    		System.out.println(suggestion + " "+ "Discount : " + Discount);
    	}
    	else
    	{
    		int Discount = price * 15/100;
    		suggestion = "discount applied for you buddy";
    		System.out.println(suggestion + " "+ "Discount : " + Discount);
    	}
    	return suggestion;
    }
}
