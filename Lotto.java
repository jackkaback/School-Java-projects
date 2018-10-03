import java.util.Scanner;
public class Lotto {

	public static void main(String[] args) {

		int winningNo;    //Winning lotto number
		int guess;		  //the guess
		int guessDig1, guessDig2;
		int winningDig1, winningDig2;

		Scanner input = new Scanner(System.in);
		// generate a random number from 0-99
		winningNo = (int) (Math.random() * 100);

		System.out.print("Enter your lotto number choice (0-99): ");
		guess = input.nextInt();

		guess = (guess < 0) ? 0 : guess; // if guess is less than 0 it makes it zero if not it is left alone
		guess = (guess > 99) ? 99 : guess;

		guessDig1 = guess / 10;
		guessDig2 = guess % 10;

		winningDig1 = winningNo / 10;
		winningDig2 = winningNo % 10;

		System.out.println("Your pick is :" + guess +
				"    The lotto number is :" + winningNo);

		//System.out.println(guessDig1 + "   " + guessDig2);
		//System.out.println(winningDig1 + "   " + winningDig2);

		if (guess == winningNo) {System.out.println("Exact match, you win nothing, ya lucky little shit. You're still stupid for gambling");
		} else if (guessDig2 == winningDig1 && guessDig1 == winningDig2) { System.out.println("Matched all digits you won some hypothetical money (too bad you're not smarter)");}
		else if (guessDig1 == winningDig1 ||
				guessDig1 == winningDig2 ||
				guessDig2 == winningDig1 ||
				guessDig2 == winningDig2) {System.out.println("You kinda won, no real big deal");}
		else {System.out.println("No match, sucks to be you stupid");
		}
		System.out.println("Also you shouldn't gamble, stupid");
		input.close();
	}

}
