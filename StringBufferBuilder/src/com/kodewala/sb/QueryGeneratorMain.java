package com.kodewala.sb;

public class QueryGeneratorMain {

	public static void main(String[] args) {
		QueryGenerator queryGenerator = new QueryGenerator();
		StringBuilder result = queryGenerator.generateQuery(10000, "Dushyant");
		System.out.println(result);

	}

}
