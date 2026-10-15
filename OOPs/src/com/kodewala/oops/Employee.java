package com.kodewala.oops;

public class Employee {
	private final String empName;
	private int salary;
	public Employee(String empName, int salary) {
		if (salary <= 0) {
			throw new IllegalArgumentException("Salary must be positive");
		}
		this.empName = empName;
		this.salary = salary;
	}
	public boolean raiseSalary (int percent) {
		if(percent < 1 || percent > 50) {
			return false;
		}
		else {
			salary = salary +(int)((long) salary * percent / 100);
			return true;
		}
	}
	public String getEmpName() {
		return empName;
	}
	public int getSalary() {
		return salary;
	}
}
