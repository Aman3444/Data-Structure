import java.util.InputMismatchException;
import java.util.Scanner;


public class Account {
    int AccountNumber;
	private String lName;
	private String fName;
	protected float Totalbal;
	
	public Account() {
		AccountNumber = 0;
		lName = new String();
		fName = new String();
		Totalbal = 0.0f;
	}
	

	public boolean  withdraw (float amount) {
		if (amount > Totalbal) {
			System.out.println ("Your Account have not enough money .......");
			return false;
		}
		Totalbal -= amount;
		return true;
	}
	public  float deposit(float amount){
		Totalbal+=amount;
		return amount;
		
		
	}
	public String display(){
		
		return fName + " " + lName + " " + AccountNumber  + " has balance $" + Totalbal;
	}
	
	
	public void addAccount(){
		
		Scanner in = null;

		try{		
		
			System.out.println("Enter the first name of the client :");
			fName=in.next();
			System.out.println("Enter the last name of the client :");
			lName=in.next();
			System.out.println("Enter your account number: ");
			AccountNumber=in.nextInt();
			while(AccountNumber<0||AccountNumber>1000000){
				System.out.println("Invalid Number .... Must be real , positive and Max is 7 Digits.  Enter Again :" );
				AccountNumber=in.nextInt();
				}
				System.out.println("Enter the Balance Information :");
				Totalbal=in.nextInt();
		}
		
		catch (InputMismatchException e){
			
			System.out.println("Ivalid Data Entry .........");
			
		}		
	}
	public int getAccountNum() {
		return AccountNumber;
	}
	
	public float getBalance() {
		return Totalbal;
	}
	
	public String toString() {
		return fName + " " + lName + " " + AccountNumber  + " has balance $" + Totalbal;
	}
	
}
