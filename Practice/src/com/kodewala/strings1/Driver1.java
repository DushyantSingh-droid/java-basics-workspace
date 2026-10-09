package com.kodewala.strings1;

class User {
	String firstName;
	public User(String firstName) {
		super();
		this.firstName = firstName;
	}
}
public class Driver1 {

	public static void main(String[] args) {
	    String city1 = "Banglore";
	    String city2 = "Banglore";
	    String city3 = "Banglore";
	    String city4 = "Banglore";
	    String city5 = "Banglore";
    System.out.println(city1 == city2);
    System.out.println(city1.equals(city5));
    
    User user1 = new User("kodewala");
    User user2 = new User("kodewala");
    System.out.println(user1.equals(user2)); // false
	}

}
