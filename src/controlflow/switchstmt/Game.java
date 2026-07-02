package controlflow.switchstmt;

public class Game {

	public static void main(String[] args) {
		
		Game player1 = new Game();
		Game player2 = new Game();
		Game player3 = new Game();
		
		player1.chooseMode("easy");
		player2.chooseMode("hard");
		player3.chooseMode("space");
	}

	public void chooseMode(String mode) {
		
		switch(mode) {
		
			case "easy":
				System.out.println("Low damage");
				break;
				
			case "medium":
				System.out.println("Normal damage");
				break;
				
			case "hard":
				System.out.println("High damage");
				break;
				
			default:
				System.out.println("Wrong mode");
		}
	}
}