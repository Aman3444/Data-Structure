package labprac;

import java.util.*;

public class numbers {
	Random generator = new Random();
	int setnum;
	int numbers [];
	public numbers(){

	}
	public numbers(int setnum){
		numbers = new int [setnum];
	}

	public void  generateNumbers(){
		for(int i=0; i<numbers.length; i++)
			numbers[i] = generator.nextInt(50)+1;
	}
	public int count(int count){
		int counter = 0;
		for( int i=0; i<numbers.length; i++){
			if (numbers[i] == count)
				counter++;	
		}
		if (counter == -1){
			counter = 0;
		}
		return counter;

	}
	public void sort(){
		Arrays.sort(numbers);
		System.out.println("Array in sorted order");

		toString();

	}
	public String toString(){
		StringBuilder s = new StringBuilder();

		for ( int i=0; i<numbers.length; i++){
			System.out.printf("%d ", numbers[i]);
		}
		System.out.println("");

		return s.toString();
	}
	public int binarySearch(int target){

		int low = 0;
		int high = numbers.length-1;
		int mid = (low + high) / 2;
		int locate = -1;
		
		while (low <= high && locate == -1){

			if (target == numbers[mid]){
				locate = mid;
			}
			else if (numbers[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			mid = (low + high +1)/2;
		}
		return locate;
	}	        


	public int rebinvariables(int target){
		int start=0;
		int end= numbers.length -1;
		return rebinarySearch(start, end, target);
	}

	private int rebinarySearch(int start, int end, int target){

		   int middle = (start + end) / 2;
		    if(end < start) {
		        return -1;
		    } 
		    if(target==numbers[middle]) {
		        return middle;
		    } else if(target<numbers[middle]) {
		        return rebinarySearch(start, middle - 1, target);
		    } else {
		        return rebinarySearch(middle + 1, end, target);
		    } 
		   
		}



}