package scannerTopic;

import java.util.Scanner;

public class TakeIt {

	static int shareNum;
	static int shareNum2;
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		shareNum = num1;
		System.out.println(shareNum);
		
		shareNum2 = secondWay();
		System.out.println(shareNum2);
		
		thirdWay(num1);
	}
	public static int secondWay() {
		
		Scanner sc = new Scanner(System.in);
		int num2 = sc.nextInt();
		return num2;
	}
public static void thirdWay( int num3) {
		
		System.out.println(num3);
		
	}
	
}

