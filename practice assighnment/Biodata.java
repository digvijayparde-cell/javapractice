public class Biodata{
		String name;
		byte age ;
		short salary ;
		String address ;
		long mobno;
		

	public static void main(String[]args){

		
		Biodata Digvijay = new Biodata();

		Digvijay.name = "Digvijay";
		Digvijay.age = 22;
		Digvijay.salary = 30000;
		Digvijay.address = "japan";
		Digvijay.mobno = 7777777777l;

		System.out.println(Digvijay.name);
		System.out.println(Digvijay.age);
		System.out.println(Digvijay.salary);
		System.out.println(Digvijay.address);
		System.out.println(Digvijay.mobno);
	}

}