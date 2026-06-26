package operators;

public class TernaryPractice {

	public static void main(String[] args) {
		// --- UNCOMMENT THESE LINES ONE BY ONE TO TEST YOUR CODE ---
		 task1Numbers();
		task2Strings();
		task3DataTypes();
	}
	
	public static void task1Numbers() {
		System.out.println("--- TASK 1: NUMBERS ---");
		int speed = 95;
		
		System.out.println(speed>80? "2000 fine" : "0 fine");
		// 1. Without brackets: If speed is greater than 80, assign 2000 to fine. Otherwise, 0.
		// int fine = ...
		
		// 2. With brackets: Do the exact same logic but wrap the condition in brackets (speed > 80).
		// int fineWithBrackets = ...
		
		// 3. Print both variables to prove they do the exact same thing
	}
	
	public static void task2Strings() {
		System.out.println("\n--- TASK 2: STRINGS & METHODS ---");
		String day = "Sunday";

		System.out.println(day.equals("Sunday")?  "Relax" :  "Wake up");
		
		// 1. Remember: .equals() is an action, so it MANDATORILY needs brackets.
		//    Check if day.equals("Sunday"). If true, assign "Relax" to a String variable named alarm. 
		//    If false, assign "Wake up".
		// String alarm = ...
		
		// 2. Print your alarm variable
	}
	
	public static void task3DataTypes() {
		System.out.println("\n--- TASK 3: FLOATS & BOOLEANS ---");
		boolean isPremiumUser = true;
		float deliveryfee ;
		deliveryfee = (isPremiumUser )? 0.0f : 50.0f ;
		System.out.println("deliveryfee"+" "+deliveryfee);
		// 1. Since isPremiumUser is already a boolean, you don't even need a < or > operator!
		//    Check if isPremiumUser is true. If yes, assign 0.0f to a float variable named deliveryFee. 
		//    If false, assign 50.0f. (Don't forget the 'f' suffix!)
		// float deliveryFee = ...
		
		// 2. Print your deliveryFee variable
	}
}