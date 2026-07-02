package controlflow.switchstmt;

public class Car {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.checkType("suv");
		car2.checkType("sedan");
		
		checkColor("red");
		checkColor("blue");
	}

	public void checkType(String type) {
		
		switch(type) {
		
			case "suv":
				System.out.println("Big car");
				break;
				
			case "sedan":
				System.out.println("Small car");
				break;
				
			default:
				System.out.println("Unknown type");
		}
	}

	public static void checkColor(String color) {
		
		switch(color) {
		
			case "red":
				System.out.println("Fast color");
				break;
				
			case "blue":
				System.out.println("Cool color");
				break;
				
			default:
				System.out.println("Unknown color");
		}
	}
}