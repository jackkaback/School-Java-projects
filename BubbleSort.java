
public class BubbleSort {

	public static void main(String[] args) {

		final int size = 100;
		int [] intNumbs = new int[size];

		makeArray(intNumbs);
		//	displayArray(intNumbs);

		sort(intNumbs);
		//displayArray(intNumbs);
		System.out.print(binarySearch(intNumbs, 42));
	}



	public static void makeArray (int [] numbers){

		for(int ii = 0; ii < numbers.length; ii++){//useful for placing info, reading or whatever.
			numbers[ii] = (int) (Math.random() * 100);
		}
	}


	public static void displayArray(int [] numbers){
		final int perLine = 20;
		int line =  0;
		for(int arrayItem: numbers){//Usefull for only getting data out
			if((line % perLine) == 0){
				System.out.println();
			}
			System.out.printf("%5d ", arrayItem);
			line++;

		}

	}

	public static int linearSearch(int [] list, int key){
		for (int ii = 0; ii < list.length; ii++){
			if (key == list[ii]){
				return ii;
			}
		}
		return -117;
	}

	public static void sort(int [] array){
		int temp;

		if(array.length < 2){
			return;
		}

		for (int ii = array.length - 1; ii >= 1; ii--){
			int switches = 0;
			for  (int jj = 0; jj < ii; jj++){
				if (array[jj] > array[jj + 1]){
					temp = array[jj];
					array[jj] = array[jj + 1];
					array[jj + 1] = temp;
					switches++;
				}
			}
			if (switches == 0){
				break;}
		}

	}

	public static int binarySearch (int [] list, int key){
		int low = 0;
		int high = list.length - 1;
		while (high >= low){
			int mid = (low +high) / 2;
			if (key < list [mid]) {
				high = mid -1;
			}
			
			else if (key > list [mid]){
				low = mid + 1;
			}
			else if (key == list [mid]){
				return mid;
			}
		}
		return - low - 1;
	}
}
