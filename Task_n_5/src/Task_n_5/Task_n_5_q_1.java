package Task_n_5;

import java.util.Arrays;
import java.util.List;


public class Task_n_5_q_1 {

	public Task_n_5_q_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("aBc","d","ef");
		
		names.stream().map(e->e.toUpperCase()).forEach(e->System.out.println("Uppercase : "+e));;
	}
	


}
