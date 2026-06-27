package operators;

public class OneLastExample {

	public static void main(String[] args) {
		ArithematicOperators(100, 20000);
		System.out.println("next operator");
		Assignment();
		System.out.println("next operator");
		Relational(4004, 320);
		System.out.println("next operator");
		Logical(35, "Female");
		System.out.println("next operator");
		ternary();
		System.out.println("next operator");
		unary();
		System.out.println("next operator");
		instanceofOperator(); 
	}
	
	public static void ArithematicOperators(int a, int b) {
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b); 
	}
	
	public static void Assignment() {
		int a;
		System.out.println(a = 10);
		System.out.println(a += 49);
		System.out.println(a -= 32);
		System.out.println(a *= 4);
		System.out.println(a /= 9);
	}
	
	public static void Relational(int a, int b) {
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a >= b);
		System.out.println(a != b);
	}
	
	public static void Logical(int marks, String gender) {
		// Professional touch: Used .equals() for safe String value comparisons
		boolean Eligible = marks > 80 && gender.equals("Male");
		System.out.println(Eligible);
		
		boolean Fire = marks < 90 || gender.equals("Female");
		System.out.println(Fire);
	}
	
	public static void ternary() {
		int a = 100;
		int b = 400;
		System.out.println(a < b ? "minimum " + a : "maximum " + b);
	}
	
	public static void unary() {
		int a  = 20;
		System.out.println(++a);
		System.out.println(--a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(-a);
		System.out.println(+a);
		System.out.println(!(a == 20));
	}
	
	public static void instanceofOperator() { 
		Object gender = 'F';
		System.out.println(gender instanceof String);
	}
}