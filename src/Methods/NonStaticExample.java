public class NonStaticExample{

	public static void main(String[]args){
		
		NonStaticExample obj = new NonStaticExample();
		String result = obj.accelerate();
		System.out.println(result);
		
	}

	public String accelerate(){
		
		String sound = "vroom vroom";
		return sound;
		
	}
}