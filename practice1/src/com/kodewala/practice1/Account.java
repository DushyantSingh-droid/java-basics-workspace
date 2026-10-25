package com.kodewala.practice1;

public class Account {
	private final String holder;
	private final int accountNumber;
	private long balance;
	private static int count = 0;
	private static int nextNo;
	static {
		nextNo = 1001;
	}
	public Account(String holder,long balance) {
		if ( holder == null ||holder.trim().isEmpty() ) {
			throw new IllegalArgumentException("Null or blank field");
		}
		if (balance < 0) {
			throw new IllegalArgumentException("Balance can not be negative");
		}
		this.holder = holder;
		this.balance = balance;
		accountNumber = nextNo++; 
		count++;
	}
	public Account(String holder){
		this(holder,0);
	}
	public boolean deposit(long amount) {
		if(amount > 0) {
		balance = balance + amount;
		return true;
		}
		else {
			return false;
		}
	}
	public boolean withdraw(long amount) {
		if (amount <= balance && amount > 0) {
			balance = balance - amount;
			return true;
		}
		else {
			return false;
		}
	}
	public static int getCount() {
		return count;
	}
	public long getBalance() {
		return balance;
	}
	public void showDetails() {
		System.out.println("Holder : " + holder);
		System.out.println("Acc Number : "+accountNumber);
		System.out.println("Balance : "+balance);

	}
}