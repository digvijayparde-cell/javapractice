public class Car{

	String brand;
	int speed;

	public static void main(String[]args){

		Car lambo = new Car();

		lambo.brand = "Lamborghini";
		lambo.speed = 299;

			System.out.println("Brand:" + lambo.brand);
			System.out.println("Speed:" + lambo.speed);
	}

}