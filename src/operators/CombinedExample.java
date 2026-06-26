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
		
		//relational
		relational();
		
		// instanceof
		inst();
		
		// ternary
		ternary();
		
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
	public static void inst() {
		
		String gender = "other";
		
		System.out.println(gender instanceof String);
		}
	public static void ternary() {
	    int speed = 90;
	    
	    // If speed is over 80, fine is 2000. Otherwise, fine is 0.
	    int fine = (speed > 80) ? 2000 : 0;
	    
	    System.out.println("Your speeding fine is: Rs " + fine);
	}
}
