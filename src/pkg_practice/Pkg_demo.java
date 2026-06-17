package pkg_practice;

public class Pkg_demo {

		public static void main(String[]args) {
			
			marks(10,20);
			Pkg_demo obj = new Pkg_demo();
			obj.name("nanu");
			System.out.println(id(21));
			System.out.println(obj.dep("CSE"));
			info("Digvijay",1);
		}
		
		public static void marks(int a,int b) {
			
			System.out.println(a+b);
			
		}
		
		public void name(String name) {
			
			System.out.println(name);
			
		}
		
		public static int id(int id) {
			
			return id;
		}
		
		public String dep(String dep) {
			
			return dep;
		}
		
		public static void info(String name,int rank) {
			
			System.out.println(name+" "+rank);
			
		}
}
