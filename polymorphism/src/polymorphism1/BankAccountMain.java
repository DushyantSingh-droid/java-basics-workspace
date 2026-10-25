package polymorphism1;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount a1 = new SavingsAccount();
        a1.displayBalance();
        SavingsAccount s1 = (SavingsAccount)a1;
        s1.calculateInterest();
        BankAccount a2 = new CurrentAccount();
        CurrentAccount c1 = (CurrentAccount)a2;
        c1.checkOverDraft();
     //   SavingsAccount s2 = (SavingsAccount) a2;
      //  s2.calculateInterest();
	}

}
