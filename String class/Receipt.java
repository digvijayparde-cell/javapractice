public class Receipt {
    public static void main(String[] args) {
        double price = 199.99; 
        String priceText = String.valueOf(price);
        int totalCharacters = priceText.length(); 

        System.out.println("Price as Text: " + priceText);       
        System.out.println("Number of digits: " + totalCharacters); 
    }
}