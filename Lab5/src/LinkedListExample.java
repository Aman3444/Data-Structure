import java.util.InputMismatchException;
import java.util.Scanner;

public class LinkedListExample {

	public static void main(String[] args) {
	
		
		LList linklist = new LList();
		
		Scanner input = new Scanner(System.in);

		boolean quit = false;
		
		String choice = null;

		while (!quit) {
		
				System.out.println("Enter An Option From this:  \n");
				System.out.println("1... to add to head ");
				System.out.println("2... to delete from the head");
				System.out.println("3... to display a linked list");
				System.out.println("4... to delete a particular element");
			    System.out.println("5... to quit:");

				choice = input.nextLine();

				if (choice.charAt(0) == '1') {
					System.out.println("Enter a string to add to the list: ");
					String datastore = input.nextLine();
					linklist.addAtHead(datastore);
				}
				
				
				else if (choice.charAt(0) == '2') {
					
					
					LLNode remove = linklist.deleteAtHead();
					
					if (remove==null){
						
						System.out.println("");
					}
					
					else
						System.out.println("We removed the first head " + remove);
				} 
				else if (choice.charAt(0) == '3') {
					
					
					linklist.display();
				
				} 
				
				
				else if (choice.charAt(0) == '4') {
					
					System.out.println("Enter string to delete from the list");
					
					String data = input.nextLine();
					
					linklist.delete(data);
				
				}
				else if (choice.charAt(0) == '5') {
					System.out.println("Quit ");
					System.out.println();
					quit = true;
					break;
				} else {
			
					
					
					System.out.println("Invalid option, please try again");
				}

				System.out.println();

			
		}

	}

}