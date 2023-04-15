package week6Assignments;

public class Card {

	//Collections and Objects
	
	private int value;
	private String name;
	
	//Constructors
	
	public Card(int value, String name) {
		if (value == 2) {
			setName("Two of " + name);	 
		}	else if (value == 3) {
				setName("Three of " + name);
		}	else if (value == 4) {
				setName("Four of " + name);
		}	else if (value == 5) {
				setName("Five of " + name);
		}	else if (value == 6) {
				setName("Six of " + name);
		}	else if (value == 7) {
				setName("Seven of " + name);
		}	else if (value == 8) {
				setName("Eight of " + name);
		}	else if (value == 9) {
				setName("Nine of " + name);
		}	else if (value == 10) {
				setName("Ten of " + name);
		}	else if (value == 11) {
				setName("Jack of " + name);
		}	else if (value == 12) {
				setName("Queen of " + name);
		}	else if (value == 13) {
				setName("King of " + name);
		}	else if (value == 14) {
				setName("Ace of " + name);
			}
		
		setValue(value);
		}
		
	
	//Methods
	
	public void describe() {
		System.out.println(getName());
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
