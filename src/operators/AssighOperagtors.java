package operators;

public class AssighOperagtors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AssighOperagtors obj = new AssighOperagtors();
		
		obj.assighn(10);
		
	}
	
	public void assighn(int a) {
		
		int x = 0 ; 
		//System.out.println(x = a);
		System.out.println(x +=a);
		System.out.println(x -=a);
		System.out.println(x *=a);
		System.out.println(x /=a);
		System.out.println(x %=a);
	}

}
