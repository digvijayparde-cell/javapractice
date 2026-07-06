package controlflow.loopingstmt;

public class TollBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TollBooth v1 = new TollBooth();
		
		String[] vehicles = {"car", "truck", "truck", "bike", "spaceship"};
		int[] weights = {0, 12000, 8000, 0, 0};
		
		v1.tollBooth(vehicles, weights);
		
			
			
		}
	
	public void tollBooth(String[] vehicleType, int[] truckWeight) {
		
		
		for(int i = 0; i < vehicleType.length ; i++) {
			
			switch(vehicleType[i]) {
			
			case "car" :
				System.out.println("Car pays 5 $");
				break;
				
			case "truck" :
				if(truckWeight[i] > 10000) {
					
					System.out.println("heavy truck pays 20 $");
					
				}
				else {
					
					System.out.println("normal truck pays 10 $");
				}
				break;
				
			case "bike" :
				
				System.out.println("bike pays 3 $");
				break;
				
			default:
				System.out.println(" its an UFO");
			
			}
	}

	}
}