package array;

import java.util.*;

public class ArrayFor {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		
		for(int i = 0 ; i < number.length ; i++) {
			
		number[i] = sc.nextInt();
		
		}
		System.out.println(Arrays.toString(number));
	}
}
