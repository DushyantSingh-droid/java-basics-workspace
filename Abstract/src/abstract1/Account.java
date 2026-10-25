package abstract1;

public class Account {
	public boolean openAccount(String name, String adress,String pan) {
		validateAdressAndName(name,adress);
		validatepan(pan);
		validateAccounttype();
		notifyUser() ;
		validateAccountActivation();
		return true;
	}
	private boolean validateAdressAndName(String name,String adress) {
		System.out.println("Account.validateAdressAndName(String name,String address) : validating Adress And Name");
		return true;
	}
	private boolean validatepan(String pan) {
		System.out.println("validatePan(String pan) : validating pan" );
		return true;
	}
	private boolean validateAccounttype() {
		System.out.println("validateAccounttype() : Account being created" );
		return true;
	}
	private boolean notifyUser() {
		System.out.println("notifyUser()  : Notifying User" );
		return true;
	}
	private boolean validateAccountActivation() {
		System.out.println("validateAccountActivation() : by sending minimum 500" );
		return true;
	}
}
