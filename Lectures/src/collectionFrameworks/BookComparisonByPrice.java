package collectionFrameworks;

import java.util.Comparator;

public class BookComparisonByPrice implements Comparator<Book>{ //better approach than comparable as it helps to separate business logic and data manager logic
	@Override
	public int compare(Book b1, Book b2) { //provide implementation for abstract method
		return (int)(b1.getbPrice() - b2.getbPrice());
	}

}
