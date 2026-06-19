package pkg_testing;

public class Calculator {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }

    public static void main(String[] args) {
        int prod = Calculator.multiply(6, 7);
        System.out.println("Product: " + prod);

        Calculator calc = new Calculator();
        calc.divide(100, 4);
    }
}