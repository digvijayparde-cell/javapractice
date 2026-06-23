package operators;// practicing the operators concept

public class ArithematicOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calc(100,20);
		System.out.println("anothe example");
		calc(10000,200);
		System.out.println("anothe example");
		calc(23,88);
	}
	
	public static void calc(int a , int b) {
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}

}
