import java.util.Scanner;


public class ValidatePhoneNumber {


	public static void main(String[] args) {

		boolean notDone = true;
		String entryString;
		long thePhoneNumber;
		int theAreaCode, theExchange, theNumber;


		String formatError = "===> Entry must be all numeric (AAAEEENNNN or EEENNNN)\n";

		Scanner keyin = new Scanner(System.in);
		System.out.println("\nValidate Phone Number");
		System.out.println("" +
				"\nThis program validates a phone number (AAAEEENNNN or EEENNNN\n");

		while (notDone) {					// Date entry loop
			System.out.println("Enter a phone number as AAAEEENNNN or EEENNNN\n");
			entryString = keyin.nextLine();

			if (entryString.equals("q")) {
				System.exit(0);
			}

			if (entryString.equals("")) {
				System.out.println("===> Entry required\n");
				continue;
			}

			if (!isNumeric(entryString)) {
				System.out.println(formatError);
				continue;
			}

			thePhoneNumber = Long.parseLong(entryString);

			if (thePhoneNumber < 1000000){
				System.out.println(formatError);
				continue;
			}

			theNumber = (int) (thePhoneNumber % 10000);
			thePhoneNumber = thePhoneNumber / 10000;
			theExchange = (int) (thePhoneNumber % 1000);
			thePhoneNumber = thePhoneNumber / 1000;
			theAreaCode = (int) (thePhoneNumber % 1000);
			thePhoneNumber = thePhoneNumber / 1000;

			if (thePhoneNumber != 0 || theNumber == 0 || theExchange == 0) {
				System.out.println(formatError);
				continue;
			}

			if (theAreaCode != 0) {
				System.out.printf("The phone number is (%03d) %03d-%04d\n", 
						theAreaCode, theExchange, theNumber);
			} else {
				System.out.printf("The phone number is %03d-%04d\n", 
						theExchange, theNumber);
			}
		}


		keyin.close();

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
	}

}