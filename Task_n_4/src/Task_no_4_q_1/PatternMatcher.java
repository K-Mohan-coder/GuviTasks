package Task_no_4_q_1;

public class PatternMatcher {
	
	
	public static void main(String agrs[]) {
		
		String name="Mohan Kumar";
		
		int age=6;
		
//		if(name.matches("[a-zA-Z\\s]+")) {
//			System.out.println("Matches");
//		}
//		else {
//			System.out.println("No Match");
//		}
//		
//		if(!(age>15&& age<21)) {
//			System.out.println("Matches");
//		}
//		
       if (age < 15 || age > 21) {
    	   System.out.println("Error");
//            throw new AgeNotWithinRangeException("Invalid Age : "+age+"\nAge is not between 15 and 21");
        }
		else {
			System.out.println("No Match");
		}
		
	}
	


}
