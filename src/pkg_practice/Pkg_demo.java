package pkg_practice;
import pkg_testing.Demo;

public class Pkg_demo {
	
	public static void main(String[]args) {
		
		System.out.println(Demo.add(20,22));
		
		Demo obj = new Demo();
		obj.minus(200, 50);
	}

}
