
import java.util.InputMismatchException;

import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {

		String Input;
		Scanner input = new Scanner(System.in);

		boolean Exit = false;

		Numbers value = null;
		while (Exit == false) {

			System.out.println("1 ... create array of new size\n"
					+ "2 ... generate random numbers and store it in the array\n"
					+ "3 ... Search and display number of occurrences\n" + "4 ... Display array\n" + "5 ... quit\n");

			Input = input.next();

			switch (Input) {

			case "1":
				int s =-1;
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
				int search=0;
				do{
					
					
				//to search the number and exceptions if there is any non positive or any characters  &&& some more Exceptions Suggestions
				try {
					System.out.println("Please enter a number to be searched: ");
				search = input.nextInt();
				if (search <= 0) {
					System.out.println("Enter Positive numbers only");
				}

			}	catch (InputMismatchException ex) {
				System.out.println("No Character only Positive numbers \n");
				input.next();
			}
		} 
				// counting the no.of occurrences
				while (search < 0);
			int count = 0;
		try {
		count = value.count(search);
		} 
		catch (NullPointerException ex) {
			System.out.println("Array is not created");
		}
		if (count >= 0) {
			System.out.println("number of occurrences 0f " + search + " in the array is " + count);
	}
			
		
		
		break;

			
			
			case "4":
				try {
					System.out.println(value.toString());
				} catch (NullPointerException np) {
					System.out.println("Array not created yet");
				}
				break;

			
			
			case "5":

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
