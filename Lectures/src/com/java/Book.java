package com.java;

public class Book {
	private int bookID;
	private String bookName;
	private float bookPrice;
	
	public Book() {
		this.bookID = 1;
		this.bookName = "Understanding Religion";
		this.bookPrice = 499.99f;
	}
	
	public Book(int bookID, String bookName, float bookPrice) {
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	public void print() {
		System.out.println("Book ID is: " + this.bookID + " || Book name is: " + this.bookName + " || Book price is " + this.bookPrice);
	}
	
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.print();
		Book b2 = new Book(3, "Understanding Stoicism", 399.99f);
		b2.print();
	}
}
