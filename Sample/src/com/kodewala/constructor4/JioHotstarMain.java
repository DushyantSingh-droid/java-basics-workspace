package com.kodewala.constructor4;

public class JioHotstarMain {
	public static void main(String args[]) {
		
		JioHotstar u1 = new JioHotstar("Dushyant","755847347","JIO75658");
		// Here we are providing the output of the data of user 
		System.out.println(u1.name+" "+u1.id+" "+ u1.phoneNo);
		
		 Signup signup = new Signup();
		 signup.doSomething();
	}
 
}
