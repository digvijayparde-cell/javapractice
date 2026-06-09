public class Argument{

	public static void main(String[]args){

		Argument obj = new Argument();
		obj.add(10,20);
		multi(100,2000);
		System.out.println("minus is "+" "+obj.minus(6700,500));

	}


	public void add(int x,int y){
		
		System.out.println("add is "+" "+(x + y));



	}

	public static void multi(int x,int y){

		System.out.println("multi is "+" "+x * y);

		
	
	}

	public int minus(int x ,int y){

		return x-y;
	}

}