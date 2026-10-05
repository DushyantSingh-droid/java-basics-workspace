package com.kodewala.array1;

public class UserMain {

	public static void main(String[] args) {
		
		User user1 = new User("Onion","1 kg");
		User user2 = new User("Tomato","1 kg");
		User user3 = new User("Brinjal","500 gm");
		User user4 = new User("Ladyfinger","500 gm");
		User user5 = new User("potato","2 kg");
    
		//  Storing user object in array
		
		User users[] = new User[5];
		
		users [0] = user1;
		users [1] = user2;
		users [2] = user3;
		users [3] = user4;
		users [4] = user5;
		
		System.out.println(users);
	}

}
