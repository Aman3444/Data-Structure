/**   Name: Meeting.java
 * 
 * 
 * 	  Course: CST8130
 * 
 * 
 *	  Author:  Multani Aman Altaf 
 *
 *
 *	  Date: 2017/11/27
 *
 *	  Data fields:  none
 *
 *    
 *    Methods:  default constructor 
 *				inputEvent(Scanner, String): boolean - calls super inputEvent and asks for input for location for meeting event
 *              toString(): String - returns string of meeting event
 */
import java.util.Scanner;

public class Meeting extends Event {
	
	private String location;
	
	public Meeting(){
	}
	
	public boolean inputEvent(Scanner input, String prompt){
		if(!super.inputEvent(input, prompt))
			return false;
		if(prompt.charAt(0) == 'y'){
			System.out.println("\nEnter a location for meeting: ");
		}
		location = input.next();
		return true;
	}
	
	public String toString(){
		return super.toString() + " at " + location;
	}
}
