package q3_bookCollection;

import java.util.ArrayList;
import java.util.Scanner;


public class BookMain {

	public static void main(String[] args) {
		Book books[]= {
				new Book("A Tale of Two Cities","Charles Dickens"),
				new Book("Don Quixote","Miguel de Cervantes"),
				new Book("The Lord of the Rings","J.R.R. Tolkien")
		};
		
		BookCollection collection = new BookCollection("Tanmay", books);
		
		System.out.println(collection.hasBook(new Book("A Tale of Two Cities","Charles Dickens")));
		System.out.println(collection.hasBook(new Book("Java in depth","Joshua Bloch")));
		
		
		System.out.println("Before sorting the books : ");
		System.out.println(collection);
		collection.sort();
		System.out.println("After sorting the books : ");
		System.out.println(collection);
		
	}
	
	
}
