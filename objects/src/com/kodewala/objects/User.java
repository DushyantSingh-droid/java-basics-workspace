package com.kodewala.objects;

public class User {
	String name;
	String userId;
	String mobileNo;
	
	// static block will get executed just after the class loading 
	static
	{
		System.out.println("I am inside the static block");
	}
	public User (String _name,String _userId,String _mobileNo)
	{
		super();
		System.out.println("User.User (String _name,String _userId,String _mobileNo)....constructor");
		this.name = _name ;
		this.userId = _userId;
		this.mobileNo = _mobileNo;
		
	}
}
