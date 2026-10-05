package whileLoop;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int correctPassword = 1234;
		int password = 0;
		
		while(correctPassword != password)
		{
			System.out.println("please enter password : ");
			password = sc.nextInt();
			
			if(correctPassword == password) 
			{
				System.out.println("CorrectPassword");
			}
			else
			{
				System.err.println("InvalidPassword");
			}
		}
		sc.close();
	}

}
