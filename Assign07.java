/* 
 * Class: Assign07 
 * Version: 1.0.0
 * Programmer: Jack Kaback
 * Date: 02/27/2014
 * Description: “Rock Paper Scissors Lizard Spock"
 * 
 * Revisions: 02/27/2014 by Jack Kaback 2-27-14
 */ 
import javax.swing.JOptionPane;
public class Assign07 {

	public static void main(String[] args) {

		boolean notDone = true;     //If the game should continue
		boolean entryOk = false;    //If the input by the user is an accepted value
		String userInputString;     //The user's input
		String userText;            //The result of the input converted to the choice (rock, paper scissors, lizard, or Spock)
		String result;              //The result of a game (win, lost, tie)
		String playAgain;
		String computerText;        //The computer's choice for display (rock, paper scissors, lizard, or Spock)
		int userChoice;             //The numerical value of the user's input for computing the winner
		int computerInput;          //The computer's input used in calculations
		int wins = 0;               //The user's wins, set at zero to start
		int losses = 0;             //The user's losses, set at zero to start
		int ties = 0;               //The user's ties, set at zero to start
		int total =0;               //The user's total games, set at zero to start

		while (notDone) {


			do { 

				entryOk = false;

				//This displays the game, the rules or outcomes and the options for the user
				userInputString = JOptionPane.showInputDialog(null, 
						"Rock Paper Scissors Lizard Spock \n\n\n" +
								"     Scissors cut paper \n" +
								"     Paper covers rock \n" +
								"     Rock crushes lizard \n" +
								"     Lizard poisons Spock \n" +
								"     Spock smashes scissors \n" +
								"     Scissors decapitate lizard \n" +
								"     Lizard eats paper \n" +
								"     Paper disproves Spock \n" +
								"     Spock vaporizes rock \n" +
								"     Rock crushes scissors \n\n" +
								"Please enter an integer for your choice or q to quit \n\n" +
								"   0 for Rock \n" +
								"   1 for Paper \n" +
								"   2 for Scissors \n" +
								"   3 for Lizard \n" +
								"   4 for Spock", 
								"Input Choice", JOptionPane.QUESTION_MESSAGE);


				//this detects if the input is valid and if it isn't makes the user try again
				if (userInputString == null ){notDone = false;  break;}
				else if ( userInputString.equals("0")  ||
						userInputString.equals("1")    ||
						userInputString.equals("2")    ||
						userInputString.equals("3")    ||
						userInputString.equals("4")    ||
						userInputString.equals("q")    ||
						userInputString.equals("r")){
					entryOk = true;}
				else {JOptionPane.showMessageDialog(null, "Entry must be 0 – 4, r, or q. Press enter to try again."); };} 

			while(!entryOk); 

			//If the entry was "q" the program ends
			if (userInputString.equals("q")) {
				notDone = false; break;
			}
			if (userInputString.equals("r")){userChoice = (int)(Math.random() * 5);}
			//If the input was a number then the string is converted to an integer
			else {userChoice = Integer.parseInt(userInputString);}


			// This generates the computer's choice
			computerInput = (int)(Math.random() * 5);

			//This converts the input number into its matching choice
			switch (userChoice) {
			case 0: userText = "Rock"; break;
			case 1: userText = "Paper"; break;
			case 2: userText = "Scissors"; break;
			case 3: userText = "Lizard"; break;
			case 4: userText = "Spock"; break;
			default: userText = "YOU CHEATED";} //The default is there so that there is always a value, the "YOU CHEATED" value is for comic effect

			//This does the same but for the computer
			switch (computerInput) {
			case 0: computerText = "Rock"; break;
			case 1: computerText = "Paper"; break;
			case 2: computerText = "Scissors"; break;
			case 3: computerText = "Lizard"; break;
			case 4: computerText = "Spock"; break;
			default: computerText = "VOID";} //The default is there so that there is always a value

			//This determines the winner based on the numerical inputs
			if (userChoice == computerInput){result = "Tied"; ties = 1 + ties; total = 1 + total;} //First the program checks for a tie
			else if (userChoice == 0 && computerInput == 1 ||
					userChoice == 0 && computerInput == 4 ||
					userChoice == 1 && computerInput == 2 ||
					userChoice == 1 && computerInput == 3 ||
					userChoice == 2 && computerInput == 0 ||
					userChoice == 2 && computerInput == 4 ||
					userChoice == 3 && computerInput == 0 ||
					userChoice == 3 && computerInput == 2 ||
					userChoice == 4 && computerInput == 1 ||
					userChoice == 4 && computerInput == 3 ) {result = "Lost"; losses = 1 + losses;  total = 1 + total;} //Next if there isn't a tie the program checks if the user lost
			else {result = "Won"; wins = 1 + wins;  total = 1 + total;} //Lastly if there isn't a tie or a loss the program gives the player a winner

			//This displays the result of the game and what number game that is at the top
			playAgain = JOptionPane.showInputDialog(null, "You had " + userText + " and the computer had " + computerText + " so you " + result,
					"Game number " + total,
					JOptionPane.QUESTION_MESSAGE);}
			
			//if (playAgain == 1){}};

					//This displays the total Wins, losses, ties, and total games once the user decides to quit by pressing "q"
					JOptionPane.showMessageDialog(null, "Your wins: " + wins +
							"\nYour losses: " + losses + 
							"\nYour ties: " + ties + 
							"\nThe total games: " + total,
							"Your Stats are:" ,
							JOptionPane.INFORMATION_MESSAGE);}}