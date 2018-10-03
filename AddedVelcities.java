import java.util.Scanner;
public class AddedVelcities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter velocity 1");
		double V1 = input.nextDouble();
		System.out.println("Enter velocity 2");
		double V2 = input.nextDouble();
		double V3 = V1 + V2;
		double Vc = V1 * V2;
		final double SL = 299792458;
		double V = Vc / Math.pow(SL,2);
		double Under = 1 - V;
		System.out.print(V3 / Math.pow(Under,.5));
				
	}
}
