import java.util.Arrays;

import java.util.Scanner;

public class Arrayl {
	
	public static void main(String [] args) {
		int array[] = new int [5] ;
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0 ; i<=array.length-1; i++) {
			int num = sc.nextInt();
			array[i] = num;
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(array[1]+array[4]);
	}

}
