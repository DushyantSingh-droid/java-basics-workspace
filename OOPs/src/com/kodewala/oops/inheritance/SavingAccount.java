package com.kodewala.oops.inheritance;

public class SavingAccount extends Account{
	public void openSavingAccount(String name,String address,String type) {
		openBankAccount(name,address,type);
	}
}
