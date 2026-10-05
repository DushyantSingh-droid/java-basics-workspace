package com.kodewala.constructor2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationService notificationService = new NotificationService ();
		notificationService.sendNotification("sms");
		notificationService.sendNotification("email");
		notificationService.sendNotification("whatsapp");
 
	}

}
