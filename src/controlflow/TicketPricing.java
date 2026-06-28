package controlflow;

public class TicketPricing {

	public static void main(String[] args) {
		
		int age = 14;
		double ticketPrice;

		if (age < 5) {
			ticketPrice = 0.0;
		} else if (age <= 12) {
			ticketPrice = 10.0;
		} else if (age >= 65) {
			ticketPrice = 15.0;
		} else {
			ticketPrice = 20.0;
		}

		System.out.println("Customer age: " + age);
		System.out.println("Final ticket price: $" + ticketPrice);
	}
}