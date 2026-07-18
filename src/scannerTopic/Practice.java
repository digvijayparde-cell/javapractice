package scannerTopic;

import java.util.Scanner;

public class Practice{
	
	public static void main(String[]args) {
		
		// what i want to do is take dynamic values and pass it in methods parameters 
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter your Name : ");
		String nam = sc.nextLine();
		System.out.println("Enter yout ID : ");
		int id = sc.nextInt();
	}
	
	public static void name(String name) {
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		name = sc.nextLine();
		System.out.println("My name is : "+" "+name);
	}
	public static void id(int id) {
		
		System.out.println("My name ID is : "+" "+id);
		
	}
}