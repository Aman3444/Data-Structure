import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	private static Scanner in = new Scanner(System.in); // scanner for stdin
	private static Directory directory = new Directory(); // directory object
	
	public static void main(String[] args) {
		int choice;
		while((choice = getChoice()) != 'q') {
			switch (choice) {
			case 'c':
				directory.createNewEmailList(in); // new email list
				break;
			case 'p':
				displayDirectory(); // print the directoroy
				break;
			case 'a':
				addNewEntryToList(); // new address in list
				break;
			case 'd':
				deleteEntryFromList(); // delete address from a list
				break;
			case 'l':
				displayList(); // print an email list
				break;
			case 'f':
				loadListFromFile(); // load lists from a file
				break;
			default:
				System.out.println("Invalid oution! Please try again.\n"); // if no choice from is entered
				break;
			}
		}
	}

	/**
	 * display directory
	 */
	private static void displayDirectory() {
		if (directory.getNumLists() == 0) {
			System.out.print("\nNo list in the directory!");
			return;
		}
		
		System.out.println(directory);
	}

	/*
	 * load lists from a file into the directory
	 */
	private static void loadListFromFile() {
		System.out.print("\nEnter name of the file to process: ");
		Scanner inFile;
		while(true) {
			try {
				inFile = new Scanner(new FileInputStream(in.next()));
				break;
			} catch (FileNotFoundException e) {
				System.out.print("\nFile not found! Please try again: ");
			}
		}
		
		directory.loadLists(inFile);
	}

	/*
	 * display a list with input name
	 */
	private static void displayList() {
		if (directory.getNumLists() == 0) {
			System.out.print("\nNo list in the directory!");
			return;
		}
		System.out.print("\nEnter name of the list to display: ");
		int index = directory.searchList(in.next());
		while (index < 0) {
			System.out.print("\nList not found! Please try again: ");
			index = directory.searchList(in.next());
		}
		
		directory.printList(index);
	}

	/**
	 * delect an address from an input list in directory
	 */
	private static void deleteEntryFromList() {
		if (directory.getNumLists() == 0) {
			System.out.print("\nNo list in the directory!");
			return;
		}
		System.out.print("\nEnter name of the list to delete from: ");
		int index = directory.searchList(in.next());
		while (index < 0) {
			System.out.print("\nList not found! Please try again: ");
			index = directory.searchList(in.next());
		}
		
		directory.deleteAddress(index, in);
	}

	/*
	 * add a new email address in the input directory
	 */
	private static void addNewEntryToList() {
		if (directory.getNumLists() == 0) {
			System.out.print("\nNo list in the directory!");
			return;
		}
		System.out.print("\nEnter name of the list to add to: ");
		int index = directory.searchList(in.next());
		while (index < 0) {
			System.out.print("\nList not found! Please try again: ");
			index = directory.searchList(in.next());
		}
		
		directory.addNewAddress(index, in);
	}

	/**
	 * @return the input choice of the user
	 */
	private static int getChoice() {
		System.out.print("\nEnter c to create a new list\n"
				 + "      p to display all the email lists\n"
				 + "      a to add an entry to a list\n"
				 + "      d to delete an entry from a list\n"
				 + "      l to display a list\n"
				 + "      f to load lists from a file\n"
				 + "      q to quit\n"
				 + "Your Choice: ");
		return in.next().toLowerCase().charAt(0);
	}
}
