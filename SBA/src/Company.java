import java.util.ArrayList;

public class Company {
	
	ArrayList<Employee> company;
	
	public Company(){
		company = new ArrayList<Employee>(10);
		for(int i=0;i<9;i++){
			company.add(null);
		}
	}
	
	public void add(Employee emp){
		int index = getPos(emp.getFirstName());
		if(company.get(index)==null){
			company.set(index, emp);
		}
	}
	
	public int getPos(String firstName){
		
		String index = firstName;
		return (index.charAt(0))%10;
	}
	
	public void display(){
		if(company.isEmpty()){
			System.out.println("Company is empty");
		}else{
			int index = 0;
			for(Employee ref: company){
				if(company.get(index)!=null){
					System.out.println("["+index+"] "+ref);
				}
				index++;
			}
		}
	}
	
	public void search(int index){
		
		if(company.get(index)!=null){
			System.out.println(company.get(index));
		}else{
			System.out.println("No data Found");
		}
	}
}
