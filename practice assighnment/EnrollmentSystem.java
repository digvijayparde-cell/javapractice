public class EnrollmentSystem {

    public static void main(String[] args) {
        String courseName = "Java 101";
        int[] studentIds = {1001, 1002, 1003};
        
        processCourse(courseName, studentIds, true);
    }

    public static void processCourse(String name, int[] ids, boolean isOpen) {
        System.out.println(name);
        System.out.println(isOpen);

        for (int id : ids) {
            System.out.println(id);
        }
    }
}