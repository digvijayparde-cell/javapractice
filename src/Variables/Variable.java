public class Variable{

	int id;
	String name;
	Short age;

	public static void main(String[]args){

		Variable Student = new Variable();

		Student.id = 39;
		Student.name = "Nanu";
		Student.age = 22;

		System.out.println("ID:" + Student.id);
		System.out.println("Name:" + Student.name);
		System.out.println("Age:" + Student.age);
	}
}