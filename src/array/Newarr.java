package array;

import java.util.*;

public class Newarr {

	public static void main(String[]args) {
		
		int []ar = {1,2,3,4,5,6,7,8,9,0};
		
		for (int i = 2 ; i <= 6; i++) {
			
			System.out.println(ar[i]);
			
		}
		Scanner sc = new Scanner(System.in);
		
		ArrayList <Integer> num = new ArrayList<>();
		
		num.add(sc.nextInt());
		num.add(sc.nextInt());
		num.add(sc.nextInt());
		num.add(sc.nextInt());
		num.add(sc.nextInt());
		num.add(sc.nextInt());
		num.add(sc.nextInt());
		num.add(sc.nextInt());
		
		for (int i = 2 ; i <= 6; i++) {
			
			System.out.println(num.get(i));
			
		}
		
		
	}
}
