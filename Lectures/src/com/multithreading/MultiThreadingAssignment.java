package com.multithreading;

public class MultiThreadingAssignment extends Thread{
	Thread t1, t2, t3;
	public MultiThreadingAssignment() {
		t1 = new Thread(this);
		t1.start();
		t2 = new Thread(this);
		t2.start();
		t3 = new Thread(this);
		t3.start();
	}
	
	public void run() {
		if(Thread.currentThread() == t1) {
			synchronized(this) {
				for(int i=01; i<=100; i++) {
					System.out.println("Eleven " + i + "'s are " + 11*i);
					if(i==50) {
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		if(Thread.currentThread() == t2) {
			synchronized(this) {
				for(int i=01; i<=100; i++) {
					System.out.println("Twenty two " + i + "'s are " + 22*i);
					if(i==50) {
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		if(Thread.currentThread() == t3) {
			synchronized(this) {
				for(int i=01; i<=100; i++) {
					System.out.println("Thirty three " + i + "'s are " + 33*i);
				}
				notifyAll(); //notifyAll() method is used to notify all the waiting threads to get lock
			}
		}
	}
	
	public static void main(String[] args) {
		MultiThreadingAssignment a = new MultiThreadingAssignment();
	}
}
