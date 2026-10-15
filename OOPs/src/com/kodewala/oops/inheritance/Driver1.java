package com.kodewala.oops.inheritance;

public class Driver1 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.marksIn("zamura");
		Manager m1 = new Manager();
		m1.marksIn("zhandu");
		m1.doSomething();

	}

}
