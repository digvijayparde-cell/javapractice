package controlflow.loopingstmt;

public class Branchingstmt {

    public static void main(String[] args) {
        testBreak();
        testReturn();
    }

    public static void testBreak() {
        for (int i = 1; i <= 100; i++) {
            
            if (i == 34) {
                System.out.println(i);
                continue;
            } else if (i == 90) {
                System.out.println(i);
                break;
            }
        }
        System.out.println("End of testBreak");
    }

    public static void testReturn() {
        for (int i = 1; i <= 100; i++) {
            
            if (i == 34) {
                System.out.println(i);
                continue;
            } else if (i == 92) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("End of testReturn");
    }
}