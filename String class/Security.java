public class Security {
    public static void main(String[] args) {
        String password = "superSecretPassword123";
        boolean isWeak = password.endsWith("123"); 
        String maskedPassword = password.replace("superSecretPassword", "********");

        System.out.println("Is password weak? " + isWeak);     
        System.out.println("Masked View: " + maskedPassword);   
    }
}