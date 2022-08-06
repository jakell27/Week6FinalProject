package week6FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

//list of cards made from Card class
	private List<Card> cards = new ArrayList<Card>();
//	public static void main(String[] args) {
//
//		Deck myDeck = new Deck();
//		myDeck.shuffle();
//		
//		myDeck.print();
//		
//		System.out.println(myDeck.numCardsRemaining());
//		
//		while (myDeck.numCardsRemaining() > 0) {
//			Card card = myDeck.draw();
//			card.describe();
//		}
//
//
//		
//		System.out.println(myDeck.numCardsRemaining());
//		
//		
//	}

	public int numCardsRemaining() {
		return cards.size();
	}

	public void print() {
		for (Card card : cards) {
			card.describe();
		}
	}

	public Deck() {
		cards.add(new Card(1, "Ace of Hearts"));
		cards.add(new Card(1, "Ace of Diamonds"));
		cards.add(new Card(1, "Ace of Spades"));
		cards.add(new Card(1, "Ace of Clubs"));
		cards.add(new Card(2, "Two of Hearts"));
		cards.add(new Card(2, "Two of Diamonds"));
		cards.add(new Card(2, "Two of Spades"));
		cards.add(new Card(2, "Two of Clubs"));
		cards.add(new Card(3, "Three of Hearts"));
		cards.add(new Card(3, "Three of Diamonds"));
		cards.add(new Card(3, "Three of Spades"));
		cards.add(new Card(3, "Three of Clubs"));
		cards.add(new Card(4, "Four of Hearts"));
		cards.add(new Card(4, "Four of Diamonds"));
		cards.add(new Card(4, "Four of Spades"));
		cards.add(new Card(4, "Four of Clubs"));
		cards.add(new Card(5, "Five of Hearts"));
		cards.add(new Card(5, "Five of Diamonds"));
		cards.add(new Card(5, "Five of Spades"));
		cards.add(new Card(5, "Five of Clubs"));
		cards.add(new Card(6, "Six of Hearts"));
		cards.add(new Card(6, "Six of Diamonds"));
		cards.add(new Card(6, "Six of Spades"));
		cards.add(new Card(6, "Six of Clubs"));
		cards.add(new Card(7, "Seven of Hearts"));
		cards.add(new Card(7, "Seven of Diamonds"));
		cards.add(new Card(7, "Seven of Spades"));
		cards.add(new Card(7, "Seven of Clubs"));
		cards.add(new Card(8, "Eight of Hearts"));
		cards.add(new Card(8, "Eight of Diamonds"));
		cards.add(new Card(8, "Eight of Spades"));
		cards.add(new Card(8, "Eight of Clubs"));
		cards.add(new Card(9, "Nine of Hearts"));
		cards.add(new Card(9, "Nine of Diamonds"));
		cards.add(new Card(9, "Nine of Spades"));
		cards.add(new Card(9, "Nine of Clubs"));
		cards.add(new Card(10, "Ten of Hearts"));
		cards.add(new Card(10, "Ten of Diamonds"));
		cards.add(new Card(10, "Ten of Spades"));
		cards.add(new Card(10, "Ten of Clubs"));
		cards.add(new Card(11, "Jack of Hearts"));
		cards.add(new Card(11, "Jack of Diamonds"));
		cards.add(new Card(11, "Jack of Spades"));
		cards.add(new Card(11, "Jack of Clubs"));
		cards.add(new Card(12, "Queen of Hearts"));
		cards.add(new Card(12, "Queen of Diamonds"));
		cards.add(new Card(12, "Queen of Spades"));
		cards.add(new Card(12, "Queen of Clubs"));
		cards.add(new Card(13, "King of Hearts"));
		cards.add(new Card(13, "King of Diamonds"));
		cards.add(new Card(13, "King of Spades"));
		cards.add(new Card(13, "King of Clubs"));
	}

	public void shuffle() {
		// TODO Auto-generated method stub
		Collections.shuffle(cards);
	}

	public Card draw() {
		return cards.remove(0);
	}

}
