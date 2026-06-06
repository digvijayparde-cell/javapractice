// User-defined non-primitive data type example using a class

public class UserdefinedNonPrimitive{

	byte ID;
	String name;

	
	public static void main(String[]args){

		UserdefinedNonPrimitive Student = new UserdefinedNonPrimitive();

		Student.ID = 39;
		Student.name = "Digvijay";

		System.out.println("ID:" + Student.ID);
		System.out.println("Name:" + Student.name);
	}

}