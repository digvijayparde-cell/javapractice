package controlflow.switchstmt;

public class Ticket {

    public static void main(String[] args) {
        
        Ticket myTicket = new Ticket();

        myTicket.tickettier("Gold"); 
        
    }
    
    public void tickettier(String tier) {
        
        switch(tier) {
        
            case "Bronze":
                System.out.println("Granted: Basic Access.");
                break;
                
            case "Silver":
                System.out.println("Granted: Ad-Free Access.");
                break;
                
            case "Gold":
                System.out.println("Granted: VIP Lounge & Custom Avatar.");
                break;
                
            default:
                System.out.println("Error: Unrecognized Tier. Kicking user.");
        }
        
    }
}