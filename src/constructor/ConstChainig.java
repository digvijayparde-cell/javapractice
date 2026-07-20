package constructor;

public class ConstChainig {
	
	public ConstChainig() {
		
		this(10);
		System.out.println("Main constructor");
		
		
	}public ConstChainig(int a) {
		
		System.out.println(a);
	}
	public static void main(String[]args) {
		
		ConstChainig obj = new ConstChainig();

}
}
