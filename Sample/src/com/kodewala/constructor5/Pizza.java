package com.kodewala.constructor5;

public class Pizza {
    int price;
    String name;
    String size;
    
   public Pizza(int _price, String _name, String _size)
    {
       	this.price = _price;
       	this.name = _name;
       	this.size = _size;
    }
   public Pizza()
   {
	   this(200,"Regular Pizza", "Medium");
   }
}
