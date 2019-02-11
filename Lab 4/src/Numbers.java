
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Numbers {
	int arraySize; //
	int[] array; // array
	Random r = new Random(); // random generator

	Scanner input = new Scanner(System.in);

	int Input; // variable

	public Numbers() {
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

	public int count(int Num) { // saerch and display the repetead no.
		int i;
		int countr = 0;

		// System.out.println("Please enter a number to be searched: \n");
		// Num = input.nextInt();

		if (array == null) {
			return -1;
		}
		for (i = 0; i < array.length; i++) {
			if (Num == array[i])
				countr++;
		}
		// .out.println("number of occurrences 0f " + Num + " in the array is "
		// + countr);
		return countr;
	}

	public void sort() {
		Arrays.sort(array);
		System.out.println("Array in sorted order");

		toString();

	}

	public String toString() { // display the array
		StringBuilder X = new StringBuilder();

		if (arraySize == 0) {
			System.out.println(" Array is not created . So please create an array First ! ");
		} else {

			for (int i = 0; i < array.length; i++) {
				X.append(array[i] + " ");
				// System.out.print(array[i] + " ");
			}
			System.out.println();

		}
		return X.toString();

	}

	public int binarySearch(int target) {

		int low = 0;
		int high = array.length - 1;
		int mid = (low + high) / 2;
		int locate = -1;

		while (low <= high && locate == -1) {

			if (target == array[mid]) {
				locate = mid;
			} else if (array[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			mid = (low + high + 1) / 2;
		}
		return locate;
	}

	public int rebinvariables(int target) {
		int start = 0;
		int end = array.length - 1;
		return rebinarySearch(start, end, target);
	}

	private int rebinarySearch(int start, int end, int target) {

		int middle = (start + end) / 2;
		if (end < start) {
			return -1;
		}
		if (target == array[middle]) {
			return middle;
		} else if (target < array[middle]) {
			return rebinarySearch(start, middle - 1, target);
		} else {
			return rebinarySearch(middle + 1, end, target);
		}

	}
	public void recQuickSort() {
		if (arraySize != 0) {
			this.quickSort( 0, array.length - 1);
			
		}
	}

	public void quickSort(int start, int end) {
		int index = partition(start, end);

		if (start < index - 1) {
			quickSort(start, index - 1);
		}

		if (end > index) {
			quickSort(index, end);
		}
	}

	public int partition(int left, int right) {
		int pivot = array[left]; // taking first element as pivot
		while (left <= right) {
			// searching number which is greater than pivot, bottom up
			while (array[left] < pivot) {
				left++;
			}
			// searching number which is less than pivot, top down
			while (array[right] > pivot) {
				right--;
			}

			// swap the values
			if (left <= right) {
				int x = array[left];
				array[left] = array[right];
				array[right] = x;
				left++;
				right--;
			}
		}
		return left;
	}

	/*public void arraySort() {
		Arrays.sort(array);
	}
*/
	public int arrayLength() {
		return array.length;
	}


}
