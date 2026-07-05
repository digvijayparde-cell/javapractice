package controlflow.loopingstmt;

public class DemoForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double i = 0.01;
		
		for(;i <= 20.00;i++) {
			
			System.out.println(i);
			DemoForloop obj1 = new DemoForloop();
			obj1.hello();
			
			for (double d = 0.0; d <= 1.0; d += 0.25) {
			    System.out.println("double: " + d);
			}

		
			for (float f = 5.5f; f <= 7.5f; f += 1.0f) {
			    System.out.println("float: " + f);
			}
			
		}

	}
	public void hello() {
		
		System.out.println("Helloooo!");
	}

}
