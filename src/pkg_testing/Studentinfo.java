package pkg_testing;

public class Studentinfo {
	
	static String schname = "Zp School";
	static int schno = 22;
	
	public static void main(String[]args) {
		Studentinfo st1 = new Studentinfo();
		System.out.println(schname);
		System.out.println(schno);
		st1.name("Digvijay","Parade");
		Studentinfo.totalmarks(89,20,35);
		
		
	}
	
	public void name(String fsname,String lname) {
		
		System.out.println(fsname+" "+lname);		
	}
	
	public static int totalmarks(int eng, int maths, int sci) {
		
		return eng+maths+sci;
	}

}
