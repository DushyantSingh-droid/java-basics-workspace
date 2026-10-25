package abstract1;

public class Product {
	public boolean OrderPlaced(String product,String address,String orderId) {
		paymentStatus();
	    orderId();
	    productExpectedDelivery();
		return true;
	}
	private boolean paymentStatus() {
		System.out.println("Payment Sucessfull");
		return true;
	}
	private boolean orderId() {
		System.out.println("Order Id : PRD8494IO");
		return true;
	}
	private boolean productExpectedDelivery() {
		System.out.println("One Week");
		return true;
	}
}