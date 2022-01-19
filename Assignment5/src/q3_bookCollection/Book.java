package q3_bookCollection;

public class Book implements Comparable<Book> {

	private String bookTitle;
	private String bookAuthor;
	
	public Book(String bookTitle, String bookAuthor) {
		
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	@Override
	public int compareTo(Book o) {
		if(bookTitle.compareTo(o.bookTitle)==0) {
			return bookAuthor.compareTo(o.bookAuthor);
		}
		//return bookTitle.compareTo(o.bookTitle);
		return 0;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + bookTitle + ", author=" + bookAuthor + "] \n";
	}
}
