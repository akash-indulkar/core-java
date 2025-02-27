package collectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Assignment {
	public static void main(String[] args) {
//		Account[] accountArr = new Account[3];
//		accountArr[0] = new Account("Savings", 6845.6f);
//		accountArr[1] = new Account("Current", 68856.6f);
//		accountArr[2] = new Account("Demat", 65654.6f);
//		Account acc1 = findByAccNumber(5010043, accountArr);
//		Account acc2 = findByAccNumber(5010040, accountArr);
//		System.out.println(acc1);
//		System.out.println(acc2);
//		printAll(accountArr);
		
		ArrayList<Book> al = new ArrayList<Book>(); 
		Book b1 = new Book(1, "abc", 6845.94f);
		Book b2 = new Book(2, "def", 5844.85f);
		Book b3 = new Book(3, "ghi", 2865.59f);
		Book b4 = new Book(4, "jkl", 8416.84f);
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		System.out.println(al);
		
//		System.out.println(al.contains(new Book(3, "ghi", 2865.59f))); //for searching
//		System.out.println(b3.hashCode());
//		al.remove(0); //index based removal
//		al.remove(new Book(3, "ghi", 2865.59f)); //object based removal
//		System.out.println(al);
//		discount(al, 10);
//		Collections.sort(al); //uses compareTo() internally
//		al.sort((a1, a2) -> (int)(a1.getbPrice() - a2.getbPrice())); //use compare() internally, using lambda way
//		al.sort(new BookComparisonByPrice()); //this sort method needs Comparator object
//		al.sort(new BookComparisonByID()); //this sort method needs Comparator object
		al.sort(new BookComparisonByName()); //this sort method needs Comparator object
		System.out.println(al);
	}
	
	public static void printAll(Account[] accountArr) {
		for(int i=0; i<accountArr.length; i++) {
			System.out.println(accountArr[i]);
		}
	}
	
	public static Account findByAccNumber(int accNo, Account[] accountArr) {
		for(int i=0; i<accountArr.length; i++) {
			if(accountArr[i].getAccNo() == accNo) {
				return accountArr[i];
			}
		}
		return null;
	}
	
	public static void discount(ArrayList<Book> al, int dicountPercentage) {
		Iterator<Book> it = al.iterator(); //gives iterator object which can be used to iterator over the collection
		while (it.hasNext()) { //return true or false, whether it has next elements or not
			Book b = it.next(); //returns next element in the collection
			if(b.getbPrice()>=5000.00f) {
				b.setbPrice(b.getbPrice() - ((b.getbPrice() * dicountPercentage)/100));
			}
		}
	}
}
