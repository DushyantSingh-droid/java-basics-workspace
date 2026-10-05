package whileLoop;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int experienceNeeded = 6;
        int experience = 0;
        
        while (experienceNeeded > experience)
        {
        	System.out.println("please enter your experience : ");
        	experience = sc.nextInt();
        	 
        	if (experienceNeeded <= experience)
        	{
        		System.out.println("You are qualified");
        	}
        	else
        	{
        	    System.out.println("We regret came again after some time");
        	}
        }
        sc.close();
	}

}
