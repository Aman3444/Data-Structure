import java.util.InputMismatchException;
import java.util.Scanner;

public class Checking extends Account{
		
	float fee;
	public Checking() {

		
		super();
	fee=0.0f;
	
	
	
	}
	
	
	
public void EndoftheMonth () {
	Totalbal-=fee;
	
}


public void addAccount(){
	
	Scanner in = null;

	try{		
	
		System.out.println("Enter the fees: ");
		fee=in.nextFloat();
		while(fee<=0){

		System.out.print("Invalid...Must be postive and greater than 0...Enter Again :" );
		fee=in.nextFloat();
		
		}
	}
	
	catch (InputMismatchException e){
		
		System.out.println("Ivalid Data Entry .........");
		
	}		
}
	

}
