package controlflow.switchstmt;

public class MovieTicket {

	public static void main(String[] args) {
		
		MovieTicket t1 = new MovieTicket();
		
		t1.bookTicket("Horror", 15);
		
		t1.bookTicket("Comedy", 22);
	}

	public void bookTicket(String genre, int age) {
		
		checkAge(age);
		
		if (age < 18) {
			return;
		}
		
		switch (genre) {
		
			case "Horror":
				System.out.println("Ticket booked for Horror movie 300rs ticket");
				break;
				
			case "Comedy":
				System.out.println("Ticket booked for Comedy movie 200rs ticket");
				break;
				
			case "Action":
				System.out.println("Ticket booked for Action movie 250rs ticket");
				break;
		}
	}

	public static void checkAge(int age) {
		
		if (age < 18) {
			System.out.println("Underage not allowed");
		} else {
			System.out.println("Adult allowed");
		}
	}
}