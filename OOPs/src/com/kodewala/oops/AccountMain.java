package com.kodewala.oops;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account("Dushyant Singh", "SWIZ9766663", 100, "SWIZ Bank");
		account.doDebit(99);
		System.out.println("YOUR BALANCE : " + account.getBalance());
		System.out.println("YOUR Name : " + account.getName());
		System.out.println("YOUR AccountNo : " + account.getAccountNo());
		System.out.println("YOUR BankName : " + account.getBankName());
	}

}
