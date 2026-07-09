
public class StringReverse {
	
	static String reversed ="";
public static void main(String[]args ){
	
	reve("VIjay");
	
}

public static void reve(String name) {
	
	for (int i = name.length()- 1 ; i >= 0 ; i--) {
		
		reversed = reversed + name.charAt(i);
	}
	System.out.println(reversed);
}
	
}
