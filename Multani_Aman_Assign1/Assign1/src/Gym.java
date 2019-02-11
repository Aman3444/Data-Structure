
/**  Name: Event.java
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
 *	  Data fields:  
 *
 *    Methods: 
 *    
 *    **/
import java.util.Scanner;

public class Gym extends Event {
	
	public Gym(){}

	public boolean inputEvent(Scanner input, String prompt){
		if(!super.inputEvent(input, prompt))
			{
			return false;
			}
		return true;
	}
	
	public String toString(){
		return super.toString();
	}
}