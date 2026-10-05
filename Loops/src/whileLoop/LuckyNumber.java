package whileLoop;
//importing the Scanner class
import java.util.Scanner;  
public class LuckyNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int luckyNumber = 25;
		int userEntered = 0;
		
		while(luckyNumber != userEntered)
		{
			System.out.println("Enter a number : "); 
			
			// Taking input from the user 
			userEntered = sc.nextInt();      
			
			if (userEntered==luckyNumber) 
			{
				System.out.println("You won !!! "); 	
			}
			else if (userEntered<=24)
			{
				System.out.println("Too small");
			}
			else
			{
				System.out.println("Too big");
			}
		
		}
		sc.close();
	}

}
