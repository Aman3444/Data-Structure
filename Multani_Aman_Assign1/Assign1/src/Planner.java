/**   Name: Planner.java
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
 *	  Data fields:  events: ArrayList<Event> -   stores the events made by the user 
 *                  numEvents: int -   value of events currently in the planner
 *                  MAX_EVENTS: int -    maximum events allowed in planner
 *
 *    
 *    Methods:  default constructor -   initilizes event array with MAX_EVENTS 
 *				inputEvent (Scanner, String):    boolean - sets type of event to add based on user input, 
 *              deleteEvent(OurDate, OurTime):    boolean - deletes an event at a given date and time
 *              displayOneDay(OurDate): void -  display events of a certain date
 *				displaySevenDays(OurDate): void - displays events for a week starting at a certain date
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class Planner {
	
	private ArrayList<Event> events;
	
	private int numEvents;
	
	private final int MAX_EVENTS = 1000;
	
	public Planner(){
		events = new ArrayList<Event>();
		numEvents = 0;
	}
	
	public boolean inputEvent(Scanner input, String prompt){
		int type = 0;
		Event tEvent = null;
		boolean added = false;
		
		if(numEvents >= MAX_EVENTS){
			System.out.println("Maximum events entered, planner full");
			return false;
		}
		
		do{
			if(prompt.charAt(0) == 'y'){
				System.out.println("\nEnter the event type to add: ");
				System.out.println("1 ... Meeting Event \n" + "2 ... School event \n" + "3 ... Work Event \n"
						+ "4 ... Gym Event \n" + "5 ... Social event");
			}
			
			
			if(input.hasNextInt()){
				type = input.nextInt();
				
				if(type < 1 || type > 4 && prompt.charAt(0) != 'y'){
					System.out.println("Invalid event type");
					return false;
				}
			}
			else {
				System.out.println("Invalid event type");
				input.next();
				if(prompt.charAt(0) != 'y')
					return false;
			}
		} while (type < 1 || type > 4);
		
		switch(type){
		case 1:
			tEvent = new Meeting();
			break;
		case 2:
			tEvent = new School();
			break;
		case 3:
			tEvent = new Work();
			break;
		case 4:
			tEvent = new Gym();
			break;
		case 5:
			tEvent = new Social();
			break;
			
		}
			
		if(!tEvent.inputEvent(input, prompt)){ 
			return false;
		}
		
		if(Collections.binarySearch(events, tEvent, EventComparator.getInstance()) < 0){
			System.out.println("You already have an activity for that date and time ... cannot be entered");
			return true; 
			
			
			
		}
		
		for(int i = 0; i < numEvents; i++){
			if(tEvent.isLess(events.get(i))){
				events.add(i, tEvent);
				added = true;
				break;
			}
		}
		
		if(!added)
			events.add(numEvents, tEvent);
		
		++numEvents;
		return true;
	}
	
	public boolean deleteEvent(OurDate date, OurTime time){
		int index = Collections.binarySearch(events, new Event(date, time), EventComparator.getInstance());
		if(index >= 0){
			events.remove(index);
			System.out.println("\nEvent deleted.");
			return true;
		} else {
			System.out.println("No event at that date/time.");
		}
		return false;
	}
	
	public int displayOneDay(OurDate date, int startIndex){
		int i;
		System.out.println("Your activities for " + date.toString() + " are: ");
		for(i = startIndex; i < numEvents && !events.get(i).getDate().isGreater(date); i++){
				if(events.get(i).getDate().isEqual(date))
					System.out.println(events.get(i));
		}
		return i;
	}
	
	public void displaySevenDays(OurDate date){
		int index = 0;
		System.out.println("  Your activities for week starting " + date.toString() + " are: ");
		for(int j = 1; j < 8; j++){
			index = displayOneDay(date, index);
			
			date.addOne();
			
			System.out.println();
	
		}
	}
}
