package constructor;

import java.util.Scanner;

public class ConsWithThis {

	int a;
	int b;
	public ConsWithThis(int a,int b) {
		
		System.out.println("this is a constructor");
		this.a = a;
		this.b = b;
		
	}
public ConsWithThis() {
		
		System.out.println("constructor overloading");
		
	}public static void main(String[]ou) {
		
		ConsWithThis obj1 = new ConsWithThis();
		ConsWithThis obj = new ConsWithThis(10,20);
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int f = sc.nextInt();
		obj.add(d,f)	;
		
	}public void add(int x,int y) {
		
		System.out.println("this is the input from the addition from scanner");
		System.out.println(x + y);
		System.out.println("this is the input from the constructor");
		System.out.println(a + b);
		
	}
	public void add() {
		
		System.out.println("method overloading");
	}
}
