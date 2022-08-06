package week6FinalProject;
//Game of War
public class App {
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		Player player1 = new Player("Jake");
		Player player2 = new Player("Jill");
		for (int i = 0; i <= 25; i++) {
			player1.draw(deck);
		}
		player1.describe();
		for (int i = 0; i <= 25; i++) {
			player2.draw(deck);
		}
		player2.describe();
		while (player1.numCardsInHand() > 0 && player2.numCardsInHand() > 0) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			} else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
			}
		}
		int finalScore = player1.getScore();
		int finalScore2 = player2.getScore();
		System.out.println(player1.getName() + "'s score = " + finalScore + "\n" + player2.getName() + "'s score = " + finalScore2);
		if (finalScore > finalScore2) {
			System.out.println(player1.getName() + " wins!");
		} else if (finalScore2 > finalScore) {
			System.out.println(player2.getName() + " wins!");
		} else {
			System.out.println("It's a draw!");
		}
	}

}
