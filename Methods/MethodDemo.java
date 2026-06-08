public class MethodDemo{

		public static void main(String[]args){
		
			System.out.println("hello");
			int c =add();
			System.out.println(c);
			
			MethodDemo obj = new MethodDemo();
			System.out.println(obj.greet());
	
	}

		public static int add(){

			int a = 10;
			int b = 10;
			int c = a+b;
			return c;

	}

		public String greet(){

			String h = "hi";
			h =  h + how();
			return h;
			
	}


		public String how(){
		
			String m = "how r u";

			return m;

	}
}