package com.kodewala.constructor5;

public class Groccery extends Product{
    int bestBefore;
    public Groccery(String _name,int _price, String _productId,int _bestBefore)
    {
    	super(_name,_price,_productId);
    	this.bestBefore = _bestBefore;
    }
    
    	
   
}
