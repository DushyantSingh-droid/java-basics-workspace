package my.first.project;

import java.util.Scanner;

class Employee {
	int employeeId;
	String employeeName;
	int salary;
	int experience;

	Employee(int _employeeId, String _employeeName, int _salary, int _experience) {
		this.employeeId = _employeeId;
		this.employeeName = _employeeName;
		this.salary = _salary;
		this.experience = _experience;
	}

	Employee() {
		super();
	}

	public int calculateBonus() {
		if (experience < 0) {
			return -1;
		}
		if (salary < 0) {
			return -2;
		}
		int bonus = 0;
		if (experience < 2) {
			bonus = salary * 5 / 100;
		} else if (experience <= 5) {
			bonus = salary * 10 / 100;
		} else {
			bonus = salary * 15 / 100;
		}
		return bonus;
	}

	public void displayDetails() {
		System.out.println("Employee ID : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Employee Salary : " + salary);
		System.out.println("Employee Experience : " + experience);
		System.out.println("BONUS !! : " + calculateBonus());
	}
}

public class EmployeeManagementSystem {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter inputs :");
		int employeeId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter inputs :");
		String employeeName = sc.nextLine();

		System.out.println("Enter inputs :");
		int salary = sc.nextInt();

		System.out.println("Enter inputs :");
		int experience = sc.nextInt();
		Employee e1 = new Employee(employeeId, employeeName, salary, experience);
		e1.displayDetails();
	}

}
