package constructor;

public class ParaConst {

	public ParaConst() {
		
		System.out.println("this is default const");
	}
	
public ParaConst(int a) {
		
		System.out.println("this is para const : "+ " " +a);
	}

public static void main(String[]args) {
	
	ParaConst obj = new ParaConst();
	ParaConst obj2 = new ParaConst(38);
	
	
}
}
