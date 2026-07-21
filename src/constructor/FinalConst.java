package constructor;

public class FinalConst{
	
	String name;
	int id;
	String clgName;
	
	public FinalConst(String name,int id) {
		
		System.out.println(this.name = name);
		System.out.println(this.id = id);
	}
	public FinalConst(String clgName) {
		
		System.out.println(this.clgName = clgName);

	}
	public static void main(String[]args) {
		
		FinalConst obj  =  new FinalConst("Nanu",89);
		FinalConst obj2  =  new FinalConst("SVERI");
	}
}