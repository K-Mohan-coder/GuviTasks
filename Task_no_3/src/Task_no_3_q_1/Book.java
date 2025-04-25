package Task_no_3_q_1;

public class Book extends Library{

	int bookId;
	String title;
	String author;
	boolean isAvail;
	
	
	public Book(int bookId, String title, String author, boolean isAvail) {
		
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvail = isAvail;
	}
	


}
