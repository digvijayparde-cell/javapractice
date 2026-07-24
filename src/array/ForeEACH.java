package array;

import java.util.*;

public class ForeEACH {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int []ar = new int[5];
		
		for(int i = 0;i < ar.length;i++) {
			
			ar[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(ar));
		
		for(int valOfar : ar) {
			
			System.out.println("what");
			System.out.println(valOfar + 5);
		}
		
		ArrayList <Integer> what = new ArrayList<>();
		
		what.add(10);
		what.add(20);
		what.add(30);
		what.add(40);
		
		System.out.println("////////////////////////////");
		
		for(int valOfwhat : what) {
			
			System.out.println(valOfwhat);
		}
		for(int value : ar) {
			
			System.out.println(value);
			
		}
		for (int i = ar.length-1;i >= 0; i--) {
			
			System.out.println("////////");
			System.out.println(ar[i]);
		}
	}
	

}
