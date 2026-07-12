package scannerTopic;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		
		Name myApp = new Name();
		myApp.application();
		
	}
	
	public void application() {
		
		Scanner scan = new Scanner(System.in);
		
		String fName;
		String lName;
		String clgName;
		String depName;
		int id;
		int age;
		double cgpa;
		long phoneNum;
		
		System.out.println("Enter 1st Name: ");
		fName = scan.nextLine();
		
		System.out.println("Enter last Name: ");
		lName = scan.nextLine();
		
		System.out.println("Enter College Name: ");
		clgName = scan.nextLine();
		
		System.out.println("Enter Department Name: ");
		depName = scan.nextLine();
		
		System.out.println("Enter Id: ");
		id = scan.nextInt();
		
		System.out.println("Enter Age: ");
		age = scan.nextInt();
		
		System.out.println("Enter CGPA: ");
		cgpa = scan.nextDouble();
		
		System.out.println("Enter Phone Number: ");
		phoneNum = scan.nextLong();
		
		System.out.println();
		System.out.println("fname: " + fName);
		System.out.println("lname: " + lName);
		System.out.println("clg: " + clgName);
		System.out.println("dept: " + depName);
		System.out.println("id: " + id);
		System.out.println("age: " + age);
		System.out.println("cgpa: " + cgpa);
		System.out.println("ph no: " + phoneNum);
	}
}