package controlflow.loopingstmt;

public class WhileDemo {
	
	static int energy = 20 ;
	static int a = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int energy = 20 ;
//		int a = 0;
		m1();
		
		while(energy >  -20) {
			
			energy -= 20;
			
			a++;
			System.out.println("Lap"+" "+a+"| Energy left: " + energy);
		}

		System.out.println("Lap"+" "+a+"| Energy left: " + energy);
		m1();
	}
	public static void m1() {
		System.out.println(a+" " + energy);
		
	}

}
