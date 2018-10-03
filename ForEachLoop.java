
public class ForEachLoop {

	public static void main(String[] args) {

		final int size = 2000;
		int [] intNumbs = new int[size];
		double [] doubleNumbs = new double [size];

		int [] newNumbs = new int[size];

		makeArray(intNumbs);
		displayArray(intNumbs);
		makeArray(doubleNumbs);
		displayArray(doubleNumbs);
	}


	public static void makeArray (double [] numbers){

		for(int ii = 0; ii < numbers.length; ii++){
			numbers[ii] = (Math.random() * 1000);
		}
	}


	public static void makeArray (int [] numbers){

		for(int ii = 0; ii < numbers.length; ii++){//useful for placing info, reading or whatever.
			numbers[ii] = (int) (Math.random() * 1000);
		}
	}


	public static void displayArray(int [] numbers){
		final int perLine = 10;
		int line =  0;
		for(int arrayItem: numbers){//Usefull for only getting data out
			if((line % perLine) == 0){
				System.out.println();
			}
			System.out.printf("%5d   ", arrayItem);
			line++;

		}

	}
	
	
	public static void displayArray(double [] numbers){
		final int perLine = 10;
		int line =  0;
		for(double arrayItem: numbers){//Usefull for only getting data out
			if((line % perLine) == 0){
				System.out.println();
			}
			System.out.printf("%5.2f  ", arrayItem);
			line++;

		}

	}
}
