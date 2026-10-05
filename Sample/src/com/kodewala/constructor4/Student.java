package com.kodewala.constructor4;

public class Student {
	String name;
	int age;
	String course;
	public Student(String _name,int _age,String _course)
	{
		this.name = _name;
		this.course = _course;
		this.age = _age;
	}
	public Student()
	{
		this("Guest",18,"Java");
	}
}
