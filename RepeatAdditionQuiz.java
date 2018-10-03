import java.util.Scanner;
public class RepeatAdditionQuiz {

	public static void main(String[] args) {

		int number1, number2;
		int answer;
		
		Scanner Input = new Scanner(System.in);
		number1 = (int) (Math.random() * 10);
		number2 = (int) (Math.random() * 10);
		
		System.out.printf("What is %d + %d? " , number1 , number2);
		answer = Input.nextInt();
		
		while(number1 + number2 != answer) 
		{System.out.printf("YOU ARE WRONG!!!!!!! What is %d + %d? " , number1 , number2);
		answer = Input.nextInt();}
		System.out.println("Took you long enough");
		
		Input.close();
	}

}
