package com.kodewala.constructor1;

public class Product {
   String productName;
   int price;
   String description;
   String quantity;
   
   Product()
   {
	   System.out.println("inside product()");
   }
   
   Product(String _name, String _description)
   {
	 System.out.println("inside product(String _name, String _descruption)");  
	   this.productName = _name;
	   this.description = _description;
   }
   
   Product(String _name1,int _price,String _description1,String _quantity)
   {
	   System.out.println("inside product(String _name1, int _price, String _descruption1,String _quantity)");
	   this.productName = _name1;
	   this.price = _price;
	   this.description = _description1;
	   this.quantity =_quantity;
   }
   
   
   
}
