package Task_no_4_q_2;

public class Testing {

	public static void main(String args[] ) {
		
		try {
		Voter voter1= new Voter(1, "Mohan", 19);
		Voter voter2= new Voter(2, "Surya", 12);
		}
		catch (ValidateVoterAge e){
			System.out.println("Exception : \n"+e.getMessage());
			
		}
	}

}
