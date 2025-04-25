package Task_no_3_q_1;

public class Library {
	private static Book bookStorage[];
	static int count;
	
    public Library() {
    	bookStorage = new Book[5];
        count = 0;
    }
	
	public static void addBook(Book newbook) {
		
		if (count<bookStorage.length){
			bookStorage[count] = newbook;
			System.out.println("Added : "+bookStorage[count].title);
			count++;
		}
		else {
			System.out.println("There is No Space in Library");
		}
		
	}
	
	public static void removeBook(int bookId) {
		for(int i=0;i<count;i++) {
			if(bookStorage[i].bookId==bookId) {
				  for (int j = i; j < count - 1; j++) {
		                bookStorage[j] = bookStorage[j + 1];
		            }
		            bookStorage[count - 1] = null;
		            count--; 
		            System.out.println("Book with ID " + bookId + " removed.");
		            return;
			}
		}
		 System.out.println("Book with ID " + bookId + " not found.");
	}
	
	
	public static void searchBook(int bookId) {
		
		for(int i=0;i<bookStorage.length;i++) {
			if (bookStorage[i] != null && bookStorage[i].bookId==bookId ) {
				System.out.println("Book No :"+(i+1)+"\nBook Id : "+bookStorage[i].bookId+"\nBook Title : "+bookStorage[i].title+"\nBook Author : "+bookStorage[i].author+"\nBook Available : "+(bookStorage[i].isAvail ? "Yes":"No"));
				System.out.println();
			}
		}
		
	}
	
	
	public static void display() {
		System.out.println("Books in the library:");
		System.out.println();

		for(int i=0;i<bookStorage.length;i++) {
			if (bookStorage[i] != null) {
				System.out.println("Book No :"+(i+1)+"\nBook Id : "+bookStorage[i].bookId+"\nBook Title : "+bookStorage[i].title+"\nBook Author : "+bookStorage[i].author+"\nBook Available : "+(bookStorage[i].isAvail ? "Yes":"No"));
				System.out.println();
			}
		}
	
	}
		
}
