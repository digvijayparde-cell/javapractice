public class InstanceDemo{

	String name = "Digvijay";
	short id = 39;

	public static void main(String[]args){


		InstanceDemo s1 = new InstanceDemo();
		

		System.out.println("before modify method");
		System.out.println(s1.name);
		System.out.println(s1.id);

		modify(s1);

		System.out.println("before modify method");
		System.out.println(s1.name);
		System.out.println(s1.id);


	}

		static void modify(InstanceDemo obj){

		obj.name = "nanu";
		obj.id = 49;

}

}


//i know i did not have to create this modify method and make it more complicated , but i was just testing myself :)