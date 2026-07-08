package controlflow.loopingstmt;

public class Assighnment{
	
	public static void main(String[]args) {
		
		stdID();
		div();
		odd();
		prime();
	}
	public static void stdID() {
		
		int id = 100;
		for(;id <= 200; id++) {
			
			System.out.println(id);
		}
		
	}
	public static void div() {
		
		int num = 333;
		for(;num < 999;num++) {
			
			if(num % 5 == 0) {
				System.out.println(num);
				
			}
			
			
		}
		
	}
	public static void odd() {
		
		int i = 500;
		for(;i > 200;i--) {
			
			if(i % 2 != 0) {
				System.out.println(i);
				
			}
			
		}
		
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

