import java.util.*;
public class Employee {

	private int employeeNumber;
	private String employeeName;
	private float employeeSalary;
	
	public Employee(){
		
		this.employeeNumber = 0;
		this.employeeName = new String();
		this.employeeSalary = 0;
		
	}
	
	public boolean add(){
		Scanner input = new Scanner(System.in);
		try{
			System.out.println("Enter employee number");
			this.employeeNumber = input.nextInt();
			System.out.println("Enter employee name");
			this.employeeName = input.next();
			System.out.println("Enter employee salary");
			this.employeeSalary = input.nextFloat();
			
			return true;
		}catch(InputMismatchException e){
			System.out.println("Please enter approprate data");
			return false;
		}
	}
	
	public void menu(){
		System.out.println();
		System.out.println("Enter 1 to add an employee, 2 to display all employees, 3 to search for employee, 4 to quit");
	}

	public String getFirstName(){
		return employeeName;
	}
	
	public String toString(){
		
		StringBuilder builder = new StringBuilder();
		builder.append(employeeName).append(" "+employeeNumber).append(" has ").append("salary ").append(employeeSalary);
		return builder.toString();
	}

}
