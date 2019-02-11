/**   Name: Assign1.java
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

 *    Methods:  main - provides a menu to run a planner application
                dislpayEvents() 
                Sort()   
                  
 */ 
 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Assign1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner input = null;
		Planner planner = new Planner();
		OurDate date;
		while(true){
			input = new Scanner(System.in);
			
			System.out.println("1 ... Add an event from keyboard");
			System.out.println("2 ... Display events of a day");
			System.out.println("3 ... Display events of a week");
			System.out.println("4 ... Delete an event");
			System.out.println("5 ... Add events from a file");
			System.out.println("6 ... Display all events");
			System.out.println("7 ... Quit");
			System.out.println("Enter Your Option: ");
			try{
				switch(input.nextInt()){
				case 0:
					if(input!=null)
						input.close();
					return;
				case 1:
					planner.inputEvent(input, "y");
					break;
				case 2:
					date = new OurDate();
					date.inputDate(input, "y");
					planner.displayOneDay(date, 0);
					break;
				case 3:
					date = new OurDate();
					date.inputDate(input, "y");
					planner.displaySevenDays(date);
					break;
				case 4:
					date = new OurDate();
					OurTime time = new OurTime();
					System.out.println("Enter date and time of event to delete:");
					date.inputDate(input, "y");
					time.inputTime(input, "y");
					planner.deleteEvent(date, time);
					break;
				case 5:
					System.out.println("LIST OF EVENTS");
					System.out.println("************");
					try {
						input = new Scanner(Paths.get("Events.txt"));
System.out.println();
					} catch (IOException ioException) {
						System.out.println("File Cannot Be Found");
						System.exit(0);
					}
					break;
				case 6:
					System.out.println("LIST OF EVENTS");
					System.out.println("************");
					

				case 7:
					System.out.println("Good bye.... Have a nice day");
					if(input!=null)
						input.close();
						return;
				default:
					System.out.println("Invalid input");
					break;	
				}
			} catch (InputMismatchException ex){
				System.out.println("Invalid input");
			}
			System.out.println();
		}
	}
	private void displayEvents(List<Event> events) {
		if (!events.isEmpty()) {
			System.out.println();
			for (Event event : events) {
				if (null != event) {
					System.out.println(event);
				}
			}
		}
		System.out.println();
	}
	private void sort(List<Event> events) {
		for (int i = 0; i < events.size(); i++) {
			for (int j = 0; j < events.size(); j++) {
				if (!events.get(i).getDate().isGreater(events.get(j).getDate())) {
					Event temp = events.get(i);
					events.set(i, events.get(j));
					events.set(j, temp);
				}
			}
		}
	}
	
}
