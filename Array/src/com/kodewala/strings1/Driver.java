package com.kodewala.strings1;

public class Driver {
	public static void main (String [] args) {
	//--------------obj created using literals -----------------	
	  String myName = "Dushyant";
	  String name = "Dushyant";
	// -------------obj created using new keyword ---------------  
	  String n = new String("Dushyant");
	  //-------- memory location SCP ---> String constantpool -----------
	  System.out.println(myName == name);
	  //--------memory location --> heap ------------
	  System.out.println(myName == n);
	  System.out.println(myName.equals(n));
	}

}
