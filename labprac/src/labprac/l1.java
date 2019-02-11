package labprac;
import java.util.InputMismatchException;
import java.util.Scanner;

public class l1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int size = 0;
		numbers num = new numbers(size);

		System.out.println("1 ... Create array with new size");
		System.out.println("2 ... Generate random numbers and store it in the array ");
		System.out.println("3 ... Search and display number of occurrences ");
		System.out.println("4 ... Binary search to find whether specific number exists  ");
		System.out.println("5 ... Recursive binary search to find whether specific number exists ");
		System.out.println("6 ... Display array ");
		System.out.println("7 ... Quit");
		try {
			int n = scanner.nextInt();


			while (n != 7){

				if (n == 1){

					System.out.println("Enter required size: ");
					size = scanner.nextInt();
					num = new numbers(size);		 
				}
				else if (n == 2){
					num.generateNumbers();
				}
				else if (n == 3){
					if (size == 0){
						System.out.print("Please create and array with more the zero elements");
					}
					else{
						System.out.println("Enter the number to be searched: ");
						int searchnum = scanner.nextInt();
						int repeat = num.count(searchnum);
						System.out.printf("Number of occurrences of %d in the array is %d\n ", searchnum, repeat);
					}
				}
				else if(n == 4){
					if (size == 0){
						System.out.print("Please create and array with more the zero elements");
					}
					else{
						num.sort();

						System.out.println("Enter the number to be searched: ");
						int bsearch = scanner.nextInt();
						int locate = num.binarySearch(bsearch);

						if(locate== -1){
							System.out.print("The number doesnt exist in the array");
						}
						else
							System.out.printf("%d is in the list of numbers at the index %d", bsearch, locate);

					}
				}
				else if(n == 5){
					if (size == 0){
						System.out.print("Please create and array with more the zero elements");
					}
					else{
						num.sort();
						System.out.println("Enter the number to be searched: ");
						int research = scanner.nextInt();

						int locate = num.rebinvariables(research);
						if(locate== -1){
							System.out.print("The number doesnt exist in the array");
						}
						else

							System.out.printf("%d is in the list of numbers at the index %d", research, locate);


					}
				}
				else if(n == 6){
					if (size == 0){
						System.out.print("Please create and array with more the zero elements");
					}
					else{
						System.out.println(num.toString());
					}
				}
				else {
					System.out.print("Invalid choice.... try again\n");
				}

				System.out.println("\n1 ... Create array with new size");
				System.out.println("2 ... Generate random numbers and store it in the array ");
				System.out.println("3 ... Search and display number of occurrences ");
				System.out.println("4 ... Binary search to find whether specific number exists  ");
				System.out.println("5 ... Recursive binary search to find whether specific number exists ");
				System.out.println("6 ... Display array ");
				System.out.println("7 ... Quit");
				n = scanner.nextInt();
			
				}
		}
		catch (InputMismatchException e){
			System.out.print("Invalid choice ");
		}

		System.out.print("Bye.... See you again");		
	}

}