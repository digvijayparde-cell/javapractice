package scannerTopic;

import java.util.Scanner;

public class ScannerDemo{
	
	public static void main(String[] gs) {
		
		ScannerDemo obj = new ScannerDemo();
		obj.calc();
	}
	
public void calc() {
		
		Scanner scan = new Scanner(System.in);
		for(int i = 1; i <= 5; i++) {
			
			String operation = scan.nextLine();
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			scan.nextLine();
		if(operation.equals("add")) {
			
			System.out.println(x+ y);
		}
		else if(operation.equals("minus")) {
			
			System.out.println(x- y);
		}
		else if(operation.equals("multi")) {
			
			System.out.println(x* y);
		}
		else if(operation.equals("divide")) {
			
			System.out.println(x/y);
		}
		else if(operation.equals("reminder")) {
			
			System.out.println(x% y);
		}
		
		
		}
	}
}
	
