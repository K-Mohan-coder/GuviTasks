package Task_no_4_q_3;

import java.util.*;

public class Testing {

	public static void main(String args[]) {
		String[] weekDays = {"Sunday","Monday","Tuesday","Wedneday","Thursday","Friday","Saturday"};
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Your Day Between 1-7 : ");
		int givenDay = s.nextInt() - 1;
		
		try {
			System.out.println("Your Day is : "+weekDays[givenDay]);
		}
		catch (Exception e) {
			System.out.println("Invalid index! Please enter a number between 1 to 7");
		}
		
		s.close();
		
		}

}
