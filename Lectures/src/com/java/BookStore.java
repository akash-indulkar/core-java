package com.java;

public class BookStore {

	public static void discount(Book b) {
		float discount = 0;
		if(b instanceof Novel) {
			discount = (b.bookPrice * 17) / 100;
			b.bookPrice = b.bookPrice - discount;
			b.printBookDetails();
		} else if(b instanceof Comic) {
			discount = (b.bookPrice * 25) / 100;
			b.bookPrice = b.bookPrice - discount;
			b.printBookDetails();
		}
	}
	
	public static void main(String[] args) {
		Book b = new Novel("The Palace of Illusions", new Author("Chitra Banerjee", 10), 313, 41589);
		System.out.println(b);
		discount(b);
		b = new Comic("The Alchemist", new Author("Paulo Coelho", 12), 262, 22415);
		System.out.println(b);
		discount(b);
	}
}
