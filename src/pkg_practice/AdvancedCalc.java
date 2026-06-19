package pkg_practice;

import pkg_testing.Calculator;

public class AdvancedCalc {

    public static void main(String[] args) {
        // Calling parent's static method
        int prod = Calculator.multiply(5, 8);
        System.out.println("Product: " + prod);

        // Creating parent's object to call its instance method
        Calculator calc = new Calculator();
        calc.divide(50, 2);
    }
}