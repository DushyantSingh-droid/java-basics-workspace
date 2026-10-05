package com.kodewala.constructor1;

public class Employee {
	int salary;
	String name;
	
	Employee()
	{
		System.out.println("Inside Employee");
	}
	Employee( String _name, int _salary)
	{
		System.out.println("String _name,int _salary");
		this.salary = _salary;
		this.name = _name;
				
	}
}
