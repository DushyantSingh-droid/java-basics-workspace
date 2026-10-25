package com.kodewala.practice1;

public class BankMain {

	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println(bank.add(new SavingsBankAccount("Asha", 1000, 10)));
		System.out.println(bank.add(new CurrentAccount("Ravi", 2000, 300)));
		System.out.println(bank.add(null));
		System.out.println(bank.getSize());
		System.out.println(bank.totalBalance());

	}

}
