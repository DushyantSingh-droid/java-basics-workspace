package com.kodewala.practice1;

public class Ticket {
	private static int nextId ;
	static {
		System.out.println("static block ran");
		nextId = 500; 
	}
		private final int id;
		public Ticket() {
			this.id = nextId;
			nextId++;
		}
		public void showTicket() {
			System.out.println("Ticket id : "+ id);
		}
		public static int getNextId() {
			return nextId;
		}
	

}
