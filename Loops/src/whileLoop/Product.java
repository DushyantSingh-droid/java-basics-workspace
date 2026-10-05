package whileLoop;
import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String item = sc.nextLine();
        
        // Alphabet & spaces only no number and character 
        
        if(item.matches("[a-zA-Z ]+"))
        {
        	System.out.println("Valid Input");
        }
        else 
        {
        	System.err.println("Please enter valid input : ");
        }
        System.out.println("Item : " + item);
        sc.close();
	}
}
