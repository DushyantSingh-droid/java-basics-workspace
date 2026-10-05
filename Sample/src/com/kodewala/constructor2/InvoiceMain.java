package com.kodewala.constructor2;

class Invoice extends Object {
    static int gst = 18;
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	Invoice (int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName )
	{
		this.amount = _amount;
		this.itemName= _itemName;
		this.billingAddress = _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;
		
	}
}
 public class InvoiceMain {
	 
	public static void main(String args[]) {
        Invoice inv = new Invoice(180000, "iphone18", "BTM bengaluru", "C3458", "Dushyant");
		Invoice inv1 = new Invoice(50000, "oppo", "BTM bengaluru" , "C64574", "Bhanu");
	    System.out.println("1st : "+inv.amount +" "+inv.itemName +" "+inv.customerName +"  "+inv.gst );
	    System.out.println("2nd : "+inv1.amount +" "+inv1.itemName +" "+inv1.customerName +" "+inv1.gst);
		
	}
 }
