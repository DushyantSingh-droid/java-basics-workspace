package com.kodewala.practice1;

public class AccountMain {

	public static void main(String[] args) {
		/*Account a = new Account("Ravi", 1000);
		Account b = new Account("Asha");
		System.out.println(a.deposit(500));
		System.out.println(a.withdraw(1500));
		System.out.println(a.withdraw(1));
		System.out.println(a.deposit(0));
		System.out.println(a.getBalance());
		System.out.println(Account.getCount());*/
		
	/*	Account a1 = new Account("Ravi", 1000);
		System.out.println(a1.withdraw(-100));
		System.out.println(a1.getBalance());
		System.out.println(a1.withdraw(0));
		System.out.println(a1.withdraw(1000));
		System.out.println(a1.getBalance());*/
	/*	try { new Account("X", -5); } catch (IllegalArgumentException e) { }
		Account ok = new Account("Real", 100);
		System.out.println(Account.getCount());
		ok.showDetails(); */
		
	/*	SavingsBankAccount s = new SavingsBankAccount("Asha", 1000, 10);
		System.out.println(s.getBalance());
		System.out.println(s.addInterest());
		System.out.println(s.getBalance());
		s.showDetails();*/

		CurrentAccount a = new CurrentAccount("A", 100, 1);
		a.showDetails();
		
		CurrentAccount b = new CurrentAccount("B", 100, 0);
		
		//CurrentAccount c = new CurrentAccount("C", 100, -5);
	/*	try {
		    new CurrentAccount("B", 100, 0);
		} catch (IllegalArgumentException e) {
		    System.out.println("B rejected: " + e.getMessage());
		}*/
		
	}

}
