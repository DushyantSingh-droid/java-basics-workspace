package com.kodewala.revision.constructor;

public class BankAccount {
	String accountNumber;
	String accountHolder;
	double balance;
	static int totalAccount;
	public BankAccount(String accountNumber,String accountHolder,double balance) {
		if(accountHolder == null || accountHolder.trim().isEmpty()) {
			throw new IllegalArgumentException("Account holder will require a proper name");
		}
		if(balance < 0) {
			throw new IllegalArgumentException("Blance should we positive");
		}
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		totalAccount++;
		System.out.println("Bank Account");
	}
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			return true;
		}
		else {
			return false;
		}
		
		}
	public boolean withdraw(double amount) {
		if (balance >=amount && amount > 0) {
			balance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
	public void showDetails() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Holder : " + accountHolder);
		System.out.println("Account Balance : " + balance);
		System.out.println("Account count : " + totalAccount);
	}
}
