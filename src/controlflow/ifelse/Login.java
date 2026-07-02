package controlflow.ifelse;

public class Login {
	
	public String savedUsername;
	public String savedPassword;

	public Login(String newUser, String newPass) {
		savedUsername = newUser;
		savedPassword = newPass;
	}

	public static void main(String[] args) {
		
		Login user1 = new Login("Rati", "1245");
		Login user2 = new Login("Nanu", "9999");
		
		user1.authorization("Rati", "1245");  
		user1.authorization("Rati", "rp123");
		
		user2.authorization("Nanu", "9999");   
		user2.authorization("Rati", "1245");    
	}

	public void authorization(String Username, String Password) {
		
		if ((Username.equals(savedUsername) && Password.equals(savedPassword))) {
			
			System.out.println("Successfully logged in as: " + Username);
			
		} else {
			
			System.out.println("Access denied for: " + Username);
			
		}
	}
}