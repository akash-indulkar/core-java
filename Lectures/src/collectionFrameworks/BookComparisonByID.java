package collectionFrameworks;

import java.util.Comparator;

public class BookComparisonByID implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) { //provide implementation for abstract method
		return -(b1.getbId() - b2.getbId());
	}


}
