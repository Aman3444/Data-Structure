import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * class for a directory
 */
public class Directory {
	private ArrayList<EmailList> list; // list of email lists
	
	/*
	 * default
	 */
	public Directory() {
		this.list = new ArrayList<>();
	}
	
	/**
	 * @param emailList = email list to add in this directory
	 * it finds a position for the list and then adds it such that the new list of lists is sorted
	 */
	public void addEmailList(EmailList emailList) {
		int i=0;
		while(i < this.list.size() && emailList.compareTo(this.list.get(i)) > 0) {
			i++;
		}
		list.add(i, emailList);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * convert this directory object to string representation (given in the document)
	 */
	public String toString() {
		String out = "";
		for (EmailList e : this.list) {
			out += e + "\n";
		}
		return out;
	}

	/**
	 * @param in = Scanner object from which input can be read
	 * reads input from in and creates a new email list in this directory
	 */
	public void createNewEmailList(Scanner in) {
		System.out.print("\nEnter the name of the list: ");
		EmailList list = new EmailList(in.next());
		EmailAddress address = null;
		int option = 'y';
		while (true) {
			address = new EmailAddress();
			address.readAdress(in, "k");
			list.addAddress(address);
	
			System.out.print("Another? y/n: "); 
			option = in.next().toLowerCase().charAt(0);
			while (option != 'n' && option != 'y') {
				System.out.print("\nInvalid option! Please try again. Another? y/n: "); 
				option = in.next().toLowerCase().charAt(0);
			}
			
			if (option == 'n') {
				break;
			}		
		}
		this.addEmailList(list);		
	}
	
	/**
	 * @param listName = name of email list to search in this directory
	 * @return position of the email list with given name using binary search (since lists are sorted)
	 */
	public int searchList(String listName) {
		return Collections.binarySearch(this.list, new EmailList(listName));
	}

	/**
	 * @param index = index of email list in which new address it to be added
	 */
	public void addNewAddress(int index, Scanner sc) {
		EmailAddress address = new EmailAddress();
		address.readAdress(sc, "k");
		this.list.get(index).addAddress(address);
	}

	/**
	 * @param index = index of email list from which an address has to be deleted
	 */
	public void deleteAddress(int index, Scanner sc) {
		this.list.get(index).showNumberedList();
		if (this.list.get(index).getNumAddr() == 0) {
			System.out.print("\nList entered is empty!");
			return;
		}
		System.out.println("Enter entry number to delete: ");
		int i;
		while(true) {
			i = sc.nextInt();
			if (i >= this.list.get(index).getNumAddr() || i < 0) {
				System.out.println("Entry number not valid! Please try again: ");
			} else {
				break;
			}
		}
		
		this.list.get(index).deleteAddress(i);
	}

	/**
	 * @param index = index of email list which we want to print
	 */
	public void printList(int index) {
		System.out.println(this.list.get(index));
	}

	/**
	 * @param in = Scanner object from which input can be read to loadLists into this directory
	 */
	public void loadLists(Scanner in) {
		int nLists;
		nLists = in.nextInt();
		
		for (int i=0; i!=nLists; i++) {
			EmailList emailList = new EmailList(in.next());
			int nAddr = in.nextInt();
			for (int j=0; j!=nAddr; j++) {
				EmailAddress addr = new EmailAddress(in.next());
				emailList.addAddress(addr);
			}
			this.addEmailList(emailList);
		}
	}

	/**
	 * @return number of email lists in this directory
	 */
	public int getNumLists() {
		return this.list.size();
	}
}
