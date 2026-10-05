package com.kodewala.constructor3;

class Super{ // this class extends to object 
	Super()
	{
		super();
	}
}
public class Student { // Student class extend to super

	String name;
	int id;
	String course;
	
	Student (String _name,int _id,String _course)
	{
		this(20);
		this.name = _name;
		this.id = _id;
		this.course = _course;
	}
	 
	Student(int age)
	{
		System.out.println("Constructor Chaining");
	}
}	
