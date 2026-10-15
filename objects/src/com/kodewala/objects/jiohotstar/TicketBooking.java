package com.kodewala.objects.jiohotstar;

public class TicketBooking {
	String name;
	String bookingId;
	String mobileNo;
	public static int count = 0;
	static 
	{
		System.out.println("Ticket Booking Started");
	}
	TicketBooking(String _name,String _bookingId,String _mobileNo)
	{
		System.out.println("TicketBooking ---->TicketBooking(String _name,String _bookingId)");
		this.name = _name;
		this.bookingId = _bookingId;
		this.mobileNo = _mobileNo;
		
	}
	TicketBooking()
	{
		
	}
	{
		count++;
	}
	public static void main (String args[]) {
		for (int i = 1; i <10; i++) {
		TicketBooking t1 = new TicketBooking();
		}
		System.out.println("The no. of Ticket Booked : " + count);
		
	}

}
