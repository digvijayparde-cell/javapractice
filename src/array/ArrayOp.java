package array;

import java.util.*;

public class ArrayOp{
	
	public static void main(String[]args) {
		
		
		int [] num = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks : ");
		for(int i = 0 ; i < num.length ; i++) {
			
			num[i] = sc.nextInt();
			
		}
		System.out.println(Arrays.toString(num));
		
		System.out.println("Reverse Array : ");
		
		for(int i = num.length - 1 ; i >= 0 ; i--) {
			
			System.out.println(num[i]);
		}
		
		System.out.println("ENter Target num : ");
		int target = sc.nextInt();
		
		boolean found = false;
		for (int i = 0; i<= num.length - 1 ; i++) {
			
			if(target == num[i]) {
				
				System.out.println("the target is at index : "+" "+i);
				found = true;
				break;
			}
		}if (found == false) {
		    System.out.println("Target not found");
		
		}
		ArrayList <Integer> numbers = new ArrayList <>();
		
		numbers.add(20);
		numbers.add(35);
		numbers.add(90);
		numbers.add(26);
		numbers.add(100);
		
		System.out.println("Dynamic array targeted index is : "+" "+numbers.indexOf(100));
		
		
		
	
}
}