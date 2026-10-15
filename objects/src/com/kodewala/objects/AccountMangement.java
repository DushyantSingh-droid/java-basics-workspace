package com.kodewala.objects;

public class AccountMangement {

	public AccountMangement()
	{
		System.out.println("constructor ---> AccountMangement");
	}
	static 
	{
		System.out.println("I am inside the static block");
	}
		

	}
class Account extends AccountMangement{
	String accountNumber;
	{
		System.out.println("Account IIB");
	}
	Account(String _accountNumber){
		super();
		System.out.println("Account (Account(String _accountNumber) Start");
		this.accountNumber = _accountNumber;
		System.out.println("Account (Account(String _accountNumber) End");
	}

}
