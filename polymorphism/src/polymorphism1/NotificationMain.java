package polymorphism1;

public class NotificationMain {

	public static void main(String[] args) {
		Notification notification [] = {new EmailNotification(),new EmailNotification(),new SMSNotification()};
		//Notification a1 = new EmailNotification();
		//Notification a2 = new EmailNotification();
		//Notification a3 = new SMSNotification();
		//Notification [] notification = new Notification[3];
		// notification [0] = a1;
		// notification [1] = a2;
		// notification [2] = a3;
 		for(int i = 0; i< notification.length;i++) {
			if (notification[i] instanceof EmailNotification) {
				((EmailNotification)notification[i]).send();
				((EmailNotification) notification[i]).attachFile();
			}
			else if (notification[i] instanceof SMSNotification) {
				((SMSNotification)notification[i]).send();
				((SMSNotification)notification[i]).checkPhoneNo();
			}
			else {
				System.out.println("obj is niether email nor sms");
			}
		}
	}

}
