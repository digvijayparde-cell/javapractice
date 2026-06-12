public class SchoolProfile {

    String studentName = "Rahul";
    int age = 19;
    double gpa = 8.4;
    boolean isEnrolled = true;

    public static void main(String[] args) {
        SchoolProfile student = new SchoolProfile();
        student.printDetails();
        
        int totalScore = addMarks(85, 90);
        System.out.println(totalScore);
    }

    public void printDetails() {
        System.out.println(studentName);
        System.out.println(age);
        System.out.println(gpa);
        System.out.println(isEnrolled);
    }

    public static int addMarks(int math, int science) {
        int total = math + science;
        return total;
    }
}