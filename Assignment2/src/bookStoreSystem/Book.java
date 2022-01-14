package bookStoreSystem;

public class Book {

	public String author;
	public String isbn;
	public int numOfCopies;
	public String bookTitle;

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public void display() {
		System.out.println("Book Title: " + bookTitle);
		System.out.println("Author: " + author);
		System.out.println("ISBN: " + isbn);
		System.out.println("Number of Copies: " + numOfCopies);
	}
}
