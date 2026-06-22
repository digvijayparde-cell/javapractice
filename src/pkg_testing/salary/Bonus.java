package pkg_testing.salary; 

public class Bonus {
    
   
    public static void main(String[] args) {
        System.out.println("Running from inside the subpackage:");
        calculate(50000); 
    }
   
    
    public static void calculate(int baseSalary) {
        double bonusAmount = baseSalary * 0.10; // 10% bonus
        System.out.println("Your calculated bonus is: " + bonusAmount);
    }
    
} 