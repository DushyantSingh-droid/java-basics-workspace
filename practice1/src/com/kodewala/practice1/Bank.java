package com.kodewala.practice1;

public class Bank {
	private Account accounts[]= new Account[5];
	private int size;
	boolean add(Account a) {
		if (a == null || size  == accounts.length) {
			return false;
		}
		else {
			accounts[size] = a;
			size++;
			return true;
		}
	}
	public int getSize() {
		return size;
	}
    public long totalBalance	() {
    	long total =0;
    	for(int i =0 ;i < size; i++) {
    		total += accounts[i].getBalance();
    	}
    	return total;
    }
}
