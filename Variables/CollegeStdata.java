public class Collegestdata {

	static String clgName = "abcclg";
	static String principalName = "Singh sir";
	static int estyear = 2002;

	int studentid;
	String name;
	long mobile;
	int marks;

	public static void main(String[] args) {

		Collegestdata s1 = new Collegestdata();
		s1.studentid = 101;
		s1.name = "Digvijay";
		s1.mobile = 9876543210L;
		s1.marks = 88;

		Collegestdata s2 = new Collegestdata();
		s2.studentid = 102;
		s2.name = "Aniket";
		s2.mobile = 8765432109L;
		s2.marks = 92;

		Collegestdata s3 = new Collegestdata();

		System.out.println("--- College Details (Accessed via Class) ---");
		System.out.println(Collegestdata.clgName);
		System.out.println(Collegestdata.principalName);
		System.out.println(Collegestdata.estyear);

		System.out.println("\n--- Student 1 Details (Accessed via Object) ---");
		System.out.println(s1.studentid);
		System.out.println(s1.name);
		System.out.println(s1.mobile);
		System.out.println(s1.marks);

		System.out.println("\n--- Student 2 Details (Accessed via Object) ---");
		System.out.println(s2.studentid);
		System.out.println(s2.name);
		System.out.println(s2.mobile);
		System.out.println(s2.marks);
	}
}