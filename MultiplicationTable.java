
public class MultiplicationTable {

	public static void main(String[] args) {
		
		final int maxFactor = 32;
		System.out.println("          Multiplication");
		System.out.print("       ");
		
		for (int i = 1; i <= maxFactor; i++){
			System.out.printf("%5d", i);
		}
		System.out.println("\n      -------------------------------------------------");
		for (int i = 1; i <= maxFactor; i++){
			System.out.printf("%5d |" , i);
			for(int j = 1; j<=maxFactor; j++){
				System.out.printf("%5d", i * j);
			}
			System.out.println();}
	}

}
