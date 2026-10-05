package com.kodewala.constructor1;

public class EmployeeMain {
	public static void main (String args[]) {
		Employee e = new Employee ();
		System.out.println(e.name + " and " + e.salary);
		
		Employee e1 = new Employee("jatin Lucha",3000);
		System.out.println(e1.name + " and " + e1.salary);
		

	}

}
