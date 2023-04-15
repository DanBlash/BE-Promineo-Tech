package week6Assignments;

import java.util.ArrayList;
import java.util.List;

public class Player {
	

	
	
	//Collections and Objects
	
	public int score;
	public String name;
	List <Card> hand = new ArrayList <Card>();
	
	//Constructors
	
	
	//Methods
	
	public Player(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.printf("%s's hand is : %n", name);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip(List <Card> hand) {
		Card topCard = hand.get(0);
		hand.remove(0);
		return topCard;
		
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
	
	
	
	
	
	
	
	
}
