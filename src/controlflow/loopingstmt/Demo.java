package controlflow.loopingstmt;

public class Demo {

	static int dash ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mg(17);
		

	}
	public static void mg(int x) {
		
		
		for(int i = dash = 1;i <= 100; ++i, dash++, x++){
			
			System.out.println("HELP!!");
			System.out.println(dash);
			System.out.println(x);
			
			
			
		}
		System.out.println(dash);
		System.out.println(x);
	}


}
