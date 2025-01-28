package com.java;

public abstract class Book {
	protected int bookID;
	protected String bookName;
	protected Author auth;
	protected float bookPrice;
	protected static int series = 1;
	
	public Book() {
		this.bookID = series;
		series++;
		this.bookName = "Understanding Religion";
		this.bookPrice = 499.99f;
	}
	
	public Book(String bookName, Author auth, float bookPrice) {
		this.bookID = series;
		series++;
		this.auth = auth;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	public abstract void printBookDetails();
	
	public String getBookName() {
		return this.bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName= bookName;
	}
	
	public Author getAuth() {
		return auth;
	}
	
	public void setAuth(Author auth) {
		this.auth = auth;
	}
	
	public float getBookPrice() {
		return this.bookPrice;
	}
	
	public void setBookPrice(float bookPrice) {
		this.bookPrice= bookPrice;
	}
	
	@Override
	public String toString() {
		return "Book ID is: " + this.bookID + " || Book name is: " + this.bookName + " || Book author details are: " + this.auth + "|| Book price is " + this.bookPrice;
	}
	

	public void print() {
		System.out.println("Book ID is: " + this.bookID + " || Book name is: " + this.bookName + " || Book author details are: " + this.auth + " || Book price is " + this.bookPrice);
	}
	
	public static void main(String[] args) {
//		Book b1 = new Book();
////		b1.print();
//		System.out.println(b1);
//		Book b2 = new Book(3, "Understanding Stoicism", 399.99f);
////		b2.print();
//		System.out.println(b2);
	}
	
}

class Novel extends Book{
	protected int scriptCode;
	
	public Novel() {
		System.out.println("In the Novel class default constructor");
		this.scriptCode = 101;
	}
	
	public Novel(String bookName, Author auth, float bookPrice, int scriptCode) {
		super(bookName, auth, bookPrice);
		this.scriptCode = scriptCode;
	}
	
	public int getScriptCode() {
		return scriptCode;
	}
	
	public void setScriptCode(int scriptCode) {
		this.scriptCode = scriptCode;
	}
	
	@Override
	public String toString() {
		return "Novel ID is: " + this.bookID + " || Novel name is: " + this.bookName + " || Novel author details are: " + this.auth + " || Novel price is " + this.bookPrice + " || Novel script code is: " + this.scriptCode;
	}
	
	@Override
	public void printBookDetails() {
		System.out.println("Novel ID is: " + this.bookID + " || Novel name is: " + this.bookName + " || Novel author details are: " + this.auth + " || Novel price is " + this.bookPrice + " || Novel script code is: " + this.scriptCode);
	}
	
}

class Comic extends Book{
	protected int imageCode;
	
	public Comic() {
		System.out.println("In the Novel class default constructor");
		this.imageCode = 101;
	}
	
	public Comic(String bookName, Author auth, float bookPrice, int imageCode) {
		super(bookName, auth, bookPrice);
		this.imageCode = imageCode;
	}
	
	public int getImageCode() {
		return imageCode;
	}
	
	public void setScriptCode(int imageCode) {
		this.imageCode = imageCode;
	}
	
	@Override
	public String toString() {
		return "Comic ID is: " + this.bookID + " || Comic name is: " + this.bookName + " || Comic author details are: " + this.auth + " || Comic price is " + this.bookPrice + " || Comic image code is: " + this.imageCode;
	}
	
	@Override
	public void printBookDetails() {
		System.out.println("Comic ID is: " + this.bookID + " || Comic name is: " + this.bookName + " || Comic author details are: " + this.auth + " || Comic price is " + this.bookPrice + " || Comic image code is: " + this.imageCode);
	}
	
}