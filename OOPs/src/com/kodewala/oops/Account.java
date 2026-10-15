package com.kodewala.oops;

public class Account {
 private final String name;
 private final String accountNo;
 private int balance;
 private final String bankName;
public Account(String name, String accountNo, int balance, String bankName) {
	 if (balance < 0) {
	        throw new IllegalArgumentException("Balance cannot be negative");
	    }
	this.name = name;
	this.accountNo = accountNo;
	this.balance = balance;
	this.bankName = bankName;
}
public boolean doCredit(int _amount) {
	if(_amount>0) {
	  this.balance = this.balance + _amount;	
	  return true;
	}else {
		return false;
	}
}
public boolean doDebit(int _amount) {
	
	// Modifying the data 
	if(_amount > 0 && balance >= _amount) {
	this.balance = this.balance - _amount;
	return true;
	}
	else {
		return false;
	}
}
public int getBalance() {
	return balance;
} 
public String getName() {
	return name;
} 
public String getAccountNo() {
	return accountNo;
} 
public String getBankName() {
	return bankName;
} 

}
