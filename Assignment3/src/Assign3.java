
/*******************************************************************************************************************
 * File Name: 	Assign3 Class
 * Purpose: 	This class contains a main method to run the dictionary application.
 * 
 * Method Main:	It provides interaction with the user in form of a console menu system with following options,
 * 				1,to clear dictionary, 2, to add text from keyboard, 3,to add text from a file, 4,to search for a word count,
 * 				5,to display number of nodes, 6,to quit.
 * 
 * 
 * @author Aman Multani
 * 
 * Professor Name: 					Anu Thomas
 *
 * Title: 							Assignment 3
 * 
 * Course: 							Data Structure 
 * Section:							CST8130
 ******************************************************************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class Assign3 {

	public static void main(String[] args) {
		Scanner input;
		Dictionary dictionary = new Dictionary();
		input = new Scanner(System.in);
		int userValue;
		boolean done = false;
		do {
			try {

				System.out.println(
						"Enter 1 to clear dictionary,\n2 to add text from keyboard,\n3 to add text from a file,\n4 to search for a word count,\n5 to display number of nodes,\n6 to quit.");
				System.out.println("Enter your choice: ");
				userValue = input.nextInt();
				switch (userValue) {

				case 1:
					dictionary.clear();
					break;

				case 2:
					input.nextLine();
					System.out.println("Enter to add text from keyboard:");
					String word = input.nextLine();
					word = dictionary.alphaCharacters(word);
					dictionary.processFile(word);
					System.out.println("The word is added to the dictionary\n");
					break;

				case 3:
					input.nextLine();
					Scanner input1 = new Scanner(System.in);
					System.out.println("Enter name of file to process:");
					try {
						File file = new File(input1.nextLine());
						input1 = new Scanner(file);
						while (input1.hasNext()) {
							String fileName = input1.next();
							fileName = dictionary.alphaCharacters(fileName);
							dictionary.processFile(fileName);
						}
						System.out.println("The words are added to the dictionary from text file.\n");

					} catch (FileNotFoundException ex) {
						System.out.println("Sorry File was not found!!! Try again.:\n");
					}
					break;

				case 4:
					input.nextLine();
					System.out.println("Enter word to search for: ");
					String searchText = input.nextLine();
					String newWord = dictionary.alphaCharacters(searchText);
					dictionary.search(newWord);
					break;

				case 5:
					dictionary.displayNumberOfNodes();
					break;

				case 6:
					System.out.println("Thank you for using My Dictionary!!!!");
					done = true;
					break;

				default:
					System.out.println("Your selection is out of options!!! Please try again:\n");

				}

			} catch (InputMismatchException ex) {

				System.out.println("Please enter the Integer value to select the option from the menu :\n");
				userValue = 7;
				input.nextLine();
			}
		} while (done == false);

	}
}
