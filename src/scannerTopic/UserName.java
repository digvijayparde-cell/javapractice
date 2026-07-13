package scannerTopic;

import java.util.Scanner;

public class UserName{
	
	public static void main(String[]args) {
		
		String fName ;
		String lName;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Name : ");
		fName = sc.nextLine();
		System.out.println("Enter last Name : ");
		lName= sc.nextLine();
		
		System.out.println("1st Name is "+" "+fName);
		System.out.println("last Name is "+" "+lName);
		
	}
	
}