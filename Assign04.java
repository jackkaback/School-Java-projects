/* 
 * Class: Assign04 
 * Version: 1.0.0 
 * Programmer: Jack Kaback
 * Date: 02/11/2014
 * Description: Calculate Payroll Updated
 * 
 * Revisions: 02/11/2014 by Jack Kaback 2-11-14
*/ 
import javax.swing.JOptionPane;
public class Assign04 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "Enter Employee's name" , "Assignment 04 input" , JOptionPane.QUESTION_MESSAGE); //This gets the Employee's name and makes it a string
		
		String hoursWorked = JOptionPane.showInputDialog(null, "Enter Hours Worked" , "Assignment 04 input" , JOptionPane.QUESTION_MESSAGE); // This gets the Hours as a string then converts it to a double
		double hours = Double.parseDouble(hoursWorked);
		
		String payRate = JOptionPane.showInputDialog(null, "Enter Pay Rate Worked" , "Assignment 04 input" , JOptionPane.QUESTION_MESSAGE); //This gets the pay rate then makes it a double
		double rateOfPay = Double.parseDouble(payRate);
	
		String fedTaxWithholding = JOptionPane.showInputDialog(null, "Enter the federal tax withholding rate" , "Assignment 04 input" , JOptionPane.QUESTION_MESSAGE); //This gets the federal tax rate then makes it a double
		double fedTaxRate = Double.parseDouble(fedTaxWithholding);
		
		String stateTaxWithholding = JOptionPane.showInputDialog(null, "Enter the state tax withholding rate" , "Assignment 04 input" , JOptionPane.QUESTION_MESSAGE); //This gets the State tax rate then converts it to a double
		double stateTaxRate = Double.parseDouble(stateTaxWithholding);
		
		double grossPay = hours * rateOfPay; //This section is for adding the remaining variables and calculations
		double fedTax = grossPay * fedTaxRate;
		double stateTax = grossPay * stateTaxRate;
		double totalTax = (stateTax + fedTax);
		double netPay = grossPay - totalTax;
		
		JOptionPane.showMessageDialog(null, "Employee name :" + name + 
				"\n\n	Hours worked :" + hours + 
				"\n	Pay rate : $" + rateOfPay + 
				"\n	Gross Pay : $" + grossPay +
				"\n	Dedutions" +
				"\n		State Withholding (" + (stateTaxRate * 100)+"%): $" + stateTax +
				"\n		Federal Withholding (" + (fedTaxRate * 100)+"%): $" + fedTax +
				"\n		Total Deductions :$" + totalTax +
				"\n Net Pay :$" + netPay
				,"Assignment04 output", JOptionPane.INFORMATION_MESSAGE); //This displays the output information that has been cut up for easy reading
		
		
	}
}