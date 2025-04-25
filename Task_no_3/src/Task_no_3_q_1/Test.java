package Task_no_3_q_1;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(12, "The Alchemist", "Paulo Coelho", true);
		Book b2 = new Book(13, "Clean Code", "Robert C. Martin", true);
		Book b3 = new Book(14, "Atomic Habits", "James Clear", true);
		Book b4 = new Book(15, "Happy Book", "Robert", true);
		Book b5 = new Book(16, "Tales Book", "Julius", true);

		Library.addBook(b1);
		Library.addBook(b2);
		Library.addBook(b3);
		Library.addBook(b4);
		Library.addBook(b5);

		System.out.println();

		Library.display();

		System.out.println();

		System.out.println("After Removing");

		Library.removeBook(14);

		Library.display();

		System.out.println();

		System.out.println("Search Books");
		System.out.println();
		Library.searchBook(16);

	}

}
