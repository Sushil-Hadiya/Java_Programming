package org.usingAnonymousClassConcept;

public class MyThread {
	void display() {
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	void print() {
		for (int i = 100; i < 111; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
