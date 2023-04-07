package week5OOPLab;

import java.util.List;

public class Card {

	String name;
	String suit;
	int value;
	
	
	public Card () {
		
	}
	
	public Card (String suit, int value) {
        this.suit = suit;
        this.value = value;
		switch (value) {
            case 2:  this.name = "2";
                     break;
            case 3:  this.name = "3";
                     break;
            case 4:  this.name = "4";
                     break;
            case 5:  this.name = "5";
                     break;
            case 6:  this.name = "6";
                     break;
            case 7:  this.name = "7";
                     break;
            case 8:  this.name = "8";
                     break;
            case 9:  this.name = "9";
                     break;
            case 10:  this.name = "10";
                     break;
            case 11: this.name = "Jack";
                     break;
            case 12: this.name = "Queen";
                     break;
            case 13: this.name = "King";
                     break;
            case 14: this.name = "Ace";
            		break;
            default: this.name = "Invalid month";
                     break;
        }              
	}


	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}


	public void describe() {
		System.out.println("Your card is: " + name + " of " + suit + "s.");
		System.out.println("The value of your card is: " + value + ".");
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSuit() {
		return suit;
	}


	public void setSuit(String suit) {
		this.suit = suit;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}
	
	
}
