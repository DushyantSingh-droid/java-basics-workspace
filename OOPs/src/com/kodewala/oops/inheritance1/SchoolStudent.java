package com.kodewala.oops.inheritance1;

public class SchoolStudent extends Student{
    private String grade;  
    public SchoolStudent(String name,String rollNo, int marks,String grade) {
    	super(name,rollNo,marks);
    	this.grade = grade;
    }
    @Override
    public void displayDetails() {
    	super.displayDetails();
    	System.out.println("The grade is : "+ grade);
    }
}
