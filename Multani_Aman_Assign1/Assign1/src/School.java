/**   Name: School.java
 * 	  
 * 
 * 	  Purpose: This class contains a main method to run the planner application.
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
 *
 *	  Data fields:  none
 *
 *    
 *    Methods:  default constructor 
 *				inputEvent(Scanner, String): boolean - calls super inputEvent and checks for inputmismatch
 *              toString(): String - returns string of school event
 */
import java.util.Scanner;

public class School extends Event {
	
	public School(){}
	
	public boolean inputEvent(Scanner input, String prompt){
		if(!super.inputEvent(input, prompt))
			return false;
		return true;
	}
	
	public String toString(){
		return super.toString();
	}

}
