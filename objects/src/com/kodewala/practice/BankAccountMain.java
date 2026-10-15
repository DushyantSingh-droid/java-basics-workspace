package com.kodewala.practice;

public class BankAccountMain {
	public static void main(String args[]) {
		System.out.println("HELLO");
		// int balance = Integer.parseInt(args[1]);
		// String accountHolder = args[0];
		BankAccount c1 = new BankAccount("Dushyant", 100000);
		BankAccount c2 = new BankAccount("Abhay");
		BankAccount c3 = new BankAccount();
		System.out.println("Account holder count : " + BankAccount.getCount());
		System.out.println("Account holder count ENDED !!!");

	}
}
