
public class TestContinue {
	public static void main(String[]args){

		int number = 0;
		int sum = 0;
		int random = 0;
		while(random != 18){
			number++;
			random = (int) (Math.random() * 5000);
			//if(number == 10 || number == 11 || number == 16){continue;}
			//if(number == 10 || number == 11 || number == 16){break;}
			sum += number;
		}
		System.out.println("the number is " + number);
		System.out.println("The sum is " + sum);
}}
