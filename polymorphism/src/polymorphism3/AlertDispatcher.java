package polymorphism3;

public class AlertDispatcher {
    public void dispatch(AlertChannel channel){
    	channel.sendAlert();
    }
}
