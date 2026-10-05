package com.kodewala.constructor1;

public class Driver1 {
  public static void main(String args[]) {
	  
	 Product pro = new Product();
	 System.out.println(pro.price + " and " + pro.productName);
	 Product pro1 = new Product("iphone","upgrade yourself with the latest tech");
	 System.out.println(pro1.productName+ " and " + pro1.description);
	 Product pro2 = new Product("bananaPhone",300000,"you buy iphone when you want to be someone you buy banana phone when you are someone","1 piece");
	 System.out.println(pro2.productName+ " and " +pro2.price+ " and " + pro2.description + " and " + pro2.quantity);
  }
}
