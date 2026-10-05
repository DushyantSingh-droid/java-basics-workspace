package com.kodewala.constructor4;

public class JioHotstar {
    String name;
    String phoneNo;
    String id;
    
	JioHotstar(String _name,String _phoneNo,String _id)
	{
		this.name = _name;
		this.phoneNo = _phoneNo;
		this.id = _id;
	}
	JioHotstar()  // No input is taken from user 
	{
		this("guestUser","474884749","JIO4875");
	}
}
