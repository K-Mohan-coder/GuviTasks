package Task_no_4_q_1;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
            Student student1 = new Student(1, "Mohan", 8, "Computer Science");
            Student student2 = new Student(2,"Surya@",14,"Information Technology");
			
		}
		catch (AgeNotWithinRangeException e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
		catch (NameNotValidException e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}

}
