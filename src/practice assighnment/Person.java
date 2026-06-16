public class Person{

	int id;
	String name;  // instance variables
	static String clg;  // static variables

	public static void main(String[]args){

		String heading = "hello student";  // local variables

		Person p1 = new Person();
		Person p2 = new Person();

		p1.id = 01;
		p1.name = "Jhonny";
		p2.id = 02;
		p2.name = "nanu";

		clg = "XYZ";


		System.out.println(heading +" "+ p1.name);
		System.out.println(heading +" "+ p2.name);
		System.out.println(p1.id +" "+ p1.name);
		System.out.println(p2.id + " "+p2.name);
	}

}