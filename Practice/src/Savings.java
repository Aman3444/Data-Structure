import java.util.InputMismatchException;
import java.util.Scanner;

public class Savings extends Account {
		private float IntrestRate;
		private float Minimum;
	public Savings() {
		
		super();
	IntrestRate=0.0f;
	Minimum=0.0f;
	
	
	}

	
	
public void addAccount(){
		
		Scanner in = null;

		try{		
		
			System.out.println("Enter the Rate of interest :");
			IntrestRate=in.nextFloat();
			while(IntrestRate<=0){
	
			System.out.print("Invalid Rate of Interest ...Must be postive and greater than 0...Enter Again :" );
			IntrestRate=in.nextFloat();
			
			}
			System.out.println("Enter the Balance Information :");
			Minimum=in.nextInt();
			while(Minimum<=0){
				
				System.out.print("Invalid ...Must be postive and greater than 0...Enter Again :" );
				Minimum=in.nextFloat();
				
				}
		}
		
		catch (InputMismatchException e){
			
			System.out.println("Ivalid Data Entry .........");
			
		}		
	}
	
	
public void EndoftheMonth () {
	if (Totalbal >= Minimum)
		Totalbal+= Totalbal*IntrestRate;
}
	
	
	
}
