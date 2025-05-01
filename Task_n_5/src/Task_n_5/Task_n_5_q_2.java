package Task_n_5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



public class Task_n_5_q_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("abc","","bc","efg","abcd","","jkl");
		List<String> namesNotEmpty = names.stream().filter(e->!e.isEmpty()).collect(Collectors.toList());
		
		System.out.println(namesNotEmpty);

	}

}
