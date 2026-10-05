package com.kodewala.array1;

public class AccountMain {
	public static void main (String args[])
	{
		AccountBalance a1 = new AccountBalance ("dushyant","2300","874848489");
		AccountBalance a2 = new AccountBalance ("paji","1700","575858488");
		AccountBalance a3 = new AccountBalance ("abhay","200","4738873636");
		AccountBalance a4 = new AccountBalance ("bhanu","6700","355466377");
		AccountBalance a5 = new AccountBalance ("babu","2","3763838774");
		AccountBalance a6 = new AccountBalance ("badal","9786","674737736373");
		
	   // Storing the obj in array
		
		AccountBalance accountBalance[] = new AccountBalance[6] ;
		
		   accountBalance[0] = a1;
		   accountBalance[1] = a2;
		   accountBalance[2] = a3;
		   accountBalance[3] = a4;
		   accountBalance[4] = a5;
		   accountBalance[5] = a6;
		   
		   
		   // for balance below 2000
		  /* for(int i = 0; i < accountBalance.length; i++  )
		   {
			   if (Integer.parseInt(accountBalance[i].balance) < 2000)
			   {
				   System.out.println(accountBalance[i].customerName + " : " + accountBalance[i].balance);
			   }
		   }*/
		   
		   // for lowest balance 
		  /* AccountBalance lowestAccount = accountBalance[0];
		   
		   
		   int lowestBalance = Integer.parseInt(accountBalance[0].balance);
		   
		   for (int i =0; i < accountBalance.length; i++)
		   {
			   if (Integer.parseInt(accountBalance[i].balance) < lowestBalance)
					   {
				          lowestBalance = Integer.parseInt(accountBalance[i].balance);
				          lowestAccount = accountBalance[i];
					   }*/
		     
		   
		   
		   //   Finding maximum account value
		   
       /*    AccountBalance maxAccount = accountBalance[0];
		   
		   
		   int maxBalance   = Integer.parseInt(accountBalance[0].balance);
		   
		   for (int i =0; i < accountBalance.length; i++)
		   {
			   if (Integer.parseInt(accountBalance[i].balance) > maxBalance )
					   {
				   maxBalance  = Integer.parseInt(accountBalance[i].balance);
				   maxAccount  = accountBalance[i];
					   }*/
			   
			   
			   
			   // counting the balance of person whose balance is above 5000
		       
		    /*   int count = 0;

			   
			   for (int i =0; i < accountBalance.length; i++)
			   {
				   if (Integer.parseInt(accountBalance[i].balance) > 5000 )
						   {
					   count = count + 1;
					   System.out.println(accountBalance[i].customerName + " " + accountBalance[i].balance);
						   }*/
		   
		   
		   // finding persons with their first letter name
		   
		   for (int i = 0; i < accountBalance.length; i++)
		   {
			   if(accountBalance[i].customerName.startsWith("b"))
			   {
				   System.out.println("name starting with b : "+ accountBalance[i].customerName );  
			   }
		   }
		   
		   
			  
		   
		   
		  // }
		 //  System.out.println("Name : " + lowestAccount.customerName);  // prints lowest balance
		 //  System.out.println("Balance : " + lowestAccount.balance);
		   
		//   System.out.println("Name : " + maxAccount.customerName);
		  // System.out.println("Balance : " + maxAccount.balance);
			   
		//	   System.out.println("persons above 5000 balance : " + count);
	}
	

}
