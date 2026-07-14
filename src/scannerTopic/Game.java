package scannerTopic;

import java.util.Scanner;

class Monster {
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
        
        Scanner scan = new Scanner(System.in);
       
        Game myGame = new Game();
        
        String mName;
        int mHealth;
        
        String dName;
        int dHealth;
        int dFirePower;
        
        System.out.println("--- LEVEL 1 START ---");
        
        System.out.println("Enter Normal Monster Name: ");
        mName = scan.nextLine();
        
        System.out.println("Enter Normal Monster Health: ");
        mHealth = scan.nextInt();
        scan.nextLine(); // Janitor line!

        Monster normalEnemy = new Monster(mName, mHealth);
        myGame.level(normalEnemy, 1);
      
        System.out.println();
        System.out.println("--- BOSS ROOM ---");
        
        System.out.println("Enter Boss Name: ");
        dName = scan.nextLine();
        
        System.out.println("Enter Boss Health: ");
        dHealth = scan.nextInt();
        
        System.out.println("Enter Boss Fire Power: ");
        dFirePower = scan.nextInt();
        
        Dragon boss = new Dragon(dName, dHealth, dFirePower);
        myGame.lev(boss, 100);
    }

    public void level(Monster m, int level) {
    	System.out.println("its an " + level + " level Enemy");
    }
    
    public void lev(Dragon d, int level) {
    	System.out.println("its an " + level + " level Enemy");
    }
}