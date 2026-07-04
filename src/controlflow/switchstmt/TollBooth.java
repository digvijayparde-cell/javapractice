package controlflow.switchstmt;

public class TollBooth {

	public static void main(String[] args) {
		
		TollBooth v1 = new TollBooth();
		v1.toolPrice("Car", true);
	}
	
	public void toolPrice(String vehicle, boolean isVIP) {
		
		vip(isVIP);
		
		if (isVIP) {
			return; 
		}
		
		switch(vehicle) {
		
			case "Car":
				System.out.println("its a " + vehicle + " 100rs will be toll");
				break;
				
			case "Motorcycle":
				System.out.println("its a " + vehicle + " 50rs will be toll");
				break;
				
			case "Truck":
				System.out.println("its a " + vehicle + " 200rs will be toll");
				break;
		}
	}
	
	public static void vip(boolean isVIP) {
		
		if(isVIP == true) {
			System.out.println("its vip no toll");
		} else {
			System.out.println("toll applied");
		}
	}
}