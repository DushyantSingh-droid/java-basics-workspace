package com.kodewala.constructor4;

public class BurgerMain {
	public static void main (String args[])
	{
		Burger b2 = new Burger(900,"CheeseBurger","large");
		System.out.println(b2.name+" "+b2.price+" "+ b2.size);
		
		BurgerDef d1 = new BurgerDef();
		d1.burgerD1();
	}
 
}
