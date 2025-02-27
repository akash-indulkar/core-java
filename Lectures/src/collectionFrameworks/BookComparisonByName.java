package collectionFrameworks;

import java.util.Comparator;

public class BookComparisonByName implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return - b1.getbName().compareTo(b2.getbName());
	}

}
