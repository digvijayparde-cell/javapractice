public class EmailCheck {
    public static void main(String[] args) {
        String rawEmail = "  USER123@gmail.com ";
        String cleanEmail = rawEmail.trim();
        String finalizedEmail = cleanEmail.toLowerCase();

        System.out.println("Original:" + rawEmail);      
        System.out.println("Cleaned: " + finalizedEmail); 
    }
}