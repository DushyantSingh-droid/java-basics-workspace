package com.kodewala.strings4;

import java.util.Scanner;

public class EmployeeQueryGeneratorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeQueryGenerator employeeQueryGenerator = new EmployeeQueryGenerator();
		System.out.print("Enter department : ");
		String department = sc.nextLine();
		System.out.print("Enter salary : ");
		int salary = sc.nextInt();

		StringBuilder result = employeeQueryGenerator.queryGenerator(department, salary);
		System.out.println(result);
		sc.close();

	}

}
