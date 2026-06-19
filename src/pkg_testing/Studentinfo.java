package pkg_testing;

public class Studentinfo{
	
	static String schname = "Zp School";
	static int schno = 22;
	
	public static void main(String[]args) {
		
		System.out.println(schname);
		System.out.println(schno);
		Studentinfo st1 = new Studentinfo();
	st1.name("Digvijay","Parade");
	System.out.println(st1.id(101));
	System.out.println(st1.totalmarks(90,33,35));
	
	Studentinfo st2 = new Studentinfo();
	
	System.out.println("student no 2");
	
	st2.name("Ruturaj","Deshmukh");
	System.out.println(st2.id(102));
	System.out.println(st2.totalmarks(10,10,10));
	}
	
	public void name(String fsname,String lname) {
		
		System.out.println(fsname +" "+lname);
		
	}
	
	public int id(int id) {
		
		return id ;
	}
	
	public int totalmarks(int eng,int maths,int sci) {
		
		return eng + maths + sci ;
	}
}