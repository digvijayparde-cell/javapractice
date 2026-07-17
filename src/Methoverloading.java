public class Methoverloading{
	
	String greet;
	int id;
	
	public Methoverloading(String greet) {
        this.greet = greet;
    }
	 public Methoverloading(int id) {
	       
	        this.id = id;
	 }
	
	public static void main(String[]args) {
		
		//method overloading
		what("modi ki galti");
		what(69,29);
		
		//constructor overloading
		Methoverloading obj = new Methoverloading("hello");
		Methoverloading obj1 = new Methoverloading(69);
		
		obj.how();
		obj1.when();
		
		
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
	
	public void how() {
		
		System.out.println(greet);
       
	}
	public void when() {
		
		 System.out.println(id);
		
	}
	//
	
}