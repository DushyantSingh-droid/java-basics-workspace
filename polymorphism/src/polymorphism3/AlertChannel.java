package polymorphism3;

public class AlertChannel {
  public void sendAlert() {
	  System.out.println("generic alert");
  }
}
class EmailAlert extends AlertChannel{
	@Override
	public void sendAlert() {
		System.out.println("Email alert send");
	}
	public void attachFile() {
		System.out.println("File attached");
	}
}
class MobileAlert extends AlertChannel{
	@Override
	public void sendAlert() {
		System.out.println("Mobile alert send");
	}
}