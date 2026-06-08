public class Company{

	static String companyname = "Apple";
	static String ceo = "Naresh";
	static short empcount = 1000;

	String productname;
	int productno;	
	int productprice;
	

	public static void main(String[]args){

		String greet = "Welcome to apple store";
		
		Company obj1 = new Company();
		Company obj2 = new Company();

		obj1.productname = "Iphone";
		obj1.productno = 14;	
		obj1.productprice = 100000;
		
		obj2.productname = "Macbook";
		obj2.productno = 3;	
		obj2.productprice = 300000;

		// --- CLEANED UP OUTPUT SECTION 1 ---
		System.out.println("=== " + greet + " ===");
		System.out.println("Company: " + companyname + " | CEO: " + ceo + " | Total Employees: " + empcount);
		System.out.println("------------------------------------------------");
		System.out.println("Product 1: " + obj1.productname + " " + obj1.productno + " | Price: Rs." + obj1.productprice);
		System.out.println("Product 2: " + obj2.productname + " Pro " + obj2.productno + " | Price: Rs." + obj2.productprice);
		System.out.println("------------------------------------------------\n");

		// Modifying static variables
		companyname = "windows";
		ceo = "Suresh";
		empcount = 3000;

		// --- CLEANED UP OUTPUT SECTION 2 ---
		System.out.println("=== " + greet.replace("apple", "windows") + " ==="); // Dynamically fixes the greeting too!
		System.out.println("Company: " + companyname + " | CEO: " + ceo + " | Total Employees: " + empcount);
		System.out.println("------------------------------------------------");
	}
}