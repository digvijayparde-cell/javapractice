public class VideoGame {

    String characterName = "Rex";
    int healthPoints = 100;
    double runningSpeed = 5.5;
    boolean isAlive = true;

    public static void main(String[] args) {
        VideoGame player = new VideoGame();
        player.checkStatus();
        
        int damageTaken = player.reduceHealth(20);
        System.out.println(damageTaken);
    }

    public void checkStatus() {
        System.out.println(characterName);
        System.out.println(runningSpeed);
        System.out.println(isAlive);
    }

    public int reduceHealth(int damage) {
        int currentHealth = healthPoints - damage;
        return currentHealth;
    }
}