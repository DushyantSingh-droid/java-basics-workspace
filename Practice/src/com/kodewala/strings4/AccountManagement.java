package com.kodewala.strings4;

public class AccountManagement {
	final int UPI_Limit = 100000; // it is set as final cant be changed

	public final void doSomething() {
		// UPI_LIMIT = 200000; // can not be changed
	}

	public void doSomething2() {

	}
}

class Account extends AccountManagement {
	@Override
	public void doSomething2() // but we can not override the final method
	{

	}

	public void doSomething2(int price) // we can overload
	{

	}
}
