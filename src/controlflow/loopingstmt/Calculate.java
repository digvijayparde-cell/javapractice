package controlflow.loopingstmt;

public class Calculate {
	
	public static void main(String[] args) {
		
		System.out.println(calc("add", 10, 5));
		System.out.println(calc("minus", 10034, 679));
		System.out.println(calc("multiply", 10, 5));
		System.out.println(calc("divide", 20, 4));
		System.out.println(calc("pizza", 10, 5));
		
		System.out.println(calc2("add", 10, 5));
		System.out.println(calc2("minus", 10034, 679));
		System.out.println(calc2("multiply", 10, 5));
		System.out.println(calc2("divide", 20, 4));
		System.out.println(calc2("pizza", 10, 5));
		
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
	
	public static int calc2(String operation, int a, int b) {
		
		if(operation.equals("add")) {
			return a + b;
		} else if(operation.equals("minus")) {
			return a - b;
		} else if(operation.equals("multiply")) {
			return a * b;
		} else if(operation.equals("divide")) {
			return a / b;
		} else {
			System.out.println("Error: Unknown operation.");
			return 0;
		}
	}
}