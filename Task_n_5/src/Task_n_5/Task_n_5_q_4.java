package Task_n_5;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Task_n_5_q_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();
        
        Period age = Period.between(birthDate, currentDate);
        System.out.println("Your age is: " + age.getYears() + " years, " +
                           age.getMonths() + " months, and " +
                           age.getDays() + " days.");
        scanner.close();
	}

}
