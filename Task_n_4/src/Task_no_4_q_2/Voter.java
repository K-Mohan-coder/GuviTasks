package Task_no_4_q_2;

public class Voter {
	int voterId;
	String name;
	int age;
	
	
	public Voter(int voterId, String name, int age) throws ValidateVoterAge {
		
		if(age<18) {
			throw new ValidateVoterAge("Invalid age for voter : "+name+"\nAge : "+age+"\nAge should be greater then 18");
		}
		
		this.voterId = voterId;
		this.name = name;
		this.age = age;
	}
	
	

}
