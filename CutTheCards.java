import java.util.Scanner;
public class CutTheCards {

	public static void main(String[] args) {
		int [] deck = new int[52];
		int [] cardCounts = new int[52];

		int gameCount = 0;
		int gamesWon = 0;
		int gamesTied = 0;
		int gamesLost = 0;

		int gameResult;

		Scanner keyin = new Scanner(System.in);

		for(int ii = 1; ii < deck.length; ii++){
			deck[ii] = ii;
		}

		do {

			shuffle(deck);
			gameResult = playGame(keyin, deck, cardCounts);

			if(gameResult == 1){gamesWon++;}
			else if(gameResult == -1) {gamesLost++;}
			else {gamesTied++;}

		} while (promptAgain(keyin));
	}


	public static boolean promptAgain(Scanner input){
		return true;
	}

	public static void shuffle(int [] myDeck){
		for(int ii = 0; ii < myDeck.length; ii++){

			int index = (int) (Math.random() * myDeck.length);
			int temp = myDeck[ii];
			myDeck[ii] = myDeck[index];
			myDeck[index] = temp;
		}
	}

	public static int playGame(Scanner keyin, int [] myDeck, int [] myDeckStats){

		String cutPointString;
		int operatorChoice;
		int operatorValue;
		int cardsRemaining;
		int computerChoice;
		int computerValue;
		while(true){
			while(true){
				System.out.print("\nEnter a point on the deck to cut (10 - 42): ");
				cutPointString = keyin.nextLine();
				if(isNumeric(cutPointString)){break;}
				System.out.println("===> Entry must be numeric");
			}

			operatorChoice = Integer.parseInt(cutPointString);
			if (operatorChoice >= 10 && operatorChoice <= 42){
				break;}
			System.out.println("===> Entry must be 10 - 42");
		}
		operatorValue = myDeck[operatorChoice] % 13;
		myDeckStats[myDeck[operatorChoice]]++;

		cardsRemaining = myDeck.length - operatorChoice;
		computerChoice = (int) (Math.random() * cardsRemaining) + operatorChoice;
		computerValue = myDeck[computerChoice];
		myDeckStats[myDeck[computerChoice]]++;

		System.out.printf("\nYour card is the %s and the computer's card is the %s", 
				cardDescription(myDeck[operatorChoice], true),
				cardDescription(myDeck[computerChoice], true));
		
		if (operatorValue == 0){
			operatorValue = 13;
		}
		
		if (computerValue == 0){
			computerValue = 13;
		}
		
		if(operatorValue > computerValue){
			return 1;
		}
		else if (operatorValue < computerValue){return -1;}
		else {return 0;}
		
		
	}

	public static String cardDescription(int cardNumber, boolean returnSuit){
		
		String [] suits = {"Spades" , "Hearts" , "Diamonds" , "Clubs"};
		String [] ranks = {"Ace" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "Jack" , "Queen" , "King"};
		
		String suit = suits[(cardNumber / 13) % 4];
		String rank = ranks[cardNumber % 13];
		
		if(returnSuit = true) {
			return rank + " of " + suit;}
		else {return rank;}
	}
	
	public static boolean isNumeric(String checkString) {
		if (checkString == null) {
			return false;
		}
		for (int ii = 0; ii < checkString.length(); ii++) {
			if (checkString.charAt(ii) < '0' || checkString.charAt(ii) > '9') {
				return false;
			}
		}
		return true;
	}

}
