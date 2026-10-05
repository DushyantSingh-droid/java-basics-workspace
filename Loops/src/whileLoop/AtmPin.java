package whileLoop;
import java.util.Scanner;
public class AtmPin {
	public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	int atmPin = 1050;
	int userEntered = 0;
	int attempts = 0;
	while(attempts < 3 && atmPin!=userEntered) {
		System.out.println("Enter the Pin : ");
		// Taking input from the user
		userEntered = sc.nextInt();
		 attempts++;
		if (userEntered==atmPin)
		{
			System.out.println("ATM Pin is correct you can withdrawl : ");
		}
		else 
		{
			System.err.println("Incorrect Pin ");
		}
	}
	if(userEntered != atmPin) 
	{
		System.out.println("Card Blocked");
	} 
	   sc.close();	
	}

}
