package controlflow.loopingstmt;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int energy = 1000 ;
		int a = 0;
		
		while(energy > 0) {
			
			energy -= 20;
			
			a++;
			System.out.println("Lap"+" "+a+"| Energy left: " + energy);
		}

	}

}
