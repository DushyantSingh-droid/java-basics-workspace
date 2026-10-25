package polymorphism1;

class BankAccount {
public void displayBalance() {
	System.out.println("Display Balance");
}
}
class SavingsAccount extends BankAccount{
	public void calculateInterest() {
		System.out.println("calculating interest");
	}
}
class CurrentAccount extends BankAccount{
	public void checkOverDraft() {
		System.out.println("checking over draft");
	}
}