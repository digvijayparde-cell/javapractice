package controlflow.loopingstmt;

public class Demo2{
	static int a ;
	public static void main(String[]args) {
		
		Demo2 obj= new Demo2();
		obj.forcheck();
	}
	

public void forcheck() {
	
	for( a = 1 ; a <= 5;a++) {
		
		System.out.println(a);
	}
	a = 20;
	while(a >15) {
		
		a -= 1;
		System.out.println(a);
	}
	
}
}