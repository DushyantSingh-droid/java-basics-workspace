package com.kodewala.practice;

public class BankAccount {

	private String accountHolder;
	private int balance;
	private static int count = 0;

	static {
		System.out.println(" BankAccount classes loaded!!!");
	}
	{
		count++;
	}

	BankAccount(String _accountHolder, int _balance) {
		System.out.println("BankAccount--->BankAccount(String _accountHolder, int _balance)");
		this.accountHolder = _accountHolder;
		this.balance = _balance;
	}

	BankAccount(String _accountHolder) { // delegates to 2 - args constructor
		this(_accountHolder, 0);
		System.out.println("BankAccount--->BankAccount(String _accountHolder)");

	}

	BankAccount() {
		this("unknown"); // delegates to 1 args constructor
		System.out.println("Constructor : () ");
	}

	static int getCount() {
		return count;
	}

}
