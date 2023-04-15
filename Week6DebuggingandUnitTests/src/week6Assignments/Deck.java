package week6Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	//Collections and Objects
	
	List <Card> cards = new ArrayList <Card>();


	//Constructors

	public Deck() {
		
		for (int i = 2; i <= 14; i++) {
			Card card = new Card (i, "Hearts");
			cards.add(card);
		}
		for (int i = 2; i <= 14; i++) {
			Card card = new Card (i, "Clubs");
			cards.add(card);
		}
		for (int i = 2; i <= 14; i++) {
			Card card = new Card (i, "Spades");
			cards.add(card);
		}
		for (int i = 2; i <= 14; i++) {
			Card card = new Card (i, "Diamonds");
			cards.add(card);
		}		
	}
	
	//Methods
	
	public void describeDeck() {
		for (Card card : cards) {
			System.out.println(card.getName());
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	
	public Card draw() {
		return cards.remove(0);
		}
		
	}

