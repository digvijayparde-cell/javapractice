package constructor;

public class TestingConst {
	
	static int x ;
	String name;
	
	public TestingConst(int x) {
		
		TestingConst.x = x;
		
	}
public TestingConst(String name) {
		
		this.name = name;
		
	}
	
	public static void main(String[]args) {
		
		TestingConst obj = new TestingConst(10);
		TestingConst obj2 = new TestingConst("Nanu");
		
		obj.add(32);
		obj2.add();
		
	}
	
	public void add(int a) {
		
		for (int i = 1; i<= 5;i++) {
			
			System.out.println(a + x);
			
		}
		switch(x) {
		
		case 1 :
			System.out.println(a + x);
			break;
		case 10:
			System.out.println("IDK bro what im doing, im just bored");
			break;
		
		
		}
	
	}
	
	public void add() {
		
		if(x != 10) {
		System.out.println(name.charAt(0));
		
		}
		else {
			
			System.out.println("IDK bro what im doing, im just bored");
		}
	}

}

