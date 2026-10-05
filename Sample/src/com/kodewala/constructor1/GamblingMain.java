package com.kodewala.constructor1;

public class GamblingMain {

	public static void main(String[] args) {
		Gambling gambling = new Gambling(50000,"mines",5," bullseye");
		System.out.println(gambling.winning+" "+gambling.game+" "+ gambling.hit+gambling.win);

	}

}
