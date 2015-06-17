package cardGame;

/**
 * 
 * 
 * 
 * 
 * @author alen.bumbulovic
 *
 */

public class Card {

	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 13;
	private static final int MIN_SUIT = 0;
	private static final int MAX_SUIT = 4;
	
	public static final int HEART = 0;
	public static final int DIAMOND = 1;
	public static final int CLUB = 2;
	public static final int SPADE = 3;
	public static final int JOKER = 4;
	
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	
	
	
	private int value;
	private int suit;
	private boolean isJoker = false;

	public Card() {
		this.suit = JOKER;
		this.value = 0;
		isJoker = true;
	}

	public Card(int value, int suit) throws Exception {
		if (value > MAX_VALUE || value < MIN_VALUE) {
			throw new IllegalArgumentException("Value must be in range 1 to 13");

		}
		if (suit < MIN_SUIT || suit > MAX_SUIT) {
			throw new IllegalArgumentException("Suit has to be in range 0 to 4");

		}
		this.value = value;
		this.suit = suit;
		if(suit == MAX_SUIT){
			this.isJoker = true;
		}

	}

	public int getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}
	public void setValue(){
		if(isJoker == false){
			throw new UnsupportedOperationException("Can't change the value of a non Joker card");
		}
		this.value = value;
	}
	public void setSuit(int suit){
		if(isJoker == false){
			throw new UnsupportedOperationException("Can't change the value of a non Joker card");
		}
		if (suit < MIN_SUIT || suit > MAX_SUIT) {
			throw new IllegalArgumentException("Suit has to be in range 0 to 4");

		}
		this.suit = suit;
	}
	
	public String getValueString(){
		//because cards between 1 and 10 are just numbers
		if(value == 1 || value > 10){

			switch (value) {
			case QUEEN:
				return "Queen";
				
			case JACK:
				return "Jack";
				
			case ACE:
				return "Ace";
				
			case KING:
				return "King";
			default:
				return "";

			}
			
			}else{
				return Integer.toString(value);
			}
		 }
	public String getSuitString(){
		switch(suit){
		case HEART:
			return "Heart";
		case DIAMOND:
			return "Diamond";
		case CLUB:
			return "Club";
		case SPADE:
			return "Spade";
		default:
			return "Joker";
			
		
		}
		
	}
	public String getCard(){
		return getValueString() + " " + getSuitString();
	}
	public String toString(){
		return getCard();
	}

	
		
		


	
		}
