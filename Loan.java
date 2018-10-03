import java.util.Scanner;
public class Loan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Compute Loan");
		double LA, I, Years, MP, MI;
		System.out.print("Enter client's name: ");
		String name = input.next();
		System.out.println();
		System.out.println("Enter Loan ammount, Annual Interest rate, and Number of years");
		LA = input.nextDouble();
		I = input.nextDouble();
		Years = input.nextDouble();
		MI = I /1200.0;
		MP = ((LA * MI) / ( 1- 1/Math.pow(1 + MI, Years * 12)) );
		String myOutput = "\n\n";
		System.out.println(MP);
		myOutput += "The amount of the payment for " + name + " is $";
		myOutput += (int) (MP *100) / 100.0;
}
}
