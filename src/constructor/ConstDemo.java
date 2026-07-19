package constructor;

public class ConstDemo {
	
	public ConstDemo() {
		
		System.out.println("this is constructor");
	}
	public static void main(String[]args) {
		
		System.out.println("this is mainmethod");
		
		ConstDemo obj = new ConstDemo();
	}

}
