package week6FinalProject;

public class Card {

	private final String name;
	private final int value;

	public Card(int value, String name) {
		this.name = name; 
		this.value = value;
	}


// Describe prints out information of cards the players have.
	public void describe() {
		System.out.println(name);
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

}
