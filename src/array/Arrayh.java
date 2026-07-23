package array;

import java.util.Scanner;

import java.util.Arrays;

import java.util.ArrayList;

public class Arrayh {
	
	public static void main(String[]args) {
		
		ArrayList <String> names = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		names.add(sc.nextLine());
		names.add(sc.nextLine());
		names.add(sc.nextLine());
		names.add(sc.nextLine());
		names.add(sc.nextLine());
		names.add(sc.nextLine());
		
		
		System.out.println(names.get(3));
		System.out.println(names);
	}
	
}

