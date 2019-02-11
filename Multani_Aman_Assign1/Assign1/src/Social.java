/**   Name: Social.java
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
 *    Methods:  default constructor 
 *				inputEvent(Scanner, String): boolean - calls super inputEvent and checks for inputmismatch
 *              toString(): String - returns string of social event
 */
import java.util.Scanner;

public class Social extends Event {
	
	public Social(){}

	public boolean inputEvent(Scanner input, String prompt){
		if(!super.inputEvent(input, prompt))
			return false;
		return true;
	}
	
	public String toString(){
		return super.toString();
	}
}
