public class BEER {
	public static void main(String[] args) {
		String part1 = " bottles of beer on the wall ";
		String part2 = " bottles of beer\n";
		String part3 = "Take one down pass it around ";
		for (int ii = 99; ii > 0;){
			System.out.println(ii + part1 + ii + part2 + part3 + (ii -1) + part1 +"\n");
			ii--;
			if (ii == 0){System.out.print("No more bottles of beer on the wall");}
		}
	}
}