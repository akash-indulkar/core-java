package com.multithreading;

public class MultiThreadingAssignment extends Thread{
	Thread t1, t2;
	public MultiThreadingAssignment() {
		t1 = new Thread(this);
		t1.start();
		t2 = new Thread(this);
		t2.start();
	}
	
	public void run() {
		if(Thread.currentThread() == t1) {
			for(int i=01; i<=100; i++) {
				System.out.println("Fifty five " + i + "'s are " + 55*i);
			}
		}
		if(Thread.currentThread() == t2) {
			for(int i=01; i<=100; i++) {
				System.out.println("Sixty six " + i + "'s are " + 66*i);
			}
		}
	}
	
	public static void main(String[] args) {
		MultiThreadingAssignment a = new MultiThreadingAssignment();
	}
}
