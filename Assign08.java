/* Class: Assign08 
 * Version: 1.0.0
 * Programmer: Jack Kaback
 * Date: 03/12/2014
 * Description: "Random Math test"
 * Revisions: 03/13/2014 by Jack Kaback 3-13-14
 */  
import javax.swing.JOptionPane;
public class Assign08 {

	public static void main(String[] args){

		boolean notDone = true;					   //This is used to end the program at the users choice
		boolean entryOK = false;                   //this is for determining if the user's inputs are ok
		String numberOfQuestionsString = null;     //the number of questions from the user
		String difficulty = null;                  //the difficulty setting
		String result;                             //if the user is right or wrong
		String userInputString;                    //This is used to collect the user's input for questions
		String question;                           //this the the question that is presented to the user
		int numberOfQuestions = 0;                 //This is the integer used to stop the questions being asked
		int numberOn = 0;                          //The number of question that the user is on
		int answer = 0;                            //the correct answer to the question
		int componet1 = 0;                         //one of the two randomly generated numbers
		int componet2  = 0;                        //one of the two randomly generated numbers
		int userInput;                             //the input from the user
		int correct = 0;                           //The number of times the user got the right answer
		int random;                                //This is used to randomly generate what time of problem there will be
		int max;                                   //Maximum value of the componets based on difficulty

		while (notDone){  //This will run the program until completion or until the user inputs a "q"
			while(!entryOK){ //This runs as long as the entered value is an acceptible value

				numberOfQuestionsString = JOptionPane.showInputDialog(null, 
						"How many questions would you like? (1-10)", 
						"Enter the number of questions", 
						JOptionPane.QUESTION_MESSAGE); //This message asks for the desired number of questions

				if(numberOfQuestionsString.equals("1") ||
						numberOfQuestionsString.equals("2") ||
						numberOfQuestionsString.equals("3") ||
						numberOfQuestionsString.equals("4") ||
						numberOfQuestionsString.equals("5") ||
						numberOfQuestionsString.equals("6") ||
						numberOfQuestionsString.equals("7") ||
						numberOfQuestionsString.equals("8") ||
						numberOfQuestionsString.equals("9") ||
						numberOfQuestionsString.equals("10") ||
						numberOfQuestionsString.equals("q")) {entryOK = true;} //this checks if the input from the user is valid

				else{JOptionPane.showMessageDialog(null,
						"Invald entry please use 1-10 or q to quit", 
						"Invald Answer", 
						JOptionPane.INFORMATION_MESSAGE);}} // if the input is't valid this message pops up



			if (numberOfQuestionsString.equals("q")) {notDone = false; break;} //If the input was "q" then the program ends
			else  {numberOfQuestions = Integer.parseInt(numberOfQuestionsString);} //If not then the input is converted in to an integer




			entryOK = false;
			while(!entryOK){

				difficulty = JOptionPane.showInputDialog(null,
						"Select your difficulty \n" +
								"   1 Easy (Max 10) \n" +
								"   2 Normal (Max 25) \n" +
								"   3 Hard (Max 50)", 
								"Enter the difficulty",
								JOptionPane.QUESTION_MESSAGE); //This prompts the user for their requested difficulty

				if(difficulty.equals("1") ||
						difficulty.equals("2") ||
						difficulty.equals("3") ||
						//difficulty.equals("4") || //For impossible literally
						difficulty.equals("q")) {entryOK = true;} //this checks if the input was ok
				else{JOptionPane.showMessageDialog(null, "Invald Entry Please use  1-3 or q to quit");}} //if it wasn't ok then this message is shown




			if(difficulty.equals("q")){notDone = false; break;} //If the input was q then the program terminates 
			else if(difficulty.equals("1")){max = 10;} //Based on the users input one of the following will be set as the difficulty
			else if(difficulty.equals("2")){max = 25;}
			else if(difficulty.equals("3")){max = 50;}
			else {max = 8675309;} //Jenny I got your number, also this is quite literally impossible




			for(numberOn = 1; numberOn <= numberOfQuestions; numberOn++){ //this makes the program loop until the number of the question is greater than then number the user wanted

				componet1 = 0;//This resets the 3 varibles used at the sart of the loop
				componet2 = 0;
				answer = 0;

				random = (int) (Math.random() * 4); //this is to determine the type of question asked
				componet1 = ((int) (Math.random() * max) + 1); //The 1 is added to remove the chance of a zero
				componet2 = ((int) (Math.random() * max) + 1); //the 1 is added to remove the chance of a zero

				if (random == 0)
				{answer = componet1 + componet2;
				question = componet1 + " + " + componet2;} //This produces an addtion problem if "random" is 0 

				else if (random == 1){ //This makes a subtraction problem if "random" is 1
					if (componet1 >= componet2)
					{answer = (componet1 - componet2); 
					question = componet1 + " - " + componet2;} //This checks if one factor is greater than or equal too the other then produces a subtraction problem
					else {answer = (componet2 - componet1);
					question = componet2 + " - " + componet1;}} //If the 1st factor is less then the other another question is produced ensuring an always positive or zero answer 

				else if (random == 2)
				{answer = componet1 * componet2;
				question = componet1 + " * " + componet2;} //this produces a multiplication problem

				else {random = (int) (Math.random() * 2); //this block will produce one of two possible division problems (the way I did this provides the exact same answer as the way you instructed but simpler) 
				if (random == 0) {answer  = componet1; question  = (componet1 * componet2) + " / " + componet2;} 
				else{answer = componet2; question = (componet1 * componet2) + " / " + componet1;}}

				userInputString = JOptionPane.showInputDialog(null,
						"What is " + question,
						"Question #" + numberOn,
						JOptionPane.QUESTION_MESSAGE);//This prompts the user for the answer to the problem

				userInput = Integer.parseInt(userInputString); //this converts the user's input to an integer

				if(userInput == answer){result = "Right"; correct++;} //if the user's input is the same as the answer then the user gets it right and ads one point to the number of times "right"
				else{result = "Wrong";}//if not then they are wrong

				JOptionPane.showMessageDialog(null, "Your answer was " + result + "\n" + question + " = " + answer); //this displays the out come of their answer (right or wrong) then displays the problem with the answer



			}
			JOptionPane.showMessageDialog(null,
					"You got " + correct + 
					" right and " + (numberOfQuestions - correct) + 
					" wrong out of " + numberOfQuestions); break; //this displays the total number of problems right, wrong, and total
		}
	}
}