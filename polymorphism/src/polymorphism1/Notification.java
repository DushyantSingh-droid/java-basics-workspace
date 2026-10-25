package polymorphism1;

public class Notification {
	public void send() {
		System.out.println("Sending general notification");
	}
}
class EmailNotification extends Notification{
	@Override
	public void send() {
		System.out.println("Sending email notification");
	}
	public void attachFile() {
		System.out.println("Attaching file");
	}
}
class SMSNotification extends Notification{
	@Override
	public void send() {
		System.out.println("Sending SMS");
	}
	public void checkPhoneNo() {
		System.out.println("checking phone No");
	}
}