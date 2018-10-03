import java.util.Scanner;
public class ShowMultiples {

	public static void main (String[] args){

		//setup variables and scanner
		int choice, again, times;
		long stop, multiples;
		String prompt, putOut;
		Scanner scantron = new Scanner(System.in);
		boolean continuation = true;

		//tell user about the program
		prompt = "\nGet the multiples of any number, up to your defined stopping point!\n";
		prompt += "Enter the number you want the multiples of, followed by the stopping point.\n";
		prompt += "Entering small multiples and very large end points makes my brain hurt. Too hard!\n\n";
		System.out.print(prompt);

		//set the program to loop as long as user keeps saying they want to
		while (continuation){
			System.out.print("\n\nNumber to multiply: ");
			choice = scantron.nextInt();
			System.out.print("Number to end at: ");
			stop = scantron.nextInt();

			if (stop <= choice){
				System.out.println("\nGTFO!");
				continuation = false;			
			}else if((choice*3) >= stop){
				System.out.println("Too easy, do it yourself!");
				continuation = true;
			}else if ((choice==1)||(choice == 0)){
				System.out.println("You will never get anywhere with life./nRunning again.");
				continuation = true;
			}else{

				//get the multiples ready to go
				multiples = choice;
				putOut = "\n" + choice + ", ";
				times = 1;

				//do the multiples and set them to display
				do{
					multiples += choice;
					putOut += multiples + ", ";
					times++;
				}while (multiples <= (stop - (2*choice)));
				multiples += choice;
				putOut += multiples;
				times++;

				//output and see if user wants to go again
				System.out.println("\nThere are " + times + " multiples of " + choice + " from zero to " + stop + ", they are: " + putOut);
				System.out.print("\nWould you like to do another? 1 for yes and 0 for no: ");
				again = scantron.nextInt();

				//check the user choice and set exit value accordingly
				switch(again){
				case 0:
					continuation = false;
					break;
				case 1:
					continuation = true;
					break;
				default:
					System.out.println("invalid input, quitting.");
					continuation = false;
					break;
				}
			}

		}

		//tell the user of successful exit and cleanup
		System.out.print("\nexiting program");
		scantron.close();
		System.exit(0);
	}


}

