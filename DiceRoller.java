import java.util.Scanner;
public class DiceRoller {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		boolean notDone = true;
		int die;
		int diceRolls;
		int diceRolling;
		int sidedDice;
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		int result5 = 0;
		int result6 = 0;
		int result7 = 0;
		int result8 = 0;
		int result9 = 0;
		int result10 = 0;
		int result11 = 0;
		int result12 = 0;
		int result13 = 0;
		int result14 = 0;
		int result15 = 0;
		int result16 = 0;
		int result17 = 0;
		int result18 = 0;
		int result19 = 0;
		int result20 = 0;
		int result21 = 0;
		int result22 = 0;
		int result23 = 0;
		int result24 = 0;
		int result25 = 0;
		int result26 = 0;
		int result27 = 0;
		int result28 = 0;


		while(notDone){
			
			result1 = result2 =result3 = result4 = result5 = result6 = result7 = result8 = result9 = result10 = 0;
			result11 = result12 = result13 = result14 = result15 = result16 = result17 = result18 = result19 = result20 = 0;
			result21 = result22 = result23 = result24 = result25 = result26 = result27 = result28 = 0;
			
			System.out.println("Number of rolls");
			diceRolls = input.nextInt();

			System.out.println("Number of sides on die");
			sidedDice = input.nextInt();

			for(diceRolling = 1; diceRolling <= diceRolls;){

				die = (int) ((Math.random() * sidedDice) + 1);
				if (die == 1){result1++;}
				else if (die == 2) {result2++;}
				else if (die == 3) {result3++;}
				else if (die == 4) {result4++;}
				else if (die == 5) {result5++;}
				else if (die == 6) {result6++;}
				else if (die == 7) {result7++;}
				else if (die == 8) {result8++;}
				else if (die == 9) {result9++;}
				else if (die == 10) {result10++;}
				else if (die == 11) {result11++;}
				else if (die == 12) {result12++;}
				else if (die == 13) {result13++;}
				else if (die == 14) {result14++;}
				else if (die == 15) {result15++;}
				else if (die == 16) {result16++;}
				else if (die == 17) {result17++;}
				else if (die == 18) {result18++;}
				else if (die == 19) {result19++;}
				else if (die == 20) {result20++;}
				else if (die == 21) {result21++;}
				else if (die == 22) {result22++;}
				else if (die == 23) {result23++;}
				else if (die == 24) {result24++;}
				else if (die == 25) {result25++;}
				else if (die == 26) {result26++;}
				else if (die == 27) {result27++;}
				else if (die == 28) {result28++;}

				diceRolling++;
			}
			System.out.println(result1 + "   " + result2 +  "   " +
					result3 + "   " + result4 + "\n" +
					result5 + "   " + result6 + "   " +
					result7 + "   " + result8 + "\n" +
					result9 + "   " + result10 + "   " +
					result11 + "   " + result12 + "\n" +
					result13 + "   " + result14 + "   " +
					result15 + "   " + result16 + "\n" +
					result17 + "   " + result18 + "   " +
					result19 + "   " + result20 + "\n" +
					result21 + "   " + result22 + "   " +
					result23 + "   " + result24 + "\n" +
					result25 + "   " + result26 + "   " +
					result27 + "   " + result28);
			
			
		}
	}
}
