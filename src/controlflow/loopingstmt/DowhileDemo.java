package controlflow.loopingstmt;

public class DowhileDemo {

	public static void main(String[]args) {
		
		DowhileDemo obj = new DowhileDemo();
		
		obj.m1("Nanu",false);
		obj.m2("Gannu",true);
	}
	
	public void m1(String pName,boolean isInternet) {
		do {
			
			System.out.println(pName+" "+"s game is Loading......");
			
			
		}while(isInternet == true) ;
		
		System.out.println(pName+" "+"connect to internet");
	}
	
	public void m2(String pName,boolean isInternet) {
		if(isInternet == true) {
			
			System.out.println("welcome"+" "+pName);
		}
		else {
			
			System.out.println(pName+" "+"connect to internet");
		}
}
}