package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
        
		
		ArrayList<Integer> ar=new ArrayList<>();
		
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		
		for(int d:ar) {
			System.out.println(d);
		}
		
		
		
	}

}
