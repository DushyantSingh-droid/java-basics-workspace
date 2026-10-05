package com.kodewala.constructor1;

public class Account {
	    int amount;
	    String name;
	
		
   
    // if developer is not providing any constructor in a class 
    // constructor (no arg constructor)
    
    Account() 
    {
    	System.out.println("inside Account()");
    }
    Account(int _amount,String _name)
    {
    	System.out.println("inside Account(int_amount,String_name)");
    	this.amount = _amount;
    	this.name = _name;
    }

}
