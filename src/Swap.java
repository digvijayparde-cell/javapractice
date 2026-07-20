public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before: a = " + a + ", b = " + b);

        a = a + b; // a is now 30

        b = a - b; // b is now 10

        a = a - b; // a is now 20

        System.out.println( a+""+b);
    }
}