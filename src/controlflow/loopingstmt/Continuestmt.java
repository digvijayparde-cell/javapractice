package controlflow.loopingstmt;

public class Continuestmt {

	public static void main(String[]args) {
		
//		even();
		prime();
		
	}
	public static void even() {
		
		for(int i = 0;i <=100; i++) {
			
			if(i % 2==0) {
				
				System.out.println(i);
			}
		}
		
		}
	public static void prime() {
		
		for(int i = 2; i <= 100; i++) {
			
			boolean isPrime = true;
			
			for(int j = 2; j < i;j++) {
				
				if(i % j == 0) {
					
					isPrime = false;
				}
			}
			
			if(isPrime) {
				
				System.out.println(i);

			}
		}
		
	}
	
	}
	

