
/*******************************************************************************************************************
 * File Name: 	Dictionary Class
 * Purpose: 	Dictionary Class is keep tracking of words. With the tracking it allows you to track how many occurrences
 * 				for just one word. You can enter word by typing your self or you can also add any text file in program.
 * 
 * Members:		TreeMap map:		It is TreeMap class type reference. It stores the words.
 * 				
 * Methods:		clear:				It clears the all mapping from the TreeMap.
 * 				search:				Returns the value if it match with specified word.
 * 				processFile:		Add the words on specified key in the map.
 * 		displayNumberOfNodes:		returns the number of key-value mappings in this map.
 * 			    alphaCharacters:	It removes all special character from the string value and convert in to lower case.
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
import java.util.TreeMap;

public class Dictionary {

	private TreeMap<String, Integer> map = new TreeMap<String, Integer>();

	/**
	 * Clears the dictionary.
	 */

	public void clear() {
		if (map.size() == 0) {
			System.out.println("Nothing to clear\n");
		} else {
			map.clear();
			System.out.println("The Dictionary is now cleared\n");
		}

	}

	/**
	 * Prompts user to enter a word and searches for the word count.
	 */
	public void search(String search) {
		if (map.get(search.toLowerCase()) == null)
			System.out.println("There are no match for that words.\n");
		else
			System.out.println("'" + search + "'" + " occured " + map.get(search.toLowerCase()) + " times\n");

	}

	/**
	 * Reads in words from a file.
	 */
	public boolean processFile(String name) {
		if (map.get(name) == null) {
			map.put(name, 1);
		} else {
			int key = map.get(name).intValue();
			key++;
			map.put(name, key);
		}

		return true;
	}

	/**
	 * Displays number of nodes in the dictionary.
	 */
	public void displayNumberOfNodes() {
		System.out.println("There are " + map.size() + " nodes\n");

	}

	/**
	 * removes all special character from the file
	 */
	public String alphaCharacters(String name) {
		return name.replaceAll("\\W", "").toLowerCase();
	}
}
