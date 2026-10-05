package com.kodewala.constructor1;

public class StudentMain {
     public static void main(String args[]) {
    	 Student s = new Student();
    	 System.out.println(s.age + " and " + s.name);
    	 Student s1 = new Student(20 , "Dushyant");
    	 System.out.println(s1.age + " and " + s1.name);
     }
}
