package com.kodewala.constructor1;

public class Student {
   int age ;
   String name;
   
   Student ()
   {
	   System.out.println("Inside Student");
   }
   Student(int _age, String _name)
   {
	   System.out.println("Inside Student (int _age, String _name)");
	   this.age = _age;
	   this.name = _name;
   }
}
