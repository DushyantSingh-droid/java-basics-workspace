package whileLoop;
import java.util.Scanner;
public class Driver1 {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int luckyNumber = 13;
		int userEntered = 0;
		
		while (luckyNumber != userEntered)
		{
			System.out.println("Please Enter a Number...");
			userEntered = sc.nextInt();
			
			if (luckyNumber == userEntered)
			{
				System.out.println("YOU WON");
			}
			else
			{
				System.err.println("Please try again...");
			}
		}
		sc.close();
	}

}
