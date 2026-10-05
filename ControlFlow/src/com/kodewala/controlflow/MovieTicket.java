package com.kodewala.controlflow;

public class MovieTicket {
	public int calculatedPrice(String movieName, int tickets, int pricePerTicket)
	{
		
		int total = tickets * pricePerTicket;
		if(total < 0)
		{
			return 0;
		}
		
		int calculated;
		
		if(total <= 1000) // this condition checks for no discount
		{
			calculated = total * 0;
			int addMore = 1000 - total;
			System.out.println("Sorry No Discount buddy add more worth :"+addMore+" Rs");
		} 
		else if(total <= 3000) // this condition checks for 10% discount
		{
			calculated = total * 10/100;
			System.out.println(" Discount buddy :"+ calculated+" Rs");
		}  
		else if(total <= 3000) // this condition checks for 10% discount
		{
			calculated = total * 10/100;
			System.out.println(" Discount buddy :"+ calculated+" Rs");
		}  
		else if(total <= 5000) // this condition checks for 15% discount
		{
			calculated = total * 15/100;
			System.out.println(" Discount buddy :"+ calculated+" Rs");
		} 
		else 
		{
			calculated = total * 20/100;
			System.out.println(" Discount buddy :"+ calculated+" Rs");
		}
		return calculated;
	}

}
