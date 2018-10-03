/* 
 * Class: Assign02 
 * Version: 1.0.0 
 * Programmer: Jack Kaback
 * Date: 01/23/2014
 * Description: Calculate Body Mass Index (BMI) 
 * 
 * Revisions: 01/23/2014 by Jack Kaback 1-23-14
*/ 
import java.util.Scanner;
public class Assign2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Calculate Body Mass Index (BMI)");
		System.out.println();
		double m1;
		System.out.print("Enter weight in pounds  ");
		m1 = input.nextDouble();
		
		if (m1 < 50) {m1 = 50; //This is an alteration from class
			System.out.println("Minimum is 50, using 50");}
		double h1;
		System.out.print("Enter height in inches  ");
		h1 = input.nextDouble();
		double h2; double m2;
		h2 =  (h1 * .0254); m2 = (m1 * 0.45359237 );
		double BMI;
		BMI = (m2/Math.pow(h2, 2));
		System.out.println("BMI is  " + BMI);
		System.out.println();
		/*System.out.println("Enter height in inches and weight in pounds"); //This was shown in class as an alt way to do this
		h1 = input.nextDouble();
		m1 = input.nextDouble();
		h2 =  (h1 * .0254); m2 = (m1 * 0.45359237 );
		BMI = (m2/Math.pow(h2, 2));
		System.out.println("BMI is  " + BMI);*/
		String desc;
		if(BMI < 18.5){ desc = "underweight";} 
		else { if (BMI <24.9) {desc = "Normal";}
		else {if (BMI< 29.9) {desc = "overweight";}
		else {desc = "A fatass";}}}
		/*String desc;
		if (BMI<18.5){desc = "underweight";}
		if (BMI >= 18.5 && BMI < 24.9){desc = "normal";}*/ // use || for an or statement, && for an and statement, ^ for an xor statement
		System.out.println("You are " + desc);
		
		input.close();  //This was added during class, this stops input
		
}

}
