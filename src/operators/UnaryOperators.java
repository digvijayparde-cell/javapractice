package operators;

public class UnaryOperators {

	public static void main(String[]args) {
		
		boolean areYouMale = true;
		System.out.println(!areYouMale);
		System.out.println(areYouMale = !areYouMale);
		System.out.println(!areYouMale);
		System.out.println(areYouMale);
		value(100);
		
	}
	
	public static int value(int a) {
		
		System.out.println(+a);
		System.out.println(-a);
		//prefix
		System.out.println(++a);
		System.out.println("changed value 1st and than print");
		System.out.println(--a);
		System.out.println("changed value 1st and than print");
		//suffix
		System.out.println(a++);
		System.out.println("prints value 1st and changed later"+" "+a);
		System.out.println(a--);
		System.out.println("prints value 1st and changed later"+" "+a);
		return a;
	}
}
