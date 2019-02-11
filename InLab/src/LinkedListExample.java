import java.util.InputMismatchException;
import java.util.Scanner;

public class LinkedListExample {

	public static void main(String[] args) {
	
		
		LList linklist = new LList();
		
		Scanner input = new Scanner(System.in);

		boolean quit = false;
		
		

		while (!quit) {
		
				//String look;
				System.out.println("Enter the String  : ");
				//look = input.nextLine();
				String datastore = input.nextLine();
				linklist.addAtHead(datastore);
				
				
				
				
				if (checkPalindrome(datastore)){
					
	
						System.out.println("Yes.The given String is a palindrome");
						
						linklist.display();	
					
					
				} else {
					System.out.println("No.The given String is not a palindrome");
				
			

				} 
				System.out.println();

		}
	}
	
	

	
	


static boolean checkPalindrome(String datastore) {
	
	
	
	
	if (datastore.length() < 2 ) {
		return true;
	}
	if (datastore.charAt(0) != datastore.charAt(datastore.length() - 1))
	
	{
		return false;
	}
	String substring = datastore.substring(1, datastore.length() - 1);
	
	if (!checkPalindrome(substring)) 
	{
		return false;
	}
	return true;
}
}