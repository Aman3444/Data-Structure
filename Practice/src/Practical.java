import java.awt.print.Book;
import java.util.Scanner;

public class Practical {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String choice = new String("1");
		Book bankDatabase= new Book();
		
		while (choice.charAt(0) != '0') {
			System.out.println ("Enter 0 to quit, 1 to add new client, 2 to withdraw $, 3 to deposit $");
			System.out.print ("                 4 to update all clients, 5 to display all clients:");
			choice = in.next();
			
			switch (choice.charAt(0)) {
			case '1': if (!bankDatabase.add())
							System.out.println ("Error occurred....no addition took place");
				break;
			case '2': bankDatabase.withdraw();
				break;
			case '3': bankDatabase.deposit();
				break;
			case '4': bankDatabase.update();
				break;
			case '5': bankDatabase.display();
				break;
			case '0':
				break;
			default: System.out.println ("Invalid choice - reenter");
				
			}
		}
		

	}

}