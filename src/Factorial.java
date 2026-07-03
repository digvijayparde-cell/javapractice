public class Factorial {
    public static void main(String[] args) {
        int num = 5; 
        int facto = 1;

        if (num < 0) {
            System.out.println("no factorial for negative numbers");
        } else {
            for (int i = 1; i <= num; i++) {
                facto *= i;
            }
            System.out.println(facto);
        }
    }
}
