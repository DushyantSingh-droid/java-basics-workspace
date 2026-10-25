package override;

public class Account {

public void minimumBalance(String name,int balance) {
	System.out.println("parent class method");
}
public static void userBalance(String _balance) {
	System.out.println("Parent static method");
}
}
class SavingsAccount extends Account{
	@Override
	public void minimumBalance(String _name,int _balance) {
		System.out.println("childs overriden method");
	}
	
	public static void userBalance(String balance) {
		System.out.println(" static method");
	}
}

