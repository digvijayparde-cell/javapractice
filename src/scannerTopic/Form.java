package scannerTopic;

import java.util.Scanner;

public class Form {
	
	public static void main(String[] args) {
		
		Form std1 = new Form();
		std1.application();
		
	}
	public void application() {
		String name;
		int age;
		String dob;
		char gender;
		String eMail;
		long phoneNo;
		String address;
		int userId;
		String userName;
		String password;
		boolean isAdmin;
		String clg;
		double cgpa;
		double wallet;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		name = scan.nextLine();
		
		System.out.println("Enter Age: ");
		age = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter DOB (DD/MM/YYYY): ");
		dob = scan.nextLine();
		
		System.out.println("Enter Gender (M/F): ");
		gender = scan.next().charAt(0);
		scan.nextLine();
		
		System.out.println("Enter Email: ");
		eMail = scan.nextLine();
		
		System.out.println("Enter Phone: ");
		phoneNo = scan.nextLong();
		scan.nextLine();
		
		System.out.println("Enter Address: ");
		address = scan.nextLine();
		
		System.out.println("Enter User ID: ");
		userId = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter Username: ");
		userName = scan.nextLine();
		
		System.out.println("Enter Password: ");
		password = scan.nextLine();
		
		System.out.println("Is Admin (true/false): ");
		isAdmin = scan.nextBoolean();
		scan.nextLine();
		
		System.out.println("Enter College: ");
		clg = scan.nextLine();
		
		System.out.println("Enter CGPA: ");
		cgpa = scan.nextDouble();
		
		System.out.println("Enter Wallet Balance: ");
		wallet = scan.nextDouble();
		
		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("age: " + age);
		System.out.println("dob: " + dob);
		System.out.println("gender: " + gender);
		System.out.println("email: " + eMail);
		System.out.println("phone: " + phoneNo);
		System.out.println("address: " + address);
		System.out.println("id: " + userId);
		System.out.println("user: " + userName);
		System.out.println("pass: " + password);
		System.out.println("admin: " + isAdmin);
		System.out.println("clg: " + clg);
		System.out.println("cgpa: " + cgpa);
		System.out.println("wallet: " + wallet);
	}
}