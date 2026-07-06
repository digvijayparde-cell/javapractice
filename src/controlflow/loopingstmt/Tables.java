package controlflow.loopingstmt;

public class Tables{
	
	public static void main(String[]args) {
		
		Tables t1 = new Tables();
		t1.tableOf(4000000);;
		
	}
		
public void tableOf(int num) {
	
	System.out.println("table of"+" "+ num +":");
	for(int i = 1; i <= 10 ; i++) {
		
		int result = num * i;
		
		System.out.println(result);
		
	}
	
}
}