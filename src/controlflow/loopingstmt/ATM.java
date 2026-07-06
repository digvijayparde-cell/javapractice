package controlflow.loopingstmt;

public class ATM{
	
	public static void main(String[]args) {

		ATM c1 = new ATM();
		c1.withDraw(1000);
	
}
	public void withDraw(int amount) {
		
		System.out.println("Withdrawing: " + amount);
		
		for(int balanceleft = amount ; balanceleft > 0 ; balanceleft -= 20) {

			System.out.println("cutting 20. left balance: " + (balanceleft - 20));
			
		}
		
	}
	
}