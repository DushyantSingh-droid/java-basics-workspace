package abstract1;

abstract class Payment {
	abstract void pay(int amount);
}
class CreditCardPayment extends Payment{
	@Override
	 void pay(int amount) {
		System.out.println("Credit Card Payment : " + amount);
	}
	
}
class UpiPayment extends Payment{
	@Override
	 void pay(int amount) {
		System.out.println("UpiPayment : " + amount);
	}
}
