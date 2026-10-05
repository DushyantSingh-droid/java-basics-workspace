package com.kodewala.array1;

public class ArrayMain {
	public static void main(String Employee[])
	{
		Array2 employee1 = new Array2("Dushyant","Management",50000,5);
		Array2 employee2 = new Array2("Jatin","Management",25000,2);
		Array2 employee3 = new Array2("Aniket","IT",90000,3);
		Array2 employee4 = new Array2("Bhanu","Cleaner",12000,6);
		Array2 employee5 = new Array2("Abhay","IT",60000,4);
		Array2 employee6 = new Array2("Abhimanyu","IT",150000,4);
		
		// Storing obj in Array
		
		Array2 employeePerformance [] = new Array2[6];
		       
		employeePerformance [0] = employee1;
		employeePerformance [1] = employee2;
		employeePerformance [2] = employee3;
		employeePerformance [3] = employee4;
		employeePerformance [4] = employee5;
		employeePerformance [5] = employee6;
		
		// for finding salary above 50,000
		
		for(int i = 0 ; i < employeePerformance.length ; i++ )
		{
			if(employeePerformance[i].salary > 50000)
			{
				System.out.println("Salary above 50000 : " + employeePerformance[i].employeeName +" "+employeePerformance[i].salary);
			}
			
		}
		// person who belong to IT department
		
		for(int i = 0 ; i < employeePerformance.length ; i++ )
		{
			if(employeePerformance[i].department.equals("IT"))
			{
				System.out.println("Employee from IT department : "+employeePerformance[i].employeeName);
			}
		}
		
		// counting who have salary more than 50000
		
		int count = 0;
		for(int i = 0 ; i < employeePerformance.length ; i++ )
		{
			if(employeePerformance[i].salary > 50000)
			{
				count++;
			}
		}
		System.out.println("Employees who have salary more than 50000  : "+ count);
		Array2 lowestAccount = employeePerformance [0];
		int lowestBalance = employeePerformance[0].salary;
		for(int i = 0 ; i < employeePerformance.length ; i++ )
		{
			if(employeePerformance[i].salary < lowestBalance)
			{
				lowestBalance = employeePerformance[i].salary;
				lowestAccount = employeePerformance[i];
			}
			}
		System.out.println("Name : " + lowestAccount.employeeName);  // prints lowest balance
	    System.out.println("Balance : " + lowestAccount.salary);
	   
	    // total salary 
	    
	    int total = 0;
	    int noOfValues = 0;
	    for(int i = 0 ; i < employeePerformance.length ; i++ )
		{
				total = employeePerformance[i].salary + total;
				noOfValues++;
		}
	    System.out.println("Total salary is : "+ total );
	    System.out.println("Total salary input is : "+ noOfValues );
	    
	    int averageSalary = total/noOfValues;
	    System.out.println("The average salary is : "+ averageSalary);
	    
	    
	    // experience 
	    
	    for(int i = 0 ; i < employeePerformance.length ; i++ )
		{
			if(employeePerformance[i].experience < 4)
			{
				System.out.println("Employee experience : "+employeePerformance[i].employeeName);
			}
		}
	    
	}

}
