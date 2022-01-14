package bookStoreSystem;

public class BookStore extends Book {

	public int bookCounter = 0;
	Book[] books = new Book[10];

	public void sell(String isbn, int noOfCopies) {
		boolean isfound = false;
		if (bookCounter == 0) {
			System.out.println("There are no books in the store,kindly order some books");
		} else {
			for (int i = 0; i < bookCounter; i++) {
				if (books[i].isbn.equals(isbn)) {
					if (books[i].getNumOfCopies() > 0) {
						System.out.println("Book Found");
						books[i].numOfCopies -= noOfCopies;
						isfound = true;
						break;
					}
				}
			}
			if (isfound == false) {
				System.out.println("Sorry,Book Not Found!!");
			}
		}
	}

	public void order(String title, String author, String isbn, int noOfCopies) {
		boolean isavailable = false;

		Book book = new Book();
		book.setBookTitle(title);
		book.setAuthor(author);
		book.setIsbn(isbn);
		book.setNumOfCopies(noOfCopies);

		if (bookCounter == 0) {
			// if bookcounter 0,this means no book is present
			// so add the book
			books[0] = book;
			bookCounter++;
			isavailable = true;
		} else {
			for (int i = 0; i < bookCounter; i++) {
				if (books[i].isbn.contentEquals(isbn)) {
					books[i].numOfCopies += noOfCopies;
					isavailable = true;
					break;
				}
			}
		}
		if (isavailable == false && bookCounter < 10) {

			books[bookCounter++] = book;
		}
	}

	public void display() {
		if (bookCounter == 0) {
			System.out.println("There are no books to display!!");
		} else {
			for (int i = 0; i < bookCounter; i++) {
				System.out.println("Book Title: " + books[i].getBookTitle());
				System.out.println("Book Author: " + books[i].getAuthor());
				System.out.println("Book ISBN: " + books[i].getIsbn());
				System.out.println("Book Copies: " + books[i].getNumOfCopies());

				System.out.println("--------------------------------------");
			}
		}
	}
}
