package com.kodewala.constructor4;

public class Student1 {
	String name;
	int age;
	String course;
	static int count = 0;
	Student1(String _name,int _age, String _course)
	{
		this.name = _name;
		this.age = _age;
		this.course = _course;
		System.out.println("Student1 : Student1(String _name,int _age, String _course)");
		count ++;
	}
	Student1(String _name,int _age)
	{
	    this(_name ,_age,"java");
	    System.out.println("Student : Student1(String _name,int _age)");
	}
	Student1(String _name){
		this(_name,18,"java");
	}
}
