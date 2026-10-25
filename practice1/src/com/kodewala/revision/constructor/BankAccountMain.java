package com.kodewala.revision.constructor;

public class BankAccountMain {

	public static void main(String[] args) {
	/*	BankAccount a1 = new BankAccount("BA101", "Rahul", 5000);

		SavingsAccount a2 = new SavingsAccount("SA201", "Priya", 15000, 4.5);

		PremiumSavingsAccount a3 = new PremiumSavingsAccount("PA301", "Amit", 50000, 6.5, "Neha");
	//	boolean result = a1.withdraw(7000);
		System.out.println(a1.withdraw(7000));
		a1.showDetails();*/
		BankAccount a = new BankAccount("BA1", "Rahul", 5000);
		System.out.println(a.withdraw(1000));
		System.out.println(a.withdraw(-5));
		System.out.println(a.withdraw(9000));
		System.out.println(a.withdraw(0));
		a.showDetails();
		
	}

}
