package polymorphism3;

public class CommandDemo {

	public static void main(String[] args) {
		CommandProcessor cp1 = new SecureCommandProcessor();
		cp1.execute("Delete");
		SecureCommandProcessor scp = new SecureCommandProcessor();
        scp.execute("Delete");
        scp.execute(Integer.valueOf(403));
        cp1.execute("Restart");
	}

}
