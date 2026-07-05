
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marks st1 = new Marks();
		Marks st2 = new Marks();
		st1.result("Ruturaj",34);
		st2.result("Digvijay",99);

	}
	
	public void result(String name, int mark) {
		
		if(mark >= 70) {
			
			System.out.println(name+" "+"is pass");
		}
		else {
			
			System.out.println(name+" "+"is fail");
		}
	}

}
