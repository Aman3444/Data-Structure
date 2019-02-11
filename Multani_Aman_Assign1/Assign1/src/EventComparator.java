/**  Name: EventComparator.java
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
 *	  Data fields:  instance: EventComparator - a new instance of this class
 *
 *    
 *    Methods:  default constructor - private in order for one instance only of class to be created
 *    			getInstance : EventComparator - returns a single instance of class
 *    			compare(Event, Event) : int - compares two events for greater than, less than or equal
 */
import java.util.Comparator;

public class EventComparator implements Comparator<Event>{
	
	private static EventComparator instance = new EventComparator();
	
	private EventComparator(){}

	public static EventComparator getInstance() {
		return instance;
	}
	
	@Override
	public int compare(Event E1, Event E2) {
		
		
		if(E1.isGreater(E2))
			return 1;
		
		if(E1.isLess(E2))
			return -1;
		
		return 0;
	
	
	}

}
