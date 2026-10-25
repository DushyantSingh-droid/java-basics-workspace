package override;

public class AccountMain {
	public static void main(String[] args) {
		Account a1 = new SavingsAccount();
		a1.minimumBalance("Dushyant", 9);
		a1.userBalance("890");
	}
}
