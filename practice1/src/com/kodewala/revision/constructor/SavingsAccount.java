package com.kodewala.revision.constructor;

public class SavingsAccount extends BankAccount {
	double interestRate;
	public SavingsAccount(String accountNumber,String accountHolder,double balance,double interestRate) {
		super(accountNumber,accountHolder,balance);
		this.interestRate = interestRate;
		System.out.println("SavingsAccount Constructor");
	}
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Interest Rate : " + interestRate);
	}
}
class PremiumSavingsAccount extends SavingsAccount {
	String relationShipManager;
	public PremiumSavingsAccount(String accountNumber,String accountHolder,double balance,double interestRate,String relationShipManager) {
		super(accountNumber,accountHolder,balance,interestRate);
		this.relationShipManager = relationShipManager;
	}
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Relation Ship Manager : " + relationShipManager);
		
	}
}
