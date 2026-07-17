// METHOD AREA: The structural blueprint of this entire class is archived here when the JVM starts.
public class MemoryDemo {
    
    // METHOD AREA: Static variables belong to the class itself, so this lives here globally.
    static String applicationMode = "Debug";
    
    // HEAP: This is an instance variable. It only exists inside an actual object out on the heap.
    int instanceId;

    // METHOD AREA: The structural instructions for this constructor live here.
    public MemoryDemo(int instanceId) {
        // HEAP: 'this.instanceId' targets the variable inside the object on the heap.
        // STACK: The parameter 'instanceId' is a local temporary variable living in this constructor's stack frame.
        this.instanceId = instanceId;
    }

    // METHOD AREA: The logical bytecode instructions for how 'calculate' runs live here.
    public void calculate(int factor) {
        // STACK: 'factor' (parameter) and 'result' (local variable) live directly inside this method's active stack frame.
        int result = this.instanceId * factor; // Fetches 'instanceId' from Heap, multiplies by 'factor' from Stack.
        
        System.out.println(result);
        System.out.println(applicationMode); // Fetches 'applicationMode' globally from the Method Area.
        
        // STACK COLLAPSE: The exact millisecond this method hits the closing brace below, 
        // its stack frame vanishes, and 'factor' and 'result' are wiped from memory instantly.
    }

    // METHOD AREA: The entry point instructions for the main method live here permanently.
    public static void main(String[] args) {
        // STACK: 'args' reference pointer lives on the stack frame allocated for main.
        
        // STACK & HEAP TEAMWORK: 
        // 1. 'new MemoryDemo(20)' carves out a physical block of memory on the HEAP to store the object and its data.
        // 2. 'obj' is a reference variable (a remote control pointer) that lives on the STACK, holding the address of that heap object.
        MemoryDemo obj = new MemoryDemo(20);
        
        // STACK: Calling this opens a brand new temporary stack frame right on top of main's frame.
        obj.calculate(5);
        
        // GARBAGE COLLECTION TRIGGER: When main finishes, the 'obj' pointer on the stack disappears. 
        // Because the object on the Heap now has zero active pointers tracking it, the Garbage Collector marks it for deletion.
    }
}