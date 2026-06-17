public class MyMasterQuiz {

    // 1. Static Variables
    static String staticName = "  Nanu  ";
    static int staticId = 101;

    // 2. Instance Variables
    String instanceLname = "PaRade";
    char instanceGrade = 'A';

    public static void main(String[] args) {
        
        // 3. Local Variables
        String localText = "JAVA";
        double localNum = 99.9;

        // The remote control you need for instance variables
        MyMasterQuiz obj = new MyMasterQuiz();


        // === SECTION 1: INSTANCE METHODS ===
        // Rule: The method goes at the VERY END of the chain (.method())

        // Combination 1: Use the instance method .trim() on the static variable 'staticName'
        	System.out.println(staticName.trim());


        // Combination 2: Use the instance method .toUpperCase() on the instance variable 'instanceLname'
        	System.out.println(obj.instanceLname.toUpperCase());


        // Combination 3: Use the instance method .toLowerCase() on the local variable 'localText'
       		System.out.println(localText.toLowerCase());




        // === SECTION 2: STATIC METHODS ===
        // Rule: The static factory goes at the VERY START wrapping the variable (String.method(...))

        // Combination 4: Use the static method String.valueOf() on the static variable 'staticId'
        System.out.println(String.valueOf(staticId));


        // Combination 5: Use the static method String.valueOf() on the instance variable 'instanceGrade'
        System.out.println(String.valueOf(obj.instanceGrade));


        // Combination 6: Use the static method String.valueOf() on the local variable 'localNum'
        System.out.println(String.valueOf(localNum));

    }
}