/* 
 * Class: Assign06 
 * Version: 1.0.2
 * Programmer: Jack Kaback
 * Date: 02/24/2014
 * Description: “Rock Paper Scissors
 * 
 * Revisions: 02/26/2014 by Jack Kaback 2-26-14
 */ 
import java.util.Scanner;
public class Assign06 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.println("Rock Paper Scissors Lizard Spock \n");

		System.out.print("    Rock beats Scissors \n    Paper beats Rock \n    Scissors beats Paper \n    Paper beats Spock \n    Lizard beats Spock \n    Lizard beats Paper \n    Spock beats Scissors \n    Spock beats Rock \n    Scissors beats Lizard \n    Rock beats Lizard \n");

		System.out.print("Please enter an integer for your choice (0 for Rock; 1 for Paper; 2 for Scissors; 3 for Lizard; 4 for Spock):  ");
		int player = Input.nextInt();    //This block gets the player's input and if it doesn't match the requirements then it is made to
		player = (player < 0) ? (int) (Math.random() * 5) : player;
		player = (player > 4) ? (int) (Math.random() * 5) : player;

		String playerChoice;
		switch (player % 5){
		case 0: playerChoice = "Rock"; break;
		case 1: playerChoice = "Paper"; break;
		case 2: playerChoice = "Scissors"; break;
		case 3: playerChoice = "Lizard"; break;
		case 4: playerChoice = "Spock"; break;
		default: playerChoice = "void";} //This finds out what the player's choice is to be later displayed

		int computer = (int) (Math.random() * 5); //This will get the computer's input and get it as a Rock paper or scissors
		String computerChoice;
		switch (computer % 5){
		case 0: computerChoice = "Rock"; break;
		case 1: computerChoice = "Paper"; break;
		case 2: computerChoice = "Scissors"; break;
		case 3: computerChoice = "Lizard"; break;
		case 4: computerChoice = "Spock"; break;
		default: computerChoice = "void";}

		System.out.println("You picked: " + playerChoice + " and the computer picked: " + computerChoice);
		if (player == computer) {System.out.println("You tied");} //This will find the winner of the game based on the input of the player and computer and then display the result
		else if (player == 0 && computer == 1
				|| player == 1 && computer == 2 
				|| player == 2 && computer == 0
				|| player == 3 && computer == 2 
				|| player == 4 && computer == 3
				|| player == 4 && computer == 1
				|| player == 3 && computer == 0) {System.out.println("You lost");}
		else {System.out.println("You won");}


		System.out.print("\n\n\nWould you like to play again? (0 is no)");
		int play = Input.nextInt();

		while(play != 0){ System.out.print("Please enter an integer for your choice (0 for Rock; 1 for Paper; 2 for Scissors; 3 for Lizard; 4 for Spock):  ");
		player = Input.nextInt();    //This block gets the player's input and if it doesn't match the requirements then it is made to
		player = (player < 0) ? (int) (Math.random() * 5) : player;
		player = (player > 4) ? (int) (Math.random() * 5) : player;

		switch (player % 5){
		case 0: playerChoice = "Rock"; break;
		case 1: playerChoice = "Paper"; break;
		case 2: playerChoice = "Scissors"; break;
		case 3: playerChoice = "Lizard"; break;
		case 4: playerChoice = "Spock"; break;
		default: playerChoice = "void";} //This finds out what the player's choice is to be later displayed

		computer = (int) (Math.random() * 5); //This will get the computer's input and get it as a Rock paper or scissors
		switch (computer % 5){
		case 0: computerChoice = "Rock"; break;
		case 1: computerChoice = "Paper"; break;
		case 2: computerChoice = "Scissors"; break;
		case 3: computerChoice = "Lizard"; break;
		case 4: computerChoice = "Spock"; break;
		default: computerChoice = "void";}

		System.out.println("You picked: " + playerChoice + " and the computer picked: " + computerChoice);
		if (player == computer) {System.out.println("You tied");} //This will find the winner of the game based on the input of the player and computer and then display the result
		else if (player == 0 && computer == 1
				|| player == 1 && computer == 2 
				|| player == 2 && computer == 0
				|| player == 3 && computer == 2 
				|| player == 4 && computer == 3
				|| player == 4 && computer == 1
				|| player == 3 && computer == 0) {System.out.println("You lost");}
		else {System.out.println("You won");}


		System.out.print("\n\n\nWould you like to play again? (0 is no)");
		play = Input.nextInt();};
		System.out.print("Wow you suck");
		Input.close();
	}}
