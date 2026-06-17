package Methods;

public class BeginnerDemo {

    String studentName = "Digvijay";
    int rollNumber = 45;

    static String collegeName = "SVERI";

    public static void main(String[] args) {
        BeginnerDemo student = new BeginnerDemo();

        System.out.println(student.studentName);
        System.out.println(student.rollNumber);
        System.out.println(collegeName);

        student.showWelcomeMessage();

        int totalMarks = addMarks(80, 85);
        System.out.println(totalMarks);

        pkg_practice.Pkg_demo.marks(10, 20);

        pkg_practice.Pkg_demo obj = new pkg_practice.Pkg_demo();
        obj.name("Digvijay");
        System.out.println(pkg_practice.Pkg_demo.id(21));
        System.out.println(obj.dep("CSE"));
    }

    public void showWelcomeMessage() {
        System.out.println("Welcome to Java Programming!");
    }

    public static int addMarks(int math, int science) {
        return math + science;
    }
}