public class Data{

	String name = "nanu";
	String lname = "PaRade";

	static int id = 101;
	char grade = 'A';

	public static void main(String[]args){


	Data obj = new Data();
	
	System.out.println(obj.name.toUpperCase());
	System.out.println(obj.lname.toLowerCase());

	System.out.println(String.valueOf(id));
	char grade = obj.grade;
	System.out.println(String.valueOf(grade));
}

}