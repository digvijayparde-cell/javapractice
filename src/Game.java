class Monster{
    String name;
    int health;

    public Monster(String name, int health) {
        this.name = name;
        this.health = health;
        System.out.println("Spawned a monster: " + this.name);
    }
}

class Dragon extends Monster {
    int firePower;

    public Dragon(String name, int health, int firePower) {
        super(name, health);
        this.firePower = firePower;
        System.out.println("Wait... " + this.name + " is a Boss! It has " + this.firePower + " fire power!");
    }
}

public class Game {
    public static void main(String[] args) {
        System.out.println("--- LEVEL 1 START ---");
        Monster normalEnemy = new Monster("Swamp Goblin", 50);
        
        System.out.println("\n--- LEVEL 10 BOSS FIGHT ---");
        Dragon boss = new Dragon("Eden Dragon", 10000, 500);
    }
}