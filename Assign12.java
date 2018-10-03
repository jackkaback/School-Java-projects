import java.util.Scanner;

/* Class: Assign12
 * Version: 1.0.0
 * Programmer: Jack Kaback
 * Date: 04/15/2014
 * Description: "Track Donations"
 * Revisions: 04/15/2014 by Jack Kaback 4-15-14
 */
public class Assign12 { //IT'S THE FINAL PROGRAM (COUNTDOWN)

	public static void main(String[] args) {

		//I declare my varibles here, being the number of site, the sites, the donations, and the food. the last 3 are arrays
		final int countOfSites = 6;
		String [] sites = new String[countOfSites];
		double [] food = new double [countOfSites];
		double [] donations = new double [countOfSites];

		Scanner keyin = new Scanner(System.in);
		System.out.println("Track payroll");

		//this loop gets all the information for the sites, food, and donations
		for(int ii = 0; ii < countOfSites; ii++){
			sites [ii] = getSiteName(keyin, ii);
			food [ii] = getFood(keyin, sites[ii]);
			donations [ii] = getMoney(keyin, sites[ii]);
		}

		printReport(sites, food, donations); //this uses a method and reprints the information that was just input for some reason

		printStats(sites, food, donations);//this uses a method to print out more information
		
		keyin.close();//closes the scanner
	}


	public static void printStats(String[] site, double[] food, double [] donations){
		int indexMostDonations = 0; //the number the of highest donations
		int indexOfMostFood = 0;//The number of the highest food

		for(int ii = 1; ii < site.length; ii++){ //this loop gets the index to match the highest of a donor

			if(food[ii] > food [indexOfMostFood]){
				indexOfMostFood = ii;
			}

			if(donations[ii] > donations[indexMostDonations]){
				indexMostDonations = ii;
			}
		}

		//this displays the sites with the highest donations and food
		System.out.print("\nSite with the highest donations is " + site[indexMostDonations] + "\nDonations of $" + donations[indexMostDonations]);
		System.out.print("\nSite with most food donated is " + site[indexOfMostFood] + "\nDonating " + food[indexOfMostFood] + " LB");
	}

	public static void printReport(String[] site, double[] food, double [] donations){
		double totalDonations = 0;//the total of the money donations
		double totalFood = 0;//the total of food donated
		double number = 6; //the number of sites

		System.out.println("\n-------------------------------------");
		System.out.println("Food and doantion tracking report");

		for(int ii = 0; ii < site.length; ii++){ //this displays the the sites and thier donations
			System.out.println("Site: " + site[ii]);
			System.out.println("Food: " + food[ii] + " LB");
			System.out.println("Donations: $" + donations[ii]);

			//this adds the donations together
			totalDonations += donations[ii];
			totalFood += food[ii];	
		}

		System.out.println("\n-------------------------------------");
		System.out.println("Food and doantion total report");

		System.out.printf("Donations total: $%9.2f\n" , totalDonations); //the total donations
		System.out.println("Food total: " + totalFood + " LB");

		System.out.printf("Average donations: $%9.2f\n" , (totalDonations / number)); //average donations are displayed
		System.out.printf("Average food donated: %9.2f LB\n\n" , (totalFood / number));
	}

	public static double getMoney (Scanner keyin, String name){
		double money = 8675309;
		String reply;

		while(true){
			System.out.print("Enter donations for " + name + ": $"); //the donations for X
			reply = keyin.nextLine();

			if(!isNumeric(reply, false, true)){ //this checks if it is numeric allowing decimals but not positive of negative
				System.out.println("Entry must be numeric"); continue;
			}

			money = Double.parseDouble(reply); //the input is converted to a double
			if (money > 0) {
				break;
			}
			System.out.print("GET A PAYING JOB, LOSER"); //Well, they're worthless...
		}
		return money; //returns the money (hopefully to me)
	}


	public static String getSiteName(Scanner keyin, int index){
		String reply;
		do{
			System.out.print("Enter Name of site: "); //this gets the sites name
			reply = keyin.nextLine();

			if (reply.equals("")){ 
				System.out.println("entry required"); //if the entry is blank then this is displayed
			}
		}while(reply.equals(""));

		return reply;

	}

	public static boolean isNumeric(String checkString, boolean signAllowed, boolean decimalAllowed) { 
		int iii = 0;
		int decimals = 0;
 
		//if the signAlloud is true the the first blank is skipped if it it a + or -
		if(signAllowed && (checkString.charAt(0) == '+' || checkString.charAt(0) == '-')){iii++;

		}

		if (checkString == null) {
			return false;
		}

		for ( ;iii < checkString.length(); iii++) { 
			//if decimals are alowed then this program skipps the first decimal but prohibits more
			if(decimalAllowed && checkString.charAt(iii) == '.' && decimals < 1){
				decimals++;
				continue;
			}
			if (checkString.charAt(iii) < '0' || checkString.charAt(iii) > '9') { //this checks if the input is only numbers
				return false; 
			}
		}
		return true;
	}

	public static double getFood (Scanner keyin, String name){
		double food = 8675309;
		String reply;

		while(true){
			System.out.print("Enter Food for " + name + ": (LB)");//gets the amount of food from the user for X
			reply = keyin.nextLine();

			if(!isNumeric(reply, false, true)){//this checks if it is numeric allowing decimals but not positive of negative
				System.out.println("Entry must be numeric"); continue;
			}

			food = Double.parseDouble(reply); //converts the input to the double
			if (food > 0) {
				break;
			}
			System.out.print("GET A PAYING JOB, LOSER"); //Well, they're worthless...
		}
		return food;
	}
}//Q: Are we not programmers (men)?
//A: We are Devo!