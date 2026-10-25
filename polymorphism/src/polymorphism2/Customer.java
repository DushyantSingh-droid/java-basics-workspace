package polymorphism2;

public class Customer {
public static void main (String [] args) {
	ProcessOrder order = new ProcessOrder();
	Clothing clothing = new Clothing();
	order.processOrder(clothing);
}
}
