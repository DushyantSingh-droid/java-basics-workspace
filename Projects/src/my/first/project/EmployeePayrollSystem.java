package my.first.project;

class Employee1 {
	int employeeId;
	String employeeName;
	int salary;
	int experience;

	Employee1(int _employeeId, String _employeeName, int _salary, int _experience) {
		this.employeeId = _employeeId;
		this.employeeName = _employeeName;
		this.salary = _salary;
		this.experience = _experience;
	}

	public int calculateBonus() {
		int bonus = 0;
		if (salary < 0 || experience < 0) {
			return -1;
		}
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
		int bonus = calculateBonus();
		if (bonus < 0) {
			return;
		}
		System.out.println("BONUS !! : " + calculateBonus());

	}
}

class PermanentEmployee extends Employee1 {
	int benefits;

	PermanentEmployee(int benefits, String _employeeName, int _employeeId, int _salary, int _experience) {
		super(_employeeId, _employeeName, _salary, _experience);
	}

	public int calculateTotalCompensation() {
		if (calculateBonus() < 0) {
			return -1;
		}

		int totalCompensation = salary + benefits + calculateBonus();

		return totalCompensation;
	}
}

public class EmployeePayrollSystem {
	public static void main(String args[]) {
		Employee1 t1 = new Employee1(483738, "Dushyant", 100000, 5);
		Employee1 t2 = new Employee1(483738, "jatin", 100000, 5);
		Employee1 t3 = new Employee1(483738, "Abhay", 100000, 5);
		PermanentEmployee t4 = new PermanentEmployee(7000,"Bhanu",483738,  100000, 5);
		PermanentEmployee t5 = new PermanentEmployee(7000,"Aniket",483738,  100000, 5);

		Employee1[] employee = new Employee1[5];
		employee[0] = t1;
		employee[1] = t2;
		employee[2] = t3;
		employee[3] = t4;
		employee[4] = t5;

		for (int i = 0; i < employee.length; i++) {
			employee[i].displayDetails();
		}
	}

}
