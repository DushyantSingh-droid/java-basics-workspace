package com.kodewala.controlflow;

public class LoanEligibility {
	public String checkEligibility (String name,int age, int salary, boolean hasGoodCredit)
	{
		if (age > 60)
		{
			return "Not eligible for loan";
		}
		if(age < 0 || salary <0)
		{
			return "Invalid Input";
		}
		
		if ((age >= 25 && salary >= 30000 )|| (age >= 21 && salary >= 50000 && hasGoodCredit))
		{
			System.out.println("Eligible For Loan");
			
		}
		else
		{
		System.out.println("Not Eligible For Loan");
		}
		
		return "Loan";
	}
	
}
