/*import java.util.Scanner;

//HelloWorld Program
//Send .Java File for homework NOT .Class
public class Hello{


	public static void main(String[] args) {
			System.out.println("Hello World!");
			System.out.println("Welcome to JAVA");
			System.out.println("We hope you like it");
			System.out.println(2 + 2);
			System.out.println("Sum of Fibonacci numbers = "+ (1+1+2+3+5+8+13+21+34+55+89));
			System.out.println("The area of a square of side length 117 is = " + (117 * 117)); //Add the + to add more information in the line
			System.out.println("The volume of a cube of side length 117 is = " + (117 * 117 * 117));
			
			//Week Two Notes
			final double PI = 3.14159265358; //Final makes this unchangible later
			double r;
			r = 10;
			System.out.println();
			System.out.println(PI * r * r);
			r = 20;
			System.out.println(PI * r * r);
			System.out.println(.1+.1);
			System.out.println(.1+(.1*2.0)); //This adds a bit of error in multiplying
			Scanner input = new Scanner(System.in); //This adds the scanner named "input"
			System.out.print("Enter the radius:  ");
			r = input.nextDouble(); //This is the input of data
			System.out.println(r * r * Math.PI);
			System.out.println(Math.PI * Math.pow(r ,2)); //Math.pow(x,y) is x^y
			
			
			//Week three notes
			final double SL = 299792458; //2.99792458E8 or E+8 are fine too
			float SpL = 2.99792458E8F; // this won't be as accurate as a double
			double Q = 25L; //The "L" makes it as a long
			double Ly;
			Ly = (SL * 3600 * 24 *365);
			System.out.println(Ly);
			System.out.println();
			System.out.println();
			System.out.println("Sales Tax");
			System.out.print("Enter purchace amount ");
			double P = input.nextDouble();
			System.out.print("Enter sales tax percentage ");
			double st =input.nextDouble();
			double ST = ((st / 100.0));
			double Tax = P * ST;
			System.out.println("Tax = " + Tax);
			double Total = Tax + P;
			System.out.println("Total cost = " + Total);
			int i,j,k;
			i = j = k = 1;
			System.out.println("i = " + i + "   j = " + j + "   k = " + k);
			i += i++;
			j = j++;
			k = k++ + k++;
			System.out.println("i = " + i + "   j = " + j + "   k = " + k);
			System.out.println();
			System.out.println();

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
			System.out.println(MP);
			System.out.printf("100 %.2f\n"); //Printf with a number the %.#f makes the number use # decimal places
	}

}*/
import javax.swing.JFrame;  //Importing class JFrame
import javax.swing.JLabel;  //Importing class JLabel
public class Hello{
	public static void main(String[] args) {
		JFrame frame = new JFrame();           //Creating frame
		frame.setTitle("Hi!");                 //Setting title frame
		frame.add(new JLabel("Hello, world!"));//Adding text to frame
		frame.pack();                          //Setting size to smallest
		frame.setLocationRelativeTo(null);     //Centering frame
		frame.setVisible(true);                //Showing frame
	}
}
