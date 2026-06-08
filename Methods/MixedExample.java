public class MixedExample{

	public static void main(String[]args){
		
		MixedExample obj = new MixedExample();
		obj.first();
		
	}

	public void first(){
		
		System.out.println("inside non static");
		second();
		
	}

	public static void second(){
		
		System.out.println("inside static");
		
	}
}