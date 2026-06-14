public class JavaCombinationsMaster {

    static String staticName = "  Nanu  ";
    static int staticId = 101;

    String instanceLname = "PaRade";
    char instanceGrade = 'A';

    public static void main(String[] args) {
        
        String localText = "JAVA";
        double localNum = 99.9;

        JavaCombinationsMaster obj = new JavaCombinationsMaster();

        System.out.println(staticName.trim());
        System.out.println(obj.instanceLname.toUpperCase());
        System.out.println(localText.toLowerCase());

        System.out.println(String.valueOf(staticId));
        System.out.println(String.valueOf(obj.instanceGrade));
        System.out.println(String.valueOf(localNum));
    }
}