import java.util.Scanner;


public class PayrollTracking {

	public static void main(String[] args) {

		final int countOfEmployees = 2;
		String [] empNames = new String[countOfEmployees];
		double [] hourlyRate = new double [countOfEmployees];
		double [] hours = new double [countOfEmployees];


		Scanner keyin = new Scanner(System.in);
		System.out.println("Track payroll");

		for(int ii = 0; ii < countOfEmployees; ii++){
			empNames [ii] = getEmpName(keyin, ii);
			hourlyRate [ii] = getHourlyPay(keyin, empNames[ii]);
			hours [ii] = getHours(keyin, empNames[ii]);
		}

		printReport(empNames, hourlyRate, hours);
		printStats(empNames, hourlyRate, hours);



		keyin.close();
	}
	public static boolean isNumeric(String checkString, boolean signAllowed, boolean decimalAllowed) { 
		int iii = 0;
		int decimals = 0;

		if(signAllowed && (checkString.charAt(0) == '+' || checkString.charAt(0) == '-')){iii++;

		}

		if (checkString == null) {
			return false;
		}

		for ( ;iii < checkString.length(); iii++) { 

			if(decimalAllowed && checkString.charAt(iii) == '.' && decimals < 1){
				decimals++;
				continue;
			}
			if (checkString.charAt(iii) < '0' || checkString.charAt(iii) > '9') { 
				return false;
			}
		}
		return true;
	}

	public static String getEmpName(Scanner keyin, int index){
		String reply;
		do{
			System.out.print("Enter Name of employee: ");
			reply = keyin.nextLine();

			if (reply.equals("")){
				System.out.println("entry required");
			}
		}while(reply.equals(""));

		return reply;

	}

	public static double getHourlyPay (Scanner keyin, String name){
		double rate = 8675309;
		String reply;

		while(true){
			System.out.print("Enter hourly pay rate for " + name + ": ");
			reply = keyin.nextLine();

			if(!isNumeric(reply, true, true)){
				System.out.println("Entry must be numeric"); continue;
			}

			rate = Double.parseDouble(reply);
			if (rate > 0) {
				break;
			}
			System.out.print("GET A PAYING JOB, LOSER"); //Well, they're worthless...
		}
		return rate;
	}

	public static boolean isNumeric2(String checkString) { 
		if (checkString == null) {
			return false;
		}
		for (int ii = 0; ii < checkString.length(); ii++) { 
			if (checkString.charAt(ii) < '0' || checkString.charAt(ii) > '9' || checkString.charAt(ii) == '.') { 
				return false;
			}
		}
		return true;
	}

	public static double getHours (Scanner keyin, String name){
		double hours = 8675309;
		String reply;

		while(true){
			System.out.print("Enter hours for " + name + ": ");
			reply = keyin.nextLine();

			if(!isNumeric(reply, true, true)){
				System.out.println("Entry must be numeric"); continue;
			}

			hours = Double.parseDouble(reply);
			if (hours > 0) {
				break;
			}
			System.out.print("GET A PAYING JOB, LOSER"); //Well, they're worthless...
		}
		return hours;
	}

	public static void printReport(String[] emp, double[] rate, double [] hours){
		double totalHours = 0;
		double totalPay = 0;

		System.out.println("\n-------------------------------------");
		System.out.println("Payroll tracking report");

		for(int ii = 0; ii < emp.length; ii++){
			System.out.printf("Employee %s\n", emp[ii]);
			System.out.printf("rate: $%-9.2f\n", rate[ii]);
			System.out.printf("Hours %9.2f\n", hours[ii]);
			System.out.printf("Pay $%9.2f\n", rate[ii] * hours[ii]);

			totalHours += hours[ii];
			totalPay += hours[ii] * rate[ii];	
		}

		System.out.println("\n-------------------------------------");
		System.out.println("Payroll total report");

		System.out.printf("Hours worked total %9.2f\n" , totalHours);
		System.out.printf("Payed %9.2f\n" , totalPay);

	}

	public static void printStats(String[] emp, double[] rate, double [] hours){
		int indexOfHighestRate = 0;
		int indexOfMostHours = 0;

		double highestRate = rate[0];
		double highestHours = hours[0];

		for(int ii = 1; ii < emp.length; ii++){
			if(rate[ii] > rate [indexOfHighestRate]){
				indexOfHighestRate = ii;
			}

			if(hours[ii] > hours[indexOfMostHours]){
				indexOfMostHours = ii;
			}
		}
		
		System.out.print("\nEmployee with the highest rate is " + emp[indexOfHighestRate] + " with the rate of $" + rate[indexOfHighestRate]);
		System.out.print("\nEmployee with most hours is " + emp[indexOfMostHours] + " with " + hours[indexOfMostHours]);
	}
}