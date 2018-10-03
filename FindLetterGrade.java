import java.util.Scanner;


public class FindLetterGrade {
	public static void main(String[] args){
		int totalPoints;
		int pointsEarned;
		int percentGradeInt;
		
		double percentGrade;
		String letterGrade;
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Find letter grade \n\n");
		System.out.print("Total point possible");
		totalPoints = Input.nextInt();
		
		System.out.print("Total point earned");
		pointsEarned = Input.nextInt();
		
		if (totalPoints > 0) {percentGrade = (pointsEarned / totalPoints * 100); System.out.println(percentGrade);}
		else {System.out.print("Your score is INFINITY");}
		Input.close();
}}
