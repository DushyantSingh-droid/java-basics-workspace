package whileLoop;

public class Driver {

	public static void main(String[] args) {
		
		int max = 10;
		int number = 0;
		while (number < max)  // this will keep executing until condition is true
		{
			System.out.println("executing..." + number);
			number++;
		}
	}

}
