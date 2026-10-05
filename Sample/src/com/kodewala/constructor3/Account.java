package com.kodewala.constructor3;

class SuperAccount extends Object{ // this extends to object 
	
	SuperAccount()
	{
		super();
	}
}

public class Account extends SuperAccount { // this extends to SuperAccount
    String accountNo;
    String name;
    String bank;
	
	Account (String _accountNo,String _name,String _bank)
	{
		this(500000000);
		this.accountNo = _accountNo;
		this.name = _name;
		this.bank = _bank;
	}
	
	Account(int balance)
	{
		System.out.println("Account balance is :" + balance);
	}
}
