package com.kodewala.oops.inheritance;

public class Employee {
	String name = "Amit";
	String address = "Bnagalore";
	private String empCode = "IC123";
	
	public void marksIn (String empId) {
		System.out.println("marking In : " + empId);
	}
}
class Manager extends Employee{
	public void doSomething () {
		System.out.println(name); 
		System.out.println(address); // using parent class attributes 
	//	System.out.println(empCode);
		marksIn(address);  // using parent class method
	}
}
