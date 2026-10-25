package polymorphism3;

public class AlertMain {
  public static void main (String [] args) {
	  AlertDispatcher alertDispatcher = new AlertDispatcher();
	  
	  EmailAlert emailAlert = new EmailAlert();
	  MobileAlert mobileAlert = new MobileAlert();
	  
	  alertDispatcher.dispatch(mobileAlert);
	  alertDispatcher.dispatch(emailAlert);
	  emailAlert.attachFile();
  }
}
