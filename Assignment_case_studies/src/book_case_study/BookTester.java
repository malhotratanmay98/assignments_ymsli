package book_case_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookTester {
	public static void main(String[] args) {
		
		List<Book> allBooks = loadAllBooks();
		System.out.println(allBooks);
		
		//1. Find books with more then 400 pages
		
		Predicate<Book> lengthyBooks=b -> b.getPages() > 400;
		
		List<Book>moreThen400Pages=allBooks.stream().filter(lengthyBooks).collect(Collectors.toList());
		System.out.println(moreThen400Pages);
		
		//2. Find all books that are java books and more then 400 pages
		
		Predicate<Book> javaBooks = b->b.getSubject()==Subject.JAVA;
		
		List<Book> lengthyandJava= allBooks.stream().filter(lengthyBooks.and(javaBooks)).collect(Collectors.toList());
		System.out.println(lengthyandJava);
		
		//3. We need the top three longest books
		
		List<Book> top3Longest = allBooks.stream()
				.sorted(Comparator.comparing(Book::getPages)).limit(3)
				.collect(Collectors.toList());
		
//		System.out.println(top3Longest);
		
		
		//4. We need from the fourth to the last longest books
		List<Book> from4thToLastLongBooks = allBooks.stream()
				.sorted((b1, b2) -> b2.getPages() - b1.getPages())
					.skip(3)
						.collect(Collectors.toList());
		
		
		//5. We need to get all the publishing years
		
		List<Integer> allPublishingYears = allBooks.stream().map(b->b.getYear()).distinct().collect(Collectors.toList());
	
		//6. We need all the authors who have written a book
		
//		 List<Author> writtenBooks=allBooks.stream()
//			.flatMap(b-> b.getAuthors().stream()).map(b->b.getName()).distinct().count();
		
		
	}
	
	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in"));

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(new Author("foo", "fee", "us"),
				new Author("bar", "bee", "us"));

		books.add(new Book("java", authors1, 420, Subject.JAVA, 2000, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("Mgt", authors3, 600, Subject.DOT_NET, 2000, "1293"));

		return books;
	}

}
