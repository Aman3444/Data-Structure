import java.util.*;
public class FlemingPatelLabTest {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Employee employee = null;
		Company comp = new Company();
		
		try{
			boolean check = false;
			do{
				employee = new Employee();
				employee.menu();
				int inputValue;
				inputValue = input.nextInt();
				switch(inputValue){
					case 1:
						if(!employee.add()){
							System.out.println("Can not enter your data");
						}else{
							comp.add(employee);
						}
						break;
						
					case 2:
						comp.display();
						break;
						
					case 3:
						int index = comp.getPos(employee.getFirstName());
						comp.search(index);
						break;
					
					case 4:
						check = true;
						break;
				
					default:
						System.out.println("Invalid Choice in the menu");
				}
			}while(check == false);
			
			
			
		}catch(InputMismatchException e){
			System.out.println("Please enter a integer value to select menu");
		}
		
	}

}
