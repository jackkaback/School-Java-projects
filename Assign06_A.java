import java.util.Scanner;

public class Assign06_A {

	public static void main(String[] args) {

		int operatorChoice;                          // Operator's input
		String operatorChoiceString;           // Operator's input
		int computerChoice;                          // Computer's random choice

		String operatorText = "";              // Operator's input as text
		String computerText;                   // Computer's choice as text       
		String gameResult;                           // Test to display of the result
		String reply;
		int countOfGames = 0;

		boolean notDone = true;
		boolean entryOK = false;

		Scanner keyin = new Scanner(System.in);           // Scanner for operator input

		while (notDone) {


			do { 

				entryOK = false;

				System.out.print("Rock Paper Scissors\n\n");

				System.out.println("Rock defeats scissors");
				System.out.println("Scissors defeats paper");
				System.out.println("Paper defeats rock");
				System.out.println();

				System.out.print("Please enter an integer for your choice ");  
				System.out.print("(0 for Rock; 1 for Paper; 2 for Scissors; q to quit): ");
				operatorChoiceString = keyin.nextLine();

				if (operatorChoiceString == null ) {
				} else if ( operatorChoiceString.equals("0")  ||
						operatorChoiceString.equals("1")  ||
						operatorChoiceString.equals("2")  ||
						operatorChoiceString.equals("q"))
				{
					entryOK = true;
				} else {
					System.out.println("Entry must be 0 - 2 or q." +
							"  Press enter to try again.");
					reply = keyin.nextLine();

				}

			} while (!entryOK);  


			if (operatorChoiceString.equals("q")) {
				notDone = false;
				break;                      // exit notDone loop
			}
			operatorChoice = Integer.parseInt(operatorChoiceString);


			// Generate computer's choice
			computerChoice = (int)(Math.random() * 3);

			// Convert choices to text values

			// Convert choices to text values
			switch (operatorChoice) {
			case 0: operatorText = "rock"; break;
			case 1: operatorText = "paper"; break;
			case 2: operatorText = "scissors"; break;
			//default: operatorText = "Not defined";
			}

			// Convert choices to text values
			switch (computerChoice) {
			case 0: computerText = "rock"; break;
			case 1: computerText = "paper"; break;
			case 2: computerText = "scissors"; break;
			default: computerText = "Not defined";
			}

			// Check the game results
			if (computerChoice == operatorChoice) {
				gameResult = "It's a tie.";

			} else if ((computerChoice == 0 && operatorChoice == 2) ||
					(computerChoice == 1 && operatorChoice == 0) ||
					(computerChoice == 2 && operatorChoice == 1) ) {

				gameResult = "Ha ha, I won!!";

			} else {
				gameResult = "You won, but you just got lucky!!";
			}

			countOfGames++;

			// Display the result
			System.out.println("The computer is " + computerText + ".  You are " + operatorText
					+ ".  " + gameResult);

			// System.out.printf("The computer is %-10s.  You are %2.2s.  %s", computerText, operatorText, gameResult);


		} // End of notDone loop

		System.out.println("\nYou have played " + countOfGames + " games.");

		keyin.close();
	}
}