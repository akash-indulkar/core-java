package com.multithreading;

public class JointAccount {
	float accBal;
	public JointAccount(float accBal) {
		this.accBal = accBal;
	}
	
//	public synchronized void withdraw(int amount) { //we use synchronized keyword to avoid data inconsistency issues
	public void withdraw(int amount) {
		if(amount < accBal) {
			synchronized(this) { //instead of synchronizing the whole method, we can synchronize specific instructions to improve performance and data consistency is also achieved
				this.accBal = this.accBal - amount;
				this.printAccBal();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void printAccBal() {
		System.out.println("Account Balance is " + this.accBal);
	}
}

class UserThread extends Thread{
	JointAccount acc;
	int amount;
	public UserThread(JointAccount acc, int amount) {
		this.acc = acc;
		this.amount = amount;
		Thread t = new Thread(this);
		t.start();
	}
	
	public void run() {
		acc.withdraw(this.amount);
	}
}

class Test{
	public static void main(String[] args) {
		JointAccount acc = new JointAccount(10000.00f);
		UserThread parent = new UserThread(acc, 2000); //accBal = 8000
		UserThread child = new UserThread(acc, 1000); //accBal = 7000
//		System.out.println("Hello");
//		loss of data integrity and consistency
//		sometimes multi-threading is good performance wise but not a good choice for non-thread safe applications
	}
}
