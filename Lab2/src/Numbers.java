
import java.util.Random;
import java.util.Scanner;

public class Numbers {
	int arraySize; //
	int[] array; // array
	Random r = new Random(); // random generator

	Scanner input = new Scanner(System.in);

	int Input; // variable
	public Numbers(){
		arraySize = 0;
		array = new int[arraySize];
	}
	public Numbers(int arraySize) {
		this.arraySize = arraySize;
		array = new int[this.arraySize];
	}

	public void generateNumbers() { // generating the random array

		Random r = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(50);
		}

	}

	public int count(int Num ) { // saerch and display the repetead no.
		int i;
		int countr = 0;

		//System.out.println("Please enter a number to be searched: \n");
	//	Num = input.nextInt();

		if (array == null) {
			return -1;
		}for (i = 0; i < array.length; i++) {
			if (Num == array[i])
				countr++;
		}
		//.out.println("number of occurrences 0f " + Num + " in the array is " + countr);
		return countr;
	}

	public String toString() { // display the array
		StringBuilder X = new StringBuilder();
		
		
		
		if(arraySize==0){
		System.out.println("Array is not created . So please create an array First ! ");
		}else{			
		
		for (int i = 0; i < array.length; i++) {
			X.append(array[i] + " ");
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}	
		return X.toString();

}
	
}

