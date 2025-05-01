package Task_n_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_n_5_q_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> students = Arrays.asList("Anita", "John", "Arun", "Mike", "Asha", "Ravi", "Ammu", "Nina", "Akhil", "Sara");
		
		students.stream().filter(e-> e.startsWith("A")).forEach(e->System.out.println("Starts with : "+e));

	}

}
