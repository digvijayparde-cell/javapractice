package pkg_practice;
import pkg_testing.Studentinfo;
public class NewDemo {

	public static void main(String[]args) {
		
		System.out.println("practcicing pkges");
		
		Studentinfo obj1 = new Studentinfo();
		
		obj1.name("xyz","abc");
		System.out.println(obj1.id(102));
		System.out.println(obj1.totalmarks(10,10,10));
	}
}
