package pkg_testing;

public class Demo {
	
	
	public static int add(int a , int b) {
		
		return a+b;
		
	
	}
	
	public static void main(String[] args) {
		
		int m=Demo.add(22, 22);
		System.out.println(m);
		
		Demo obj = new Demo();
		obj.minus(60000, 200);

		
	}
	
	public void minus(int a,int b) {
		
		System.out.println(a-b);
	}

}
