package com.kodewala.scanner;
import java.util.Scanner;
public class Scannersrc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("please enter name : ");
        String name = sc.nextLine();
        
        System.out.println("please enter price : ");
        int price = sc.nextInt();
        sc.nextLine();
        
        System.out.println("please enter address : ");
        String address = sc.nextLine();
        
        System.out.println("Name is : " + name);
        System.out.println("Price is : " + price);
        System.out.println("Address is : " + address);
        
        sc.close();
	}

}
