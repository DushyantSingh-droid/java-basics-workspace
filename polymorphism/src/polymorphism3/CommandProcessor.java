package polymorphism3;

public class CommandProcessor {
	public void execute(Object command) {
		System.out.println("General command : " + command);
	}
}
class SecureCommandProcessor extends CommandProcessor{
	@Override
	public void execute(Object command) {
		System.out.println("Secure command (Object) : " + command);
	}
	public void execute (String command) {
		System.out.println("Secure command (String) : " + command);
	}
}