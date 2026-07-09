package controlflow.loopingstmt;

public class PrimeNum {

	public static void main(String[]args) {
		
		prime();
	}
public static void prime() {
		
		for (int i = 2; i <= 1000; i++) {
		    
		    boolean isPrime = true;
		    
		    for (int j = 2; j < i; j++) {
		        if (i % j == 0) {
		            isPrime = false; 
		            break;
		        }
		    }
		    
		    if (isPrime) {
		        System.out.println(i);
		    }
		}
	}
}

