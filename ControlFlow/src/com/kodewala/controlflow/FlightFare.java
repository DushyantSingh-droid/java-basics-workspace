package com.kodewala.controlflow;

public class FlightFare {
	public int calculateDiscount(String destination, String source, int fare, int age, int baggage)
	{
		if (fare <0 || age < 0 || baggage < 0) {return -1;}
		
		int calculated ;
		
		if (age>=60) // Discount check for senior citizen
		{
			calculated = fare * 20/100;
			if (calculated > 3000)   // here the value is set to max discount
			{
				calculated = 3000;
			}
			if (baggage > 30 ) 
			{
			   calculated -= 500;
			}
			if (calculated < 0)
			{
				calculated = 0;
			}
			System.out.println("Discount : "+ calculated);
			
		}
		
		else if(age<18) // Discount check for below 18 
		{
			calculated = fare * 15/100;
			if(calculated >2000)
			{
				calculated = 2000;   // here the value is set to max discount
			}
			
			if (baggage > 30 ) 
			{
			   calculated -= 500;
			}
			if (calculated < 0)
			{
				calculated = 0;
			}
			System.out.println("Discount : "+ calculated);

		}
		else   // Discount check for normal people
		{
			if(fare <= 5000)
			{
				calculated = fare * 5 / 100;
				if (baggage > 30 ) 
				{
				   calculated -= 500;
				}
				if (calculated < 0)
				{
					calculated = 0;
				}
				System.out.println("Discount : "+ calculated);
			}
			else if(fare <= 10000)
			{
				calculated = fare * 10 / 100;
				if (baggage > 30 ) 
				{
				   calculated -= 500;
				}
				if (calculated < 0)
				{
					calculated = 0;
				}
				System.out.println("Discount : "+ calculated);
			}
			else if(fare <= 15000)
			{
				calculated = fare * 12 / 100;
				if (baggage > 30 ) 
				{
				   calculated -= 500;
				}
				if (calculated < 0)
				{
					calculated = 0;
				}
				System.out.println("Discount : "+ calculated);
			}
			else 
			{
				calculated = fare * 15 / 100;
				if (calculated > 2500)
				{
					calculated = 2500; // here the value is set to max discount 
				}
				if (baggage > 30 ) 
				{
				   calculated -= 500;
				}
				if (calculated < 0)
				{
					calculated = 0;
				}
				System.out.println("Discount : "+ calculated);
			}
			
		}
		return calculated;
	}
}
