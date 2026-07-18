package scannerTopic;

import java.util.Scanner;

public class Practice{
	
	public static void main(String[]args) {
		
		Practice p = new Practice();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name : ");
		
		String name = sc.nextLine();
		p.nam(name);
		
		System.out.println("Enter your ID : ");
		
		int id = sc.nextInt();
		p.id(id);
		
		
	}
	
	public void nam(String name) {
		
		System.out.println("Your name : "+ " "+name);
		
	}public void id(int id ) {
		
		System.out.println(id + 20);
	}
}