package assignments;

public class Book {
	int id;
	String name;
	float price;
	static int counter = 1;
	
	public Book(String name, float price) {
		System.out.println("In Book class constructor");
		this.id = counter;
		counter++;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book ID is: " + this.id + " || Book name is :" + this.name + " || Book price is: " + this.price;
	}
	
	@Override
	public boolean equals(Object obj) {
		Book b = (Book)obj;
		if(this.name.equals(b.name) && this.price == b.price)
			return true;
		else
			return false;
	}
	
	public void discount(Book b2) {
		if(!this.name.equals(b2.name) && this.price == b2.price) {
			this.price = (this.price - (this.price * 10)/100);
			b2.price = this.price;
			System.out.println("You are eligible for discount with diccounted price: " + this.price);
		}
	}
	
	public static void main(String[] args) {
		Book b1 = new Book("Understanding stoicism", 100.00f);
		Book b2 = new Book("Understanding stoicism", 100.00f);
		Book b3 = new Book("Understanding psycology", 100.00f);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		b2.discount(b3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
