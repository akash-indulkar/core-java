package com.java;

public class Author {
	protected int authorID;
	protected String name;
	protected int exp;
	protected static int series;
	
	public Author() {
		System.out.println("In Author class default constructor");
		this.authorID = series;
		series++;
		this.name = "abc";
		this.exp = 0;
	}
	
	public Author(String name, int exp) {
		System.out.println("In Author class parameterized constructor");
		this.authorID = series;
		series++;
		this.name = name;
		this.exp = exp;
	}
	
	public int getAuthorID() {
		return authorID;
	}

	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Author ID is: " + this.authorID + " || Author name is: " + this.name + " || Author experience is: " + this.exp;
	}
}
