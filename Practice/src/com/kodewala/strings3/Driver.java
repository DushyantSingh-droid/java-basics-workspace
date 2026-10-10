package com.kodewala.strings3;

public class Driver {

	public static void main(String[] args) {
		String s1 = "Dushyant is " + "going to be " + "Placed "; // SCP
		System.out.println(s1);

		String s2 = "kodewala"; // SCP
		String s3 = "Academy"; // SCP

		String s4 = s2 + s3; // heap ---> new StringBuilder();
		String s6 = "kodewalaAcademy";
		System.out.println(s4);
		System.out.println(s6 == s4.intern());

		String s5 = new String("Abhay" + "  jatin  " + "Dushyant");
		System.out.println(s5);
	}

}
