package com.kodewala.oops.inheritance2;

class Account {
	public void openAccount(String userId,String email,int balance)
	{
		System.out.println("Account.openAccount");
	}	
}
class SavingAccount extends Account {
	@Override
	public void openAccount(String userId,String email,int balance)
	{
		System.out.println("openAccount.openAccount");
	}	
}
class SrCitAccount extends Account {
	@Override
	public void openAccount(String userId,String email,int balance)
	{
		System.out.println("SrCitAccount.openAccount");
	}	
}
class PensionAccount extends Account {
	@Override
	public void openAccount(String userId,String email,int balance)
	{
		System.out.println("PensionAccount.openAccount");
	}	
}
