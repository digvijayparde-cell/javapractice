public class EmployeeDataMaster {

    static String companyTag = "  tech-corp  ";
    static int globalEmployeeCount = 500;

    String employeeRole = "developer";
    char performanceRating = 'S';

    public static void main(String[] args) {
        
        String projectCode = "ALPHA";
        double baseSalaryK = 125.5;

        EmployeeDataMaster obj = new EmployeeDataMaster();

        System.out.println(companyTag.trim());
        System.out.println(obj.employeeRole.toUpperCase());
        System.out.println(projectCode.toLowerCase());

        System.out.println(String.valueOf(globalEmployeeCount));
        System.out.println(String.valueOf(obj.performanceRating));
        System.out.println(String.valueOf(baseSalaryK));
    }
}