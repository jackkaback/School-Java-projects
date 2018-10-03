/* 
 * Class: Assign04 
 * Version: 1.0.0 
 * Programmer: Jack Kaback
 * Date: 02/19/2014
 * Description: Calculate Discount
 * 
 * Revisions: 02/19/2014 by Jack Kaback 2-19-14
*/ 
import java.util.Scanner;
public class Assign05 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		System.out.print("Caculate Discount \n\n");
		System.out.print("Enter Item's Listed Price : $"); // This presents the title and gets the Listed price as a double
		double listedPrice = Input.nextInt();
		
		System.out.print("Enter ammount Paid : $"); // This gets The paid price then makes it a double
		double amountPaid = Input.nextInt();

		double discountAmount = listedPrice - amountPaid; //This "block" gets the rest of the variables and does the calculations
		if (discountAmount < 0) {discountAmount = 0;}
		double discountPercent = (discountAmount / listedPrice) * 100;
		
		String discountString;
		if (discountPercent == 0) {discountString = "Terrible" ;}
		else if (discountPercent <= 10) {discountString = "Ok" ;}
		else if (discountPercent <= 20) {discountString = "Good" ;}
		else if (discountPercent <= 30) {discountString = "Very Good" ;} // This "block" uses the percent discount to find what to call the discount
		else if (discountPercent <= 40) {discountString = "Excellent" ;}
		else if (discountPercent <= 50) {discountString = "Sweet" ;}
		else {discountString = "Super Sweet";}
		
		System.out.println("You payed $" + amountPaid + " for an item that cost $" + listedPrice + " That is " + discountPercent + "% off"); //This displays the rest of the output
		System.out.print("You made a " + discountString + " Deal");
		Input.close();
	}

}
