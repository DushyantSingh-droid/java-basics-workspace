package com.kodewala.constructor3;

class SuperEmployee extends Object {
	
	SuperEmployee()
	{
		super();
	}
}

public class Employee extends SuperEmployee {

    String name;
    int id;
    String position;
    
    Employee()
    {
    	this(24);
    	
    	
    }
    Employee(int age)
    {
      System.out.println();
    }
}
