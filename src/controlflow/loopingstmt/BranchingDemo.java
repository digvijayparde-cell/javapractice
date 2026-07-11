package controlflow.loopingstmt;

public class BranchingDemo {

	public static void main(String[]args) {
		
		count();
	}
	
	public static void count() {
		
		for(int i = 1 ; i <= 100 ; i++) {
			
			
			if(i == 38) {
				
				continue;
			}
			else if(i == 98) {
				
				break;
			}
			else if(i == 98) {
				
				return;
			}
			System.out.println(i);
			
		}
		
	}
	
}
