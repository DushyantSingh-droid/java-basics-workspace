package com.kodewala.constructor5;

public class PizzaMain {

	public static void main(String[] args) {
		Pizza e1 = new Pizza(1200,"Margrita","Large");
		System.out.println(e1.name+" "+e1.price+" "+ e1.size);
		
		PizzaDefault pizzaDefault = new PizzaDefault();
		pizzaDefault.doSomething1();
		
	}

}
