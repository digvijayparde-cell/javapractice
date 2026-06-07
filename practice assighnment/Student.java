public class Student{

	static String clgname = "abc";
	String name;
	short id;

	public static void main(String[]args){

		Student s1 = new Student();
		Student s2 = new Student();

		s1.name = "Digvijay";
		s2.name = "Nanu";

		s1.id = 39;
		s2.id = 49;

		String greet = "hello student";

		System.out.println("original value");
		System.out.println(clgname);
		System.out.println(greet+" "+s1.name+" "+greet+" "+s2.name);
		System.out.println("Name1:"+" "+s1.name);
		System.out.println("ID1:"+" "+s1.id);
		System.out.println("Name2:"+" "+s2.name);
		System.out.println("ID2:"+" "+s2.id);


		modify();

		System.out.println("modified value");
		System.out.println(clgname);
		System.out.println(greet+" "+s1.name+" "+greet+" "+s2.name);
		System.out.println("Name1:"+" "+s1.name);
		System.out.println("ID1:"+" "+s1.id);
		System.out.println("Name2:"+" "+s2.name);
		System.out.println("ID2:"+" "+s2.id);



	}

		static void modify(){

			clgname = "xyz";
	}

}