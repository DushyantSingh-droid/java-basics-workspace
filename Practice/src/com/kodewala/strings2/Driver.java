package com.kodewala.strings2;

public class Driver {
     public static void main(String args []) {
    	 String p1 = "Dushyant";
    	 String p2 = "Dushyant";
    	 String p3 = "kodewala";
    	 String p4 = "A";
    	 System.out.println(p1==p2);
    	 
    	 String s1 = new String ("kodewala");
    	 String s2 = new String ("kodewala");
    	 String s3 = new String("a");
    	 System.out.println(s1==s2);
 //------------( .equals compare the content in case of string location doesnt matter we can ovveride it according to class)-----------------   	 
    	 System.out.println(p3.equals(s2));
    	 System.out.println(s1.equals(s2));
    	 
  //-------"A" and "a" are different but we used equalsIgnoreCase-----------	 
    	 System.out.println(s3.equalsIgnoreCase(p4));
     }
}
