package com.kodewala.sb;

public class DynamicEmployeeQueryMain {

	public static void main(String[] args) {
		 DynamicEmployeeQuery dynamicEmployeeQuery = new DynamicEmployeeQuery();
		 StringBuilder result = dynamicEmployeeQuery.generateQuery("IT", 1000, "dushyant");
		 System.out.println(result);
	}

}
