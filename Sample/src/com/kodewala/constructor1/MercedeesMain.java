package com.kodewala.constructor1;

 class Mercedees {
     int price;
     String modelName;
     static int gst = 30;
    
     Mercedees(int _price,String _modelName)
     {
    	 System.out.println("about car (int _price,String _modelName)");
    	 this.price = _price;
    	 this.modelName = _modelName;
    	 
     }
}
  
 public class MercedeesMain{
	 public static void main (String args[]) {
		 Mercedees m1 = new Mercedees(30000000,"S - Class");
		 System.out.println(m1.price +" "+m1.modelName);
		 
		 Mercedees m2 = new Mercedees(40000000,"Super - Class");
		 System.out.println(m2.price +" "+m2.modelName);
	 }
 }
