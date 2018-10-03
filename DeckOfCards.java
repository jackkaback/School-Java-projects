
public class DeckOfCards {

	public static void main(String[] args) {

		int [] deck = new int[52];
		String [] suits = {"Spades" , "Hearts" , "Diamonds" , "Clubs"};
		String [] ranks = {"Ace" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "Jack" , "Queen" , "King"};


		//Initialize the deck
		for(int ii = 1; ii < deck.length; ii++){
			deck[ii] = ii;
		}

		//Shuffle deck

		for(int ii = 0; ii < deck.length; ii++){

			int index = (int) (Math.random() * deck.length);
			int temp = deck[ii];
			deck[ii] = deck[index];
			deck[index] = temp;
		}

		//Display the first 4 cards
		for (int ii = 0; ii < 4; ii++){
			String suit = suits[deck[ii] / 13];
			String rank = ranks[deck[ii] % 13];
			System.out.println("Card number " + deck[ii] + ": " + rank + " of " + suit);
		}
	}

}
