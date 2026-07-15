package scannerTopic;

import java.util.Scanner;

public class How{
	
	public static void main(String[]args) {
		
		how();
		
	}
	
	public static void how() {
		
		Scanner obj = new Scanner(System.in);

		int id = obj.nextInt();
		obj.nextLine();
		String ok = obj.nextLine();
		boolean isIndian = obj.nextBoolean();
		obj.nextLine();
		char grade = obj.nextLine().charAt(0);
		
		System.out.println(id+" "+ok+" "+isIndian+" "+grade);
			
	}
}