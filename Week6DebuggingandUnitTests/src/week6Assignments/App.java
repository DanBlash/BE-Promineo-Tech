package week6Assignments;

public class App {

	public static void main(String[] args) {
	Deck deck = new Deck();
	Player player1 = new Player("Dan");
	Player player2 = new Player("Jim");
	
	deck.shuffle();
	
	for (int i = 0 ; i < 52; i++) {
		if (i % 2 == 0) {
			player1.draw(deck);
		}	else {
			player2.draw(deck);
		}
		
	}
	
	for (int i = 0; i < 26; i++) {
		Card player1result = player1.flip(player1.hand);
		Card player2result = player2.flip(player2.hand);
		if(player1result.getValue() > player2result.getValue()) {
			System.out.printf("%s's %s wins against %s's %s.%n", player1.name, player1result.getName(), player2.name, player2result.getName());
			player1.incrementScore();
		} else if (player1result.getValue() < player2result.getValue()) {
			player2.incrementScore();
			System.out.printf("%s's %s wins against %s's %s.%n", player2.name, player2result.getName(), player1.name, player1result.getName());
		} else {
			System.out.println("It's a Draw!");
		}

	}
	
	if (player1.score > player2.score) {
		System.out.printf("%n%s is the winner with a score of %d", player1.name, player1.score);
	} else if (player1.score < player2.score) {
		System.out.printf("%n%s is the winner with a score of %d", player2.name, player2.score);
	} else {
		System.out.printf("%nThe game has ended in a tie!.");
	}
	
	
	}
	
			

	}
