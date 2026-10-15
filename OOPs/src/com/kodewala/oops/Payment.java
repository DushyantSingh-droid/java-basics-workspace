package com.kodewala.oops;

public class Payment {
	private int balance; //
	
	public Payment (int balance) {
		super();
		this.balance = balance;
	}
	public void doDebit(int _amount) {
		
		// Modifying the data 
		if(_amount >= 0 && balance >= _amount) {
		balance = balance - _amount;
		}
	}
	public void doCredit(int _amount) {
		if (_amount > 0) {
			balance = balance + _amount;
		}
	}
	public int  getBalance() {
		return balance;
	}
}
