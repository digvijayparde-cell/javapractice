public class MasterCombinations {

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

        // Need this object pointer to read the instance variables!
        MasterCombinations obj = new MasterCombinations();

        // --- SECTION 1: INSTANCE METHODS (Chained with a dot) ---
        System.out.println(staticName.trim());          // Comb A: Static Var + Instance Method
        System.out.println(obj.instanceLname.toUpperCase()); // Comb B: Instance Var + Instance Method
        System.out.println(localText.toLowerCase());    // Comb C: Local Var + Instance Method

        // --- SECTION 2: STATIC METHODS (Passed inside parentheses) ---
        System.out.println(String.valueOf(staticId));       // Comb D: Static Var + Static Method
        System.out.println(String.valueOf(obj.instanceGrade)); // Comb E: Instance Var + Static Method
        System.out.println(String.valueOf(localNum));       // Comb F: Local Var + Static Method
    }
}


/*1. Variables + Instance (Non-Static) Methods
Remember: Instance methods (like .trim(), .toUpperCase()) must attach to a specific object or String variable using a dot.

Combination A: Static Variable + Instance Method

Formula: System.out.println( staticVar.method() );
Example: System.out.println( name.trim() );

Combination B: Instance Variable + Instance Method

Formula: System.out.println( obj.instanceVar.method() );
Example: System.out.println( obj.lname.toUpperCase() );

Combination C: Local Variable + Instance Method

Formula: System.out.println( localVar.method() );
Example: System.out.println( text.toLowerCase() );

2. Variables + Static Methods
Remember: Static methods (like String.valueOf()) belong to the Class blueprint. You call them directly using the Class name, and drop your variable inside the parentheses ().

Combination D: Static Variable + Static Method

Formula: System.out.println( ClassName.method( staticVar ) );
Example: System.out.println( String.valueOf( id ) );

Combination E: Instance Variable + Static Method

Formula: System.out.println( ClassName.method( obj.instanceVar ) );
Example: System.out.println( String.valueOf( obj.grade ) );

Combination F: Local Variable + Static Method

Formula: System.out.println( ClassName.method( localVar ) );
Example: System.out.println( String.valueOf( num ) );*/