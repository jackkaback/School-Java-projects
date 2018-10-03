/* Class: Assign09 
 * Version: 1.0.2
 * Programmer: Jack Kaback
 * Date: 03/24/2014
 * Description: "Validate date"
 * Revisions: 03/25/2014 by Jack Kaback 3-25-14
 */ 
import java.util.Scanner;
public class Assign09 {

	public static void main(String[] args) {

		boolean notDone = true;                                           //This is just used to make the loop occur
		String dateString;                                                //This is used to get the user's input
		String monthString = "THIS IS NOT A MONTH, IT'S A SANDWICH";      //This is for the month names, the default value is a reference to a comedy band
		Long date;                                                        //this is the full date in (M)MDDYYYY then used to convert into months, days, and years
		int year = 0;                                                     //This is the year from the input
		int month;                                                        //this is used to find the string monthString
		int day;                                                          //This is the number of the day in the month
		int maxDays =  666;                                               //This is the max number of days in a month

		Scanner keyin = new Scanner(System.in); //this opens the scanner

		System.out.println(" Validate Date \n" +
				" This program will validate a date entered by the operator in the form MMDDYYYY or MDDYYYY."); //this displays what the program's function is


		while(notDone){ //this just makes the program loop

			System.out.println("Enter the date (MMDDYYYY or MDDYYYY) or 'q' to quit"); //this tells the user their options
			dateString = keyin.nextLine(); //the next input from the user is recorded


			if (dateString.equals("q")) { 
				System.exit(0);} //if the user typed "q" then the program terminates


			if (dateString.equals("")) {
				System.out.println("===> Entry required\n");
				continue;} //if the user entered nothing this message is displayed then restarting the loop


			if (!isNumeric(dateString)) {
				System.out.println("===> Entry must be all numeric (MMDDYYYY or MDDYYYY)\n");
				continue;} //this checks the Method isNumeric to check if there are only numbers in the input


			date = Long.parseLong(dateString); //The string is then converted into a string


			if (date < 1000000){
				System.out.println("===> The date must be in (MMDDYYYY or MDDYYYY) format");
				continue;} //if the user'sinput is less than 1000000 then the program tell the user to enter a date it the proper format


			year  =  (int) (date % 10000); //this block converts the date into year, day, and month
			date = date / 10000;
			day = (int) (date % 100);
			date = date / 100;
			month = (int) (date / 1);
			date = date / 1000;


			if(year < 1000 || year > 5000){
				System.out.println("The year must be between 1000 - 5000"); continue;
			} //if the year isn't from 1000-5000 the program tells the user to enter a year that is


			if(month == 1){monthString = "January";} //This matches each month number to the correct "word"
			else if(month == 2){monthString = "Feburary";}
			else if(month == 3){monthString = "March";}
			else if(month == 4){monthString = "April";}
			else if(month == 5){monthString = "May";}
			else if(month == 6){monthString = "June";}
			else if(month == 7){monthString = "July";}
			else if(month == 8){monthString = "August";}
			else if(month == 9){monthString = "September";}
			else if(month == 10){monthString = "October";}
			else if(month == 11){monthString = "November";}
			else if(month == 12){monthString = "December";}
			else{System.out.println("===> The month must be from 1 - 12"); continue;} //if the month is over 12 then it tells the user it enter a proper value


			if(month == 1 || 
					month == 3 || 
					month == 5 || 
					month == 7 || 
					month == 8 || 
					month == 10 || 
					month == 12){
				maxDays = 31;} //this sets the maximum days for months with 31 days


			if ((month == 2) &&
					(year % 4 == 0 && 
					year % 100 != 0 || 
					year % 400 == 0)) {maxDays = 29;} //If the date is a leap year then feb's max is 29

			else if (month == 2) {maxDays = 28;} //If feb. isn't a leap year then it gets its normal 28 day max


			if (month == 4 ||
					month == 6 ||
					month == 9 ||
					month == 11) {maxDays = 30;}//the months with 30 days are set to a max of 30 days


			if (day <= maxDays && day > 0) {} //if the number of days is from 1 to the maximum in the month then the program continues

			else {System.out.println("===> The number of days for the month " + 
					monthString + " must be from 1 - " + 
					maxDays);continue;} //if the day isn't an accepted value then the program displays this message and starts back at the begining of the loop


			System.out.println(monthString + " " + day + ", " + year + " Is a valid date.");} //if the date given is valid then the program displays the date

		keyin.close();//the scanner is closed

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
	}// this is used to check if the input is only numbers
}
