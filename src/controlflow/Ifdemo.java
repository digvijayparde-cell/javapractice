package controlflow;

public class Ifdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String action = "Do add";
		if(action == "") {
			
			add(40000,345);
		}
		else {
			
			minus(40000,345);
			
		}

	}
	
	public static void add(int a, int b) {
	
	System.out.println(a + b);
	
	}
	
	public static void minus(int a , int b) {
		
		System.out.println(a - b);
		
	}

}
