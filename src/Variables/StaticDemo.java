public class StaticDemo {

	static String name;
	static int i;

	public static void main(String[] args) {

		StaticDemo obj1 = new StaticDemo();
		StaticDemo obj2 = new StaticDemo();

		obj1.name = "Digvijay";
		obj1.i = 29;

		obj2.name = "Aniket";
		obj2.i = 21;

		System.out.println(obj1.name);
		System.out.println(obj1.i);

	}
}