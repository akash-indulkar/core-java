package collectionFrameworks;

//public class Book implements Comparable<Book>{ //we need to compulsory implement Comparable interface if we are going to use Collections.sort() method
public class Book {
	private int bId;
	private String bName;
	private float bPrice;
	
	public Book(int bId, String bName, float bPrice) {
		this.bId = bId;
		this.bName = bName;
		this.bPrice = bPrice;
	}
	
	public int getbId() {
		return bId;
	}
	
	public void setbId(int bId) {
		this.bId = bId;
	}
	
	public String getbName() {
		return bName;
	}
	
	public void setbName(String bName) {
		this.bName = bName;
	}
	
	public float getbPrice() {
		return bPrice;
	}
	
	public void setbPrice(float bPrice) {
		this.bPrice = bPrice;
	}
	
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", bPrice=" + bPrice + "]";
	}
	
	@Override //it is always recommended to override hashcode and equals method
	public int hashCode() {
		return bId+(int)bPrice;
	}

	@Override
	public boolean equals(Object b) {
		return (this.hashCode() == ((Book)b).hashCode() && this.bName.equals(((Book)b).bName));
	}

//	@Override
//	public int compareTo(Book b) { //provide implementation for abstract method present in Comparable interface
//		return (int)(this.bPrice - b.bPrice);
//	}
}
