package com.kodewala.controlflow;

public class FlightDiscount {
	 
     public String discountModule(String dest,String src,int fare) {
    	 if (fare<0) 
    	 {
    			return "Invalid fare";
    	 }
    	 String suggestion;
    	 if (fare <= 5000)
    	 {
    		 int calculated = 0;
    		 suggestion = "No discount for you buddy";
    		 System.out.println(suggestion);
    	 }
    	 else if (fare <= 10000)
    	 {
    		 int calculated = fare * 10/100;
    		 suggestion ="10% Discount applicable";
    		 System.out.println(suggestion+" "+"Discount in RS : "+calculated);
    	 }
    	 else if (fare <= 15000)
    	 {
    		 int calculated = fare * 12/100;
    		     if (calculated>1250)
    		     {
    		    	 calculated =1250;
    		     }
    		 suggestion ="12% Discount applicable";
    		 System.out.println(suggestion+" "+"Discount in RS : "+calculated);
    	 }
    	 else 
    	 {
    		int calculated = 1250;
    		suggestion = "Max discount is 1250rs only";
    		System.out.println(suggestion+" "+"Discount in RS : "+calculated);
    		
    	 }
    	 return suggestion;
     }
}
