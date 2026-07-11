	
public class Reversestr {

	
	public static void main(String[]args) {
		
		reve("Nikita");
		
		
	}
	public static void reve(String input) {
		
		String reverse = "";
		for(int i = input.length()-1; i >= 0 ; i--) {
			
			 reverse = reverse + input.charAt(i);
			
		}
		 System.out.println(reverse);
		
		
	}
	
	
}
