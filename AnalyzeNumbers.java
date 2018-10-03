import java.util.Scanner;


public class AnalyzeNumbers {

	public static void main(String[] args) {

		final int NUMBER_OF_ELEMENTS = 10;
		double [] numbers = new double[NUMBER_OF_ELEMENTS]; //a number insted of the var would also work
		double sum = 0;
		
		Scanner input = new Scanner(System.in);

		for(int ii = 0; ii < NUMBER_OF_ELEMENTS; ii++){
			
			System.out.print("Enter a new number");
			numbers[ii] = input.nextDouble(); 
			sum += numbers[ii];
			}
		
		double average = sum / NUMBER_OF_ELEMENTS;
		int count = 0;
		
		for(int ii = 0; ii < NUMBER_OF_ELEMENTS; ii++){
			if(numbers[ii] > average){
				count++;
			}
		}
		
		System.out.println("\nAverage is " + average);
		System.out.println("Number above average is" + count);
		
		input.close();
	}

}