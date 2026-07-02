package controlflow.switchstmt;

public class Tier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tier c1 = new Tier();
		Tier c2 = new Tier();
		Tier c3 = new Tier();
		Tier c4 = new Tier();
		Tier c5 = new Tier();
		
		
		c1.tiers("standard");
		c2.tiers("admin");
		c3.tiers("premium");
		c4.tiers("free");	
		c5.tiers("");
		

	}
	
	public void tiers(String plan) {
		
		
		switch(plan) {
		
		case "free": 
			System.out.println("Tier: Access to basic content with ads. SD Video quality.");
			break;
			
		case "standard":
			
			System.out.println("Tier: Ad-free streaming. HD Video quality. 2 screens at once.");
			break;
			
		case "premium":
			System.out.println("Tier: Ad-free streaming. 4K Ultra HD quality. 4 screens + Spatial Audio.");
			break;
			
		case "admin": 
			System.out.println("Developer Account: Full master access to all tools.");
			break;
			
			
		default:
			System.out.println("Error: Unknown subscription plan. Please update billing info.");
				

		}
	}

}
