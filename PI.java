
public class PI {
	public static void main(String[]args){

		final double numberOfTrials = 10000000;
		int numberOfHits = 0;
		double PI;
		double error;
		for(double i = 0; i < numberOfTrials; i++) {

			double x = Math.random() * 2.0 - 1;
			double y = Math.random() * 2.0 - 1;
			
			if ((x * x + y * y) <= 1.0){numberOfHits++;}
			PI = (4.0 * numberOfHits / numberOfTrials);
			error = (PI / Math.PI * 100);
			System.out.println("PI is " + PI + " you are at " + error + "% of PI and you are " + ((i + 1)/numberOfTrials) * 100 + "% done");
			
		}

	}}
