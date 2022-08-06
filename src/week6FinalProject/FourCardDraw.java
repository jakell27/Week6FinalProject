package week6FinalProject;

//another game where players can draw 2 cards, compare scores, player with highest score wins.
public class FourCardDraw {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		Player player1 = new Player("Sylvia");
		Player player2 = new Player("Mike");
		while (deck.numCardsRemaining() > 0) {

			for (int i = 0; i <= 1; i++) {
				player1.draw(deck);
			}
			player1.describe();
			for (int i = 0; i <= 1; i++) {
				player2.draw(deck);
			}
			player2.describe();

			int player1Value = player1.getTotalHandValue();
			int player2Value = player2.getTotalHandValue();
			if (player1Value > player2Value) {
				player1.incrementScore();
			} else if (player2Value > player1Value) {
				player2.incrementScore();
			}
			player1.discardCards();
			player2.discardCards();

			System.out.println(player1.getName() + " " + player1.getScore());
			System.out.println(player2.getName() + " " + player2.getScore());
			int finalScore = player1.getScore();
			int finalScore2 = player2.getScore();
			if (finalScore > finalScore2) {
				System.out.println(player1.getName() + " wins!");
			} else if (finalScore2 > finalScore) {
				System.out.println(player2.getName() + " wins!");
			} else {
				System.out.println("It's a draw!");
			}
		}
	}
}