package controlflow.ifelse;

public class ContentFilter {

	public static void main(String[] args) {
		
		ContentFilter app = new ContentFilter();

		app.processComment("Hate text here", "Gaming");
		
		app.processComment("Check out this new graphics card!", "Tech");
		
		app.processComment("I hate Bees", "");
	}

	public void processComment(String commentText, String topic) {
		
		int toxicityScore = scanTextWithAI(commentText);
	
		if (toxicityScore > 80) {
			System.out.println("BLOCKED: Content flagged as toxic.");
			return;
		}

		switch (topic) {
		
			case "Tech":
				System.out.println("Routed to tech feed.");
				break;
				
			case "Gaming":
				System.out.println("Routed to gaming feed.");
				break;
				
			case "Sports":
				System.out.println("Routed to sports feed.");
				break;
				
			default:
				System.out.println("Routed to general feed.");
		}
	}

	public static int scanTextWithAI(String text) {

		if (text.contains("Hate")) {
			return 95; 
		} else {
			return 10; 
		}
	}
}