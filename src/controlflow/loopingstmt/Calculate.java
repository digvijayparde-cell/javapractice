package controlflow.loopingstmt;

public class Calculate {
	
	public static void main(String[] args) {
		
		int finalAnswer = calc("multiply", 10, 5);
		System.out.println("The answer is: " + finalAnswer);
		
	}
	
	public static int calc(String operation, int a, int b) {
		
		int result = 0; 
		
		switch(operation) {
			
			case "add":
				result = a + b;
				break;  
				
			case "minus":
				result = a - b;
				break;  
				
			case "multiply":
				result = a * b;
				break;  
				
			case "divide":
				result = a / b;
				break;  
				
			default:
				
				System.out.println("Error: Unknown operation.");
				break;
		}
		
		return result;
	}
}