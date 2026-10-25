package com.kodewala.practice1;

public class TicketMain {

	public static void main(String[] args) {
		System.out.println("hello");
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		t1.showTicket();
		t2.showTicket();
		t3.showTicket();
		System.out.println(Ticket.getNextId());

	}

}
