package operators;

public class AdvancedOperatorsChallenge {

	public static void main(String[] args) {
		task1Arithmetic();
		task2Unary();
		task3Relational();
		task4Logical();
	}

	public static void task1Arithmetic() {
		System.out.println("--- TASK 1: ARITHMETIC ---");
		
		double resultA = 10 / 4.0; 
		System.out.println("Result A (Should be 2.5): " + resultA);

		int resultB = -11 % 3;
		System.out.println("Result B (Remainder of -11 % 3): " + resultB);
	}

	public static void task2Unary() {
		System.out.println("\n--- TASK 2: UNARY ---");
		int points = 10;

		String unaryMessage = (points++ == 10) ? "It evaluated BEFORE changing" : "It changed BEFORE evaluating";
		
		System.out.println("Unary Message: " + unaryMessage);
		System.out.println("Current value of points (now updated): " + points);
	}

	public static void task3Relational() {
		System.out.println("\n--- TASK 3: RELATIONAL ---");
		String password1 = "Admin123";
		String password2 = new String("Admin123");

		String memoryCheck = (password1 == password2) ? "Same memory location" : "Different memory location";
		System.out.println("Memory Check (==): " + memoryCheck);

		String accessCheck = password1.equals(password2) ? "Access Granted" : "Access Denied";
		System.out.println("Access Check (.equals()): " + accessCheck);
	}

	public static void task4Logical() {
		System.out.println("\n--- TASK 4: LOGICAL ---");
		int clickCount = 0;

		boolean condition = (5 > 10) && (++clickCount > 0);
		
		System.out.println("Condition output: " + condition);
		System.out.println("Final Click Count (Did it skip?): " + clickCount); 
	}
}