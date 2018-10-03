/* Class: Assign09 
 * Version: 1.0.0
 * Programmer: Jack Kaback
 * Date: 04/01/2014
 * Description: "Validate credit card"
 * Revisions: 04/01/2014 by Jack Kaback 4-01-14
 */ 
import java.util.Scanner;

public class Assign10 {

	public static void main(String[] args) {

		boolean notDone = true;       //This is used to loop the program until the user quits
		String cardString;            //This is the user's input
		Long card;                    //the user's input will be converted into a long

		Scanner keyin = new Scanner(System.in); //this makes a new scanner

		System.out.println("Validate Credit Card"); //this displays once 

		while(notDone){ //this loop will run until the user quits

			System.out.println("Enter the card number (13 - 16 digits) or 'q' to quit\n"); //this tells the user their options
			cardString = keyin.nextLine();//this gets the user's input

			if (cardString.equals("q")) { 
				System.exit(0);}          //if the user types q then the program terminates

			if (cardString.equals("")) {
				System.out.println("===> Entry required\n"); //if there isn't any input the program tells the user then returns to the start of the loop
				continue;}

			if (!isNumeric(cardString)) {
				System.out.println("===> Entry must be all numeric (13 - 16 digits)\n");  //if the input had characters other than numbers this informs them not to and repeats the loop
				continue;}

			card = Long.parseLong(cardString); //this converts the user's input into a long

			if(isValidCard(card)){ //this checks if the card is valid the displays the following message
				System.out.println(card + " is a valid number " + cardCompany(card) + " card number\n");
			}


			else{System.out.println(card + " is an invalid " + cardCompany(card) + " card number\n");} //if the card is invalid then the program displays this message


		} //end of while loop
		keyin.close(); //this will terminate the scanner
	}



	//************** METHODS **************
	public static boolean isNumeric(String checkString) { //this is what is used to deturmine if the input is all numbers
		if (checkString == null) {
			return false;
		}
		for (int ii = 0; ii < checkString.length(); ii++) { 
			if (checkString.charAt(ii) < '0' || checkString.charAt(ii) > '9') { //it checks every digit for the characters 0 - 9
				return false; //if the digits aren't all numbers then it returns false
			}
		}
		return true;//if the string is all numbers then the return is true
	}//end of isNumeric


	public static boolean isValidCard(long number){ //this is what is used for validating the card number
		int checkSum;

		checkSum = sumOfDoubleEvenPlaces(number) + sumOfOddPlaces(number);//it adds twice the value of the even places and the odds together

		if(checkSum % 10 == 0){ //if the sum is divisible by ten with no remainder then the number is good
			return true;
		}
		else {return false;} //if not then it returns false
	}//end of isValidCard


	public static int sumOfDoubleEvenPlaces(long number){ //this adds the sum of double the even places
		int result = 0; //the result is set to zero to start
		Long overTen; //this is used to check if the value is over ten
		number = number / 10; //the number is divided by tn to set it up for the first even number

		while(number != 0){ //as long as the number isn't zero this will loop
			overTen = (number % 10 * 2); //overten is made equal to double the remainder from the number divided by ten
			if (overTen >= 10){result += ((overTen % 10) + 1);} //if the number is greater than or equal to ten it takes the first digit and add one and is added to the result
			else {result += overTen;} //if it isn't over ten then the value is just added to the result
			number = number / 100; //the number is then divided by 100 to get to the next even digit
		}//end of while loop
		return result; //after the loop is done the result is returned
	}//end of sumOfDoubleEvenPlaces


	public static int sumOfOddPlaces(long number){ //this adds the odd digits together
		int result = 0;//the result is set to zero to start

		while(number != 0){//as long as the number isn't zero the loop will continue
			result += (number % 10); //the remainder of the number divided by ten is added to the result
			number = number / 100; //the number is divided by 100 to bring the number up to the next odd number
		}//end of while loop
		return result; //once the loop is done the result is returned
	}//end of sumOfOddPlaces


	public static String cardCompany(long number){//this deturmines the card company
		boolean notDone = true; //this is used for the loop

		while(notDone){
			number = (number / 10); //the number is divided by ten

			if (number < 40) {break;}//once the number is less than forty the loop breaks (it is set to 40 because 37 is needed for Amex but the lowest otherwise is 4)

			else {continue;} //if not the loop restarts
	
		}//end of while loop
		
		
		if (number == 37) {return "American Express";} //this block takes the number (that is now less than 40) and finds what company has thet prefix
		else if (number == 4) {return "Visa";}
		else if (number == 5) {return "MasterCard";}
		else if (number == 6) {return "Discover";}
		else { return "Undefined";} //if the 1 or 2 digit prefix doesn't match any of the cards then it is undefined
	} //end of cardCompany
}
