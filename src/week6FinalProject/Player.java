package week6FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	// Creating a list of Class Card in hand
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private final String name;

	public Player(String name) {
		this.name = name;
	}

	public void describe() {
		System.out.println(name + " has the cards: ");
		for (Card card : hand) {
			card.describe();
		}

		System.out.println(name + "'s score is " + score + "\n");
	}

	public int numCardsInHand() {
		return hand.size();
	}

	public Card flip() {
		return hand.remove(0);
	}

	public void discardCards() {
		 hand.clear();
	}
	
	public int getTotalHandValue() {
		int totalValueInHand = 0;
		for (Card card : hand) {
			totalValueInHand += card.getValue();
		}
		return totalValueInHand;
	}

// Deck = type deck = variable
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}

	public int incrementScore() {
		return score++;
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

}
