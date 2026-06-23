public class NamingConventions { // Class names always start with a Capital letter

	// Variables that never change are always ALL CAPS with underscores
	public static final int MAX_LOGIN_ATTEMPTS = 3;

	// Regular variables: lowercase first, then capital letter for the next words
	static String currentUserName = "digvijay";
	static int currentAttemptCount = 1;

	public static void main(String[] args) {
		
		// Variables inside the main method use the same lowercase first rule
		double userAccountBalance = 2500.75;
		boolean isUserLoggedIn = true;

		// just printing stuff out to see if the code runs
		System.out.println("--- Scratchpad Testing ---");
		System.out.println("User: " + currentUserName);
		System.out.println("Bank Balance: $" + userAccountBalance);
		System.out.println("Max Logins Allowed: " + MAX_LOGIN_ATTEMPTS);
		
		// calling the method I made down below so it actually runs
		triggerWelcomeAlert();
	}

	// Methods: lowercase first, capital for next words (use action words)
	public static void triggerWelcomeAlert() {
		System.out.println("Alert: Login successful! Welcome back.");
	}
}