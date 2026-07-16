public class Methoverloading{
	
	public static void main(String[]args) {
		
		//method overloading
		what("modi ki galti");
		what(69,29);
		
		//constructor overloading
//		public Meth
		
	}
	public static void what(String wh) {
		
		for(int a = 0; a <= 5;a++) {
			
			System.out.println(wh);
		}
	}
	public static void what(int a,int b) {
		
		for(int i = 0; i <= 5;i++) {
			
		System.out.println(a+ b);
		
		}
	}
	
}