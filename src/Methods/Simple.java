public class Simple{

	public static void main(String[]args){

		schname("ZP School");
		Simple st1 = new Simple();
		st1.name("Digvijay","Parade");
		st1.id(11);
		System.out.println(st1.rank('A'));

		Simple st2 = new Simple();
		st1.name("Virat","Kohli");
		st1.id(49);
		System.out.println(st1.rank('f'));


	}
	
	public static void schname(String schname){
		System.out.println(schname);
	
	}

	public void name(String fstname,String lastname){
		System.out.println(fstname+" "+lastname);
		
	}

	public void id(int id){

		System.out.println(id);

	}

	public char rank(char r){

		return r;

	}
}