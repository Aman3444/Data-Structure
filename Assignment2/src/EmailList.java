import java.util.Iterator;
import java.util.LinkedList;


/**
 * class for an email list
 * implements comparable so that we can compare two lists since we want to store them in a sorted manner
 */
public class EmailList implements Comparable<EmailList> {
	private String name; // name of the list
	private LinkedList<EmailAddress> list; // linked list for storing addresses
	
	/*
	 * default
	 */
	public EmailList() {
		this.name = "";
		this.list = new LinkedList<>();
	}
	
	/**
	 * @param name = name of the list
	 */
	public EmailList(String name) {
		this.name = name;
		this.list = new LinkedList<>();
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * compares this EmamilList with the given one using their names
	 */
	public int compareTo(EmailList emailList) {
		return this.name.compareTo(emailList.name);
	}

	/**
	 * @param address = new email address object to add in this EmailList
	 * add given email address to this list
	 */
	public void addAddress(EmailAddress address) {
		this.list.add(address);	
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * convert the EmailList object to a string representation for printing (the representation mentioned in the document)
	 */
	public String toString() {
		Iterator<EmailAddress> it = this.list.iterator();
		String out = this.name + ":[";
		if (it.hasNext()) {
			out += it.next();
		}
		while (it.hasNext()) {
			out += ", " + it.next();
		}
		return out + "]";
	}

	/**
	 * @param address = email address to remove from this list
	 * @return true if address is removed from list and false if not
	 */
	public boolean deleteAddress(int index) {
		this.list.remove(index);
		return true;
	}

	/**
	 * @return number of email addresses in this lists
	 */
	public int getNumAddr() {
		return this.list.size();
	}

	public void showNumberedList() {
		System.out.println(this.name);
		int i=0;
		for (; i!=this.list.size(); i++) { 
			System.out.println(i + " " + this.list.get(i));
		}
	}
	
}
