package com.kodewala.practice1;

public class SavingsBankAccount extends Account {
	private final int ratePercent;

	public SavingsBankAccount(String holder, long balance, int ratePercent) {
		super(holder, balance);
		if (ratePercent < 1 || ratePercent > 20) {
			throw new IllegalArgumentException("Rate Percent can only be in between 1 to 20 ");
		}
		this.ratePercent = ratePercent;
	}
	public long calculateInt() {                         // only calculates, changes nothing
		return getBalance() * ratePercent / 100;
	}

	public boolean addInterest() {                       // changes the balance, through deposit
		return deposit(calculateInt());
	}
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Interest in Rs : " + calculateInt() );
	}
}
