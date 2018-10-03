import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		int year;
		boolean isLeapYear;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year :");
		year = input.nextInt();
		
		isLeapYear = (year % 4 == 0); //% makes it ask for remainder
		isLeapYear = isLeapYear && (year % 100 !=0);
		isLeapYear = isLeapYear || (year % 400 ==0);
		//isLeapYear = (year % 4 == 0) && (year % 100 !=0) || (year % 400 ==0);
		//System.out.println("\n" + year + " is a leap year? " + isLeapYear);
		if (isLeapYear) { System.out.println(year + " Is a leap year");}
		else {System.out.println(year + " Isn't a leap year");}
		String result = (isLeapYear) ? year + " is a leap year" : year + " Isn't a leap year";
		System.out.println(result);
		
		String sign;
		switch(year % 12) {
		case 0: sign = "monkey"; break;
		case 1: sign = "rooster"; break;
		case 2: sign = "dog"; break;
		case 3: sign = "pig"; break;
		case 4: sign = "rat"; break;
		case 5: sign = "ox"; break;
		case 6: sign = "tiger"; break;
		case 7: sign = "rabbit"; break;
		case 8: sign = "dragon"; break;
		case 9: sign = "snake"; break;
		case 10: sign = "horse"; break;
		case 11: sign = "sheep"; break;
		default: sign = "NOPE";
		
		}
		System.out.println("it is also the chinese zodiac year of the " + sign);
		System.out.printf("%d is also the chinese zodiac year of the %s", year, sign );
		input.close();
	}

}
