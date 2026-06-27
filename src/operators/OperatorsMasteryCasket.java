package operators;

public class OperatorsMasteryCasket {

	public static void main(String[] args) {
		// --- UNCOMMENT THESE ONE BY ONE AS YOU SOLVE THEM ---
		 puzzle1Precedence();
		puzzle2ShortCircuit();
		 puzzle3TernaryType();
		puzzle4MixedTypes();
	}

	/**
	 * PUZZLE 1: OPERATOR PRECEDENCE (Order of Operations)
	 * Fix this so it prints out exactly what Java evaluates.
	 */
	public static void puzzle1Precedence() {
		System.out.println("--- PUZZLE 1: PRECEDENCE ---");
		
		// In Java, multiplication (*) and division (/) happen BEFORE addition (+) and subtraction (-).
		// Predict what this evaluates to, then uncomment the print line to check your math!
		int result = (10 + 5 )* (2 - 4) / 2;
		
		 System.out.println("Your computed result: " + result);
	}

	/**
	 * PUZZLE 2: THE SHORT-CIRCUIT "OR" (||) TRAP
	 * Predict the final state of the counter.
	 */
	public static void puzzle2ShortCircuit() {
		System.out.println("\n--- PUZZLE 2: SHORT-CIRCUIT OR ---");
		int loopCounter = 5;

		// Crucial Rule: If the first half of a conditional OR (||) is TRUE, 
		// Java skips evaluating the second half entirely because it already knows the whole thing is true!
		boolean check = 10 > 2;
		
		// Will loopCounter stay 5, or did it increment to 6? Fill in the blank below to find out!
		System.out.println("Did it short-circuit? Final counter value: " + loopCounter);
		System.out.println(check);
	}

	/**
	 * PUZZLE 3: TERNARY VALUE ASSIGNMENT
	 * Use a single-line ternary operator to evaluate a status.
	 */
	public static void puzzle3TernaryType() {
		System.out.println("\n--- PUZZLE 3: TERNARY ---");
		int physicalScore = 85;
		int theoryScore = 40;

		// Fill in the ternary statement below:
		// If BOTH physicalScore is greater than 80 AND theoryScore is greater than 50,
		// assign "Certified" to status. Otherwise, assign "Needs Retake".
		
		 String status = (physicalScore > 80 && theoryScore > 50) ? "Certified" : "Needs Retake";

		 System.out.println("Exam Status: " + status);
	}

	/**
	 * PUZZLE 4: THE MIXED TYPE TRAP
	 * Fix the division problem.
	 */
	public static void puzzle4MixedTypes() {
		System.out.println("\n--- PUZZLE 4: MIXED TYPES ---");
		
		int totalItems = 5;
		// We want to calculate the exact average weight if 5 items total 22 lbs. 
		// Right now, integer division truncates 22 / 5 to 4.0 instead of 4.4!
		// Fix the math expression below without changing the 'totalItems' variable type.
		
		double averageWeight = 22.0/  totalItems;
		
		System.out.println("Average Weight (Should be 4.4): " + averageWeight);
	}
}