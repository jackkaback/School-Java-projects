import java.util.Scanner;
public class PhysicsTimeAndSpeed {
	public static void main(String[] args) {
		double h;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Height:  ");
		h = input.nextDouble();
		double g;
		System.out.print("Enter the Gravity:  ");
		g = input.nextDouble();
		System.out.println(Math.pow((2*h/g),.5));
		double t = Math.pow(2*h/g, .5);
		System.out.println("The velocity of the object after fall of " + h + " is " + (g*t));
}}
