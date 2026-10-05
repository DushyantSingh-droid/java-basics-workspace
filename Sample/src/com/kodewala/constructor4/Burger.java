package com.kodewala.constructor4;

public class Burger {
    int price;
    String name;
    String size;
    public Burger(int _price,String _name,String _size)
    {
    	this.price = _price;
    	this.name = _name;
    	this.size = _size;
    	
    }
    public Burger()
    {
    	this(400,"RegularBurger","M");
    }
}
