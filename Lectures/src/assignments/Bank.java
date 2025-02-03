package assignments;

public class Bank {
	class Locker{
		float cash = 22000.12f;
	}
	public static void main(String[] args) {
		Bank b = new Bank();
		Locker lock = b.new Locker();
		System.out.println(lock.cash);
	}
}
