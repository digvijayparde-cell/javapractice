package controlflow.switchstmt;

public class Connect {

	String day;
	
	public static void main(String[] args) {
		
		Connect myConnect = new Connect();
		myConnect.day = "fri";
		myConnect.weekdays();

	}
	
	public void weekdays() {
		
		switch(day) {
		
		case "mon":
			System.out.println("Monday");
			break;
			
		case "tue":
			System.out.println("Tuesday");
			break;
			
		case "wed":
			System.out.println("Wedesday");
			break;
			
		case "thu":
			System.out.println("Thursday");
			break;
			
		case "fri":
			System.out.println("Friday");
			break;
			
		case "sat":
			System.out.println("Saturday");
			break;
			
		case "sun":
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("Invalid");
		
		}
	}
}