package controlflow.ifelse; // Make sure this matches your package name!

public class MovieTicket {
	
	// 1. THE VARIABLES (Declare movie name, age, and isVIP here)
	String movie = "The Dark Knight";
	int age = 18;
	boolean isVIP = true;
	

	// 2. THE CONSTRUCTOR (Set it up to accept movie name and age)
	public MovieTicket(String inputName, int inputAge) {
		this.movie = inputName; // Stamps the name onto the object
		this.age = inputAge;        // Stamps the age onto the object
	}
	
	// 3. THE METHOD (The If-Else Ladder)
	public void checkTicket() {
		
		// If age is <= 12 print "Child ticket: $5"
		if(age <= 12) {
			System.out.println("Child ticket: $5");
		}
		// Else if age is >= 65 print "Senior ticket: $7"
		else if(age >= 65) {
		
			System.out.println("Senior ticket: $7");
		}
		
		else {
			
			System.out.println("Standard ticket: $12");
		}

		// Else print "Standard ticket: $12"
		
		// YOUR CODE HERE
		
	}

	
	// 4. THE MAIN METHOD (The Testing Zone)
	public static void main(String[] args) {
		
		// Create 2 or 3 MovieTicket objects using the 'new' keyword
		MovieTicket person1 = new MovieTicket("The Dark Knight",34);
		MovieTicket person2 = new MovieTicket("Deadpool4",12);
		// Pass in some test ages
		// Call the .checkTicket() method on each of them!
		person1.checkTicket();
		person2.checkTicket();
		
		// YOUR CODE HERE
		
	}

}