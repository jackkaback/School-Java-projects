/* Class: Assign09 
 * Version: 1.0.0
 * Programmer: Jack Kaback
 * Date: 04/05/2014
 * Description: "Validate credit card"
 * Revisions: 04/09/2014 by Jack Kaback 4-07-14
 */
import java.util.Scanner;
public class Assign11 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);

		boolean notDone; //this is used to prompt the user to play again
		int lineCount = 0; //This is used to limit the number of cards on a line of output
		int [] deck = new int[52]; //this is the deck
		int [] scoredDeck = new int[52]; //this is for the times a card is hit
		int gamesWon = 0; //this is the games won
		int gamesLost = 0; //this is the games lost
		int result; //this is the result of the game
		int sum = 0; //this is the sum of the cards across the games
		int games = 0; //this is the sum of the games

		for(int ii = 1; ii < deck.length; ii++){
			deck[ii] = ii;
			scoredDeck[ii] = 0;
		} //this for loop gives the deck a value of ii at the card ii

		System.out.println("This is solitaire, let’s begin. "); //You wanna play a game?

		do {

			shuffle(deck); //This goes to the the method that rearanges the cards
			result = playGame(keyin, deck, scoredDeck); //This plays the game


			if(result == 0){gamesLost++; System.out.print("\nYou lost");} //This checks the return of the playGame method
			else if (result == 1){gamesWon++; System.out.print("\nYou won");}
			games++;


		} while (notDone = promptAgain(games)); //this gets the input of the promptAgain method
		//while (notDone = promptAgain(keyin));
		if (notDone == false){ //if the return is false then the program displays the following then the following is used and the program ends

			games = (gamesLost + gamesWon); //the games total is the sum of the games lost and won

			System.out.println("\nYou won: " + gamesWon + 
					"\nYou lost: " + gamesLost + 
					"\nOut of " + games); //this displays the total won, lost, and total games

			for(int ii = 0; ii < scoredDeck.length; ii++){
				sum += scoredDeck[ii];
			} //This adds the sum of the number of cards played


			System.out.print("You played: " + sum +
					" cards with an average of about: " + (sum / games) + 
					" cards per game\n");	//this displays the total played games and average per game

			for(int ii = 0; ii < scoredDeck.length; ii++){ //this checks every spot
				if (scoredDeck[ii] > 0){ //if the slot has a non zero value then the program displays the card and how many times it was flipped
					System.out.print(cardDescription(ii) + " =  " + scoredDeck[ii] + "    ");
					lineCount++;}


				if(lineCount == 4){
					System.out.println(); lineCount = 0;//to keep the output nice only 4 cards are on a line
				}
			}
		}

	}


	//************** METHODS **************

	public static String card(int cardNumber){ //this is used to return the card value or "number"

		String [] ranks = {"Ace" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "Jack" , "Queen" , "King"}; //the ranks

		String rank = ranks[cardNumber % 13]; //this takes the input then converts it to a rank
		return rank; //this returns the rank
	}

	public static String cardDescription(int cardNumber){ //this is used to return the whole card

		String [] suits = {"Spades" , "Hearts" , "Diamonds" , "Clubs"}; //the suits
		String [] ranks = {"Ace" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "Jack" , "Queen" , "King"}; //the ranks


		String suit = suits[(cardNumber / 13) % 4];//the input is converted into rank and suit
		String rank = ranks[cardNumber % 13];


		if(suit.equals("Spades") && rank.equals("Ace")) {return "THE ACE OF SPADES";} //AND DON'T FORGET THE JOKER
		//for the sake of humor and a reference if it is an ace and a spade the that is returned

		else {return rank + " of " + suit;}//this returns the description
	}

	public static void shuffle(int [] myDeck){//this shuffles the deck

		for(int ii = 0; ii < myDeck.length; ii++){

			int index = (int) (Math.random() * myDeck.length);//this switches the card at ii with another random card
			int temp = myDeck[ii];
			myDeck[ii] = myDeck[index];
			myDeck[index] = temp;
		}
	}


	public static int playGame(Scanner keyin, int [] myDeck, int [] myStats){
		while(true){
			//System.out.print("\nPress enter to begin: ");//this is displayed at the start of each "hand"
			//keyin.nextLine();//this waits for input before continuing

			for(int ii = 0; ii < myDeck.length; ii++){

				System.out.print("You say: " + card(ii) //this displays the user's "choice"
						+ "  next card is " + cardDescription(myDeck[ii])); //then the card flipped

				myStats[myDeck[ii]]++; //after each card is flipped a point is added to the card
				if(card(ii).equals(card(myDeck[ii]))){ //if the card they say has the same value as the one flipped then they lose
					return 0;
				}
				else{System.out.print(" Press enter to continue\n");} //otherwise the program waits for the user to press enter
				//keyin.nextLine();

			}
			return 1; //if they get through out the whole deck then they win.
		}
	}


	public static boolean promptAgain(Scanner keyin) { //at the end of a hand this prompts them to play again
		String reply;
		boolean result = false;

		do {
			System.out.printf("\nPlay again (y/n)? ");//this displays the output


			reply = keyin.nextLine(); //the output is reseved then converted to lowercase
			reply = reply.toLowerCase();


			if (reply.equals("y")) {//if the input is y then the program plays again
				result = true;
				break;
			} else if (reply.equals("n")) { //if it is an n then the program doesn't play again
				result = false;
				break;
			} else {
				System.out.println("===> Entry must be y or n? "); //if the input wasn't either then the program displays this
			}
		} while ((!reply.equals("y") || reply.equals("n")));

		return result; //the program return the result
	}

	public static boolean promptAgain(int games) { //at the end of a hand this prompts them to play again
		if (games == 200000) {return false;}
		else {return true;}
	}
}