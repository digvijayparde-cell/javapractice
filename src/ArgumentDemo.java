public class ArgumentDemo {
    // Renamed "args" to "bananas" - this is 100% legal
    public static void main(String[] bananas) {
        
        // Check if the user passed any text in the terminal
        if (bananas.length > 0) {
            System.out.println("🎉 Arguments received!");
            
            // Loop through and print every item in our array
            for (int i = 0; i < bananas.length; i++) {
                System.out.println("Argument " + i + ": " + bananas[i]);
            }
        } else {
            System.out.println("❌ No arguments were passed.");
        }
    }
}
