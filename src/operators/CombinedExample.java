package operators;

public class CombinedExample {

	public static void main(String[]args) {
		
		// Assignment operator
		assignment();
		
//		arithmetic
		arithmetic(100,200);
		
//		unary
		unary(254);
		
//		conditional
		conditional();
		
		
	}
	
	public static void assignment() {
		
		int a = 10;
		int b = 20;
		System.out.println( a);
		System.out.println( b);
		System.out.println( a += b);
		
	}
	
	public static void arithmetic(int a, int b) {
		
		System.out.println( a + b);
		System.out.println( a - b);
		System.out.println( a * b);
		System.out.println( a % b);
		System.out.println( a / b);
		
	}
	public static void unary(int a) {
		
		System.out.println( ++a);
		System.out.println( --a);
		System.out.println( +a);
		System.out.println( -a);
		System.out.println( !(a > 5) );
		
	}
	public static void conditional() {
		
		int marks = 69;
		String gender = "male";
		
		boolean cond1 = marks > 70 && gender == "female";
		boolean cond2 = marks > 35 || gender == "male";
		
		System.out.println( cond1+" "+cond2);
		
	}
	public static void relational() {
		
		int a = 20;
		int b = 30;
			System.out.println(a > b);
			System.out.println(a < b);
			System.out.println(a != b);
			System.out.println(a >= b);
			System.out.println(a <= b);
			System.out.println(a == b);
			
	
}
}
