package org.usingAnonymousClassConcept;

public class MainRunner {
	public static void main(String[] args) {
		System.out.println("Main method started");
		MyThread m1 = new MyThread();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				m1.display();
			}
		};
		Thread t2 = new Thread() {
				@Override
				public void run() {
					m1.print();
				}
		};
		t1.start();
		t2.start();
		System.out.println("Main method end");
	}
}
