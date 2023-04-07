package week5OOPLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
		
	List<Card> cards = new ArrayList<Card>();
	

	public Deck() {
		for (int i = 2; i <= 14; i++) {
			Card firstSetOfCard = new Card ("Heart", i);
			cards.add(firstSetOfCard);
		}
		for (int i = 2; i <= 14; i++) {
			Card firstSetOfCard = new Card ("Club", i);
			cards.add(firstSetOfCard);
		}
		for (int i = 2; i <= 14; i++) {
			Card firstSetOfCard = new Card ("Spade", i);
			cards.add(firstSetOfCard);
		}
		for (int i = 2; i <= 14; i++) {
			Card firstSetOfCard = new Card ("Diamond", i);
			cards.add(firstSetOfCard);
		}		
	}
	
	

	public void descibeDeck() {
		for (Card card: cards) {
			System.out.println(card.getName() + " of " + card.getSuit() + "s.");
		}
	}

	public void shuffle () {
			Collections.shuffle(cards);
	}
	
	public void draw () {
		shuffle();
		Card drawnCard = cards.get(0);
		System.out.println(drawnCard.getName() + " of " + drawnCard.getSuit() + "s.");
		
	}
	
	//public void drawHand() {
		//Card drawnCard = 
	//}
}


