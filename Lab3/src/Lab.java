
import java.util.InputMismatchException;

import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {

		String Input;
		Scanner input = new Scanner(System.in);
		int s = 0;

		boolean Exit = false;
		Numbers value = new Numbers();
		while (Exit == false) {

			System.out.println(
					"1 ... create array of new size\n" + "2 ... Generate random numbers and store it in the array\n"
							+ "3 ... Search and display number of occurrences\n"
							+ "4 ... Binary search to find whether specific number exists\n"
							+ "5 ... Recursive binary search to find whether specific number exists\n"
							+ "6 ... Display array\n" + "7 ... quit\n");

			Input = input.next();

			switch (Input) {

			case "1":
				s = -1;
				do {

					try {
						System.out.println("Enter required size: ");
						s = input.nextInt();
						if (s <= 0) {
							System.out.println("Positive numbers only!\n");
						}
					} catch (InputMismatchException ex) {
						System.out.println("No Character only Positive numbers \n");
						input.next();
					}
				} while (s <= 0);

				value = new Numbers(s);

				System.out.println("Array is generated \n");

				break;

			case "2":
				try {
					value.generateNumbers();
					System.out.print("Array is stored \n");
				} catch (NullPointerException np) {
					System.out.println("Array is not created yet ! ");
				}

				break;

			case "3":
				int search = 0;
				do {

					// to search the number and exceptions if there is any non
					// positive or any characters &&& some more Exceptions
					// Suggestions
					try {
						System.out.println("Please enter a number to be searched: ");
						search = input.nextInt();
						if (search <= 0) {
							System.out.println("Enter Positive numbers only");
						}

					} catch (InputMismatchException ex) {
						System.out.println("No Character only Positive numbers \n");
						input.next();
					}
				}
				// counting the no.of occurrences
				while (search < 0);
				int count = 0;
				try {
					count = value.count(search);
				} catch (NullPointerException ex) {
					System.out.println("Array is not created");
				}
				if (count >= 0) {
					System.out.println("number of occurrences 0f " + search + " in the array is " + count);
				}

				break;

			case "4":
				if (s == 0) {
					System.out.print("Please create and array with more than the zero elements. ");
				} else {
					value.sort();

					System.out.println("Enter the number to be searched: ");
					int bsearch = input.nextInt();
					int locate = value.binarySearch(bsearch);

					if (locate == -1) {
						System.out.print("The number doesnt exist in the array");
					} else
						System.out.printf(bsearch + " is in the list of numbers at the index " + locate);

				}

				break;

			case "5":
				if (s == 0) {
					System.out.print("Please create and array with more than the zero elements. ");
				} else {
					value.sort();
					System.out.println("Enter the number to be searched: ");
					int research = input.nextInt();

					int locate = value.rebinvariables(research);
					if (locate == -1) {
						System.out.print("The number doesnt exist in the array ");
					} else

						System.out.printf(research + " is in the list of numbers at the index " + locate);

				}

			case "6":
				try {
					System.out.println(value.toString());
				} catch (NullPointerException np) {
					System.out.println("Array not created yet");
				}
				break;

			case "7":

				Exit = true;
				break;

			default:

				System.out.println("Invalid Choice...Please Try Again");

				break;

			}

			System.out.println();
		}
		input.close();
		System.out.println("Bye.... See you again");
	}

}
