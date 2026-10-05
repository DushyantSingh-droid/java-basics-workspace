package com.kodewala.controlflow;

public class MakeMyTrip {
    public String discountModule (String dest,String src,int fare )
    {
     double calculated = 0 ;
    String response;
    
    	if (fare <= 5000)
    	{
    		//No Discount Applicable 
    		calculated = fare * 0;
    		response = "No Discount For You BUDDY";
    		System.out.println("Discount  : " + calculated+ " "+ response);
    	}
    	else if (fare <= 10000)
    	{
    		// Discount Applicable 
    		calculated = fare*10/100;
    		response = "10% Discount Applicable For You BUDDY";
    		System.out.println("Discount : " + calculated+ " "+ response);
    	}
    	else if (fare <= 15000)
    	{
    		// Discount Applicable
    		calculated = fare*12/100;
    		    if (calculated > 1250)
    		      {
    		        calculated = 1250;
    		      }
    		response = "12% Discount Applicable For You BUDDY";
    		System.out.println("Response : " + calculated + " "+ response);
    	}
    	else
    	{    
    		if (calculated > 1250)
	      {
	        calculated = 1250;
	      }
    		// Discount Applicable
    		response = "1250 Rs Discount Applicable For You BUDDY";
    		System.out.println("Response : "+calculated +" "+ response);
    	}
    	return response;
    }
    
}
