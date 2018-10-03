import java.util.Scanner;
public class ValidateUPC {
	public static void main(String[] args) {

		Scanner  keyin = new Scanner(System.in);

		String numberString;
		long number;

		System.out.println("Validate UPC number\n");

		while(true){
			System.out.print("Enter UPC number or q to quit: ");
			numberString  = keyin.nextLine();

			if(numberString.equals("q")){
				break;
			}

			if(!isNumeric(numberString)){
				System.out.println("===> Entry must be numeric or q");
				continue;
			}

			number = Long.parseLong(numberString);

			if(isValidUPC(number)){
				System.out.println(number + " is a valid UPC number");
			}
			else{System.out.println(number + " isn't a valid UPC number");}
		}

		keyin.close();
	}

	//************** METHODS ************

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

	public static boolean isValidUPC(long number){
		int checkSum;
		checkSum = sumOfTripleEvenPlaces(number) + sumOfOddPlaces(number);

		if(checkSum % 10 == 0){
			return true;
		}
		else {return false;}
	}

	public static int sumOfTripleEvenPlaces(long number){
		int result = 0;

		number = number / 10;

		while(number != 0){
			result += (number % 10 * 3);
			number = number / 100;
		}
		return result;
	}

	public static int sumOfOddPlaces(long number){
		int result = 0;

		while(number != 0){
			result += (number % 10);
			number = number / 100;
		}
		return result;
	}

}
