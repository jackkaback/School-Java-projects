/* 
 * Class: Assign03 
 * Version: 1.0.0 
 * Programmer: Jack Kaback
 * Date: 02/05/2014
 * Description: Calculate Payroll
 * 
 * Revisions: 01/23/2014 by Jack Kaback 2-05-14
*/ 
import java.util.Scanner;
public class Assign3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: "); //These 2 lines will get the employee's name entered into the program
		String name = input.next();
		
		double HoursWorked;
		System.out.print("Enter hours worked in a week: "); //These ask for the hours worked then make it into a double
		HoursWorked = input.nextDouble();
		
		double HourlyPayRate;
		System.out.print("Enter hourly pay rate: "); //This gets their wage and enters it as a double
		HourlyPayRate = input.nextDouble();
		
		double FederalTaxWithholdingRate;
		System.out.print("Enter federal tax withholding rate (3% = .03): "); //This gets the federal tax rate
		FederalTaxWithholdingRate = input.nextDouble();
		
		double StateTaxWithholdingRate;
		System.out.print("Enter state tax withholding rate (3% = .03): "); //This gets the state tax rate
		StateTaxWithholdingRate = input.nextDouble();

		System.out.println("Employee name: " + name);
		System.out.println("Hours worked: " + HoursWorked);
		System.out.printf("Pay rate: $%.2f\n" , HourlyPayRate);
		
		double GrossPay;
		System.out.printf("Gross pay $%.2f\n" , (GrossPay = HourlyPayRate * HoursWorked)); //This prints out the total pay, also I used the printf with %.2f to do the 2 decimal places
		
		System.out.println("Deductions");
		double FederalWithholding;
		System.out.printf("    Federal Tax cut $%.2f\n " , (FederalWithholding = FederalTaxWithholdingRate * GrossPay)); //This calculates the federal withholding
		
		double StateWithholding;
		System.out.printf("   State tax cut $%.2f\n" , (StateWithholding = GrossPay * StateTaxWithholdingRate));
		
		double TotalTax;
		System.out.printf("    Total tax $%.2f\n" , (TotalTax = StateWithholding + FederalWithholding)); //This shows the total deductions

		double NetPay;
		System.out.printf("Net Pay: $%.2f\n" , (NetPay = GrossPay - TotalTax)); //This displays the net pay after taxes
	}}
