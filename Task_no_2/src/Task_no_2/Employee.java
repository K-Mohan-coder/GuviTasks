package Task_no_2;

public class Employee extends Person {
	
	int empId ;
	double salary ; 

	public Employee(String name, int age, int empId, double salary) {
		// TODO Auto-generated constructor stub
		super(name,age);
		this.empId = empId;
		this.salary = salary;		
	}
	
	public void displayDetails() {
		details();
		
    	System.out.println("\nEmployee Id : "+empId+"\n Salary : "+salary);
	}


}
