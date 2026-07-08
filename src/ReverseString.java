
public class ReverseString {

	public static void main(String[]args) {
		
		ReverseString p1 = new ReverseString();
		
		p1.reve("nanu");
		
		
	}
	
	public void reve(String name) {
		
		
		String rev = "";
		
		for(int i = name.length()-1; i >= 0 ; i--) {
			
			rev = rev + name.charAt(i);
			
		}
		System.out.println(rev);
		
	}
	
}
