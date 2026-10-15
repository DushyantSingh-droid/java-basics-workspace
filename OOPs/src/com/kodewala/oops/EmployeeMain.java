package com.kodewala.oops;

public class EmployeeMain {
	public static void main(String args[]) {
		Employee e1 = new Employee("Ravi", 1000);
		System.out.println(e1.getEmpName());
		System.out.println(e1.getSalary());
		Employee e = new Employee("Ravi", 1000);
		System.out.println(e.raiseSalary(10));
		System.out.println(e.getSalary());
		System.out.println(e.raiseSalary(60));
		System.out.println(e.getSalary());
		System.out.println(e.raiseSalary(0));
		System.out.println(e.getSalary());
		System.out.println(10 / 100);
		System.out.println(1000 * (10 / 100));
		System.out.println(1000 * 10 / 100);
		Employee x = new Employee("X", 50000000);
		x.raiseSalary(50);
		System.out.println(x.getSalary());
	}
}
