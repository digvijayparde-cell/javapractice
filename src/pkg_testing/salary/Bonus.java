package pkg_testing.salary; 

public class Bonus {
    
    // Method 1: The Main method (The entry point to run this file)
    public static void main(String[] args) {
        System.out.println("Running from inside the subpackage:");
        calculate(50000); // Calling the method right here to test it
    }
   
    // Method 2: The Calculate method (Completely separate from main!)
    public static void calculate(int baseSalary) {
        double bonusAmount = baseSalary * 0.10; // 10% bonus
        System.out.println("Your calculated bonus is: " + bonusAmount);
    }
    
} // Class ends here