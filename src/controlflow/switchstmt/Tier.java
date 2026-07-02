package controlflow.switchstmt;
import controlflow.ifelse.Login;
public class Tier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tier platform = new Tier();
	    
	    Login user1 = new Login("Rati", "1245");
	    Login user2 = new Login("Nanu", "9999");
	    
	    platform.tiers(user1, "standard");
	    platform.tiers(user2, "premium");
		
	}
	
	public void tiers(Login user ,String plan) {
		
		String id = user.savedUsername;
		
		switch(plan) {
		
		case "free": 
			System.out.println(id+" "+"Tier: Access to basic content with ads. SD Video quality.");
			break;
			
		case "standard":
			
			System.out.println(id+" "+"Tier: Ad-free streaming. HD Video quality. 2 screens at once.");
			break;
			
		case "premium":
			System.out.println(id+" "+"Tier: Ad-free streaming. 4K Ultra HD quality. 4 screens + Spatial Audio.");
			break;
			
		case "admin": 
			System.out.println(id+" " +"Developer Account: Full master access to all tools.");
			break;
			
			
		default:
			System.out.println(id+" "+"Error: Unknown subscription plan. Please update billing info.");
				

		}
	}

}
