package com.kodewala.oops;

public class TeamMain {
	public static void main(String [] args) {
		int [] data = {10 ,20 ,40};
		Team t = new Team(data);
		data[1] = 777;
		int[] got = t.getScores();
		got[0] = 999;

		System.out.println(t.getScores()[0]);

		System.out.println(t.getScores()[1]);
	}
}
