package com.multithreading;

public class DemoMultiThreading extends Thread{ //we must extend Thread class or implement runnable interface for multi-threading
	Thread t1, t2;
	
	public DemoMultiThreading() {
		t1 = new Thread(this, "Thread one"); //we have to pass object we need to create a thread on in the constructor e.g.this
		t1.setPriority(MAX_PRIORITY); //it is used to request to maximum priority of thread but it is totally os dependent behavior
		t1.start(); // after calling start() method on a thread, that thread is into runnable state, ready to execute
		t2 = new Thread(this, "Thread two");
		t2.start();
	}
	
	@Override
	public void run() { //in run() method we define our task
		if(Thread.currentThread() == t1) {
			for(int i=0; i<100; i++) {
				System.out.println("Java");
				try {
					Thread.sleep(500); //sleep() method is used to pause execution of a thread
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		if(Thread.currentThread() == t2) {
			for(int i=0; i<100; i++)
			System.out.println("Rocks");
		}
	}
	
	public static void main(String[] args) {
		DemoMultiThreading dm = new DemoMultiThreading();	
		System.out.println(dm.t1);
		System.out.println(dm.t2);
	}
}
