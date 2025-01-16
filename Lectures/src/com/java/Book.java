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
	
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	public void setBookName(String bookName) {
		this.bookName= bookName;
	}
	
	public void setBookPrice(float bookPrice) {
		this.bookPrice= bookPrice;
	}
	
	public int getBookID() {
		return this.bookID;
	}
	
	public String getBookName() {
		return this.bookName;
	}
	
	public float getBookPrice() {
		return this.bookPrice;
	}
	
	@Override
	public String toString() {
		return "Book ID is: " + this.bookID + " || Book name is: " + this.bookName + " || Book price is " + this.bookPrice;
	}
	
	public void print() {
		System.out.println("Book ID is: " + this.bookID + " || Book name is: " + this.bookName + " || Book price is " + this.bookPrice);
	}
	
	public static void main(String[] args) {
		Book b1 = new Book();
//		b1.print();
		System.out.println(b1);
		Book b2 = new Book(3, "Understanding Stoicism", 399.99f);
//		b2.print();
		System.out.println(b2);
	}
}
