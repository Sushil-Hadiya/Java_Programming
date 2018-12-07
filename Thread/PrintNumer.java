package org.usingAnonymousClassConcept;

public class PrintNumer extends Thread {
	volatile static int i = 1;
	volatile Object lock;

	public PrintNumer(Object lock) {
		this.lock = lock;
	}

	public static void main(String[] args) {
		Object ob = new Object();
		PrintNumer odd = new PrintNumer(ob);
		PrintNumer even = new PrintNumer(ob);
		odd.setName("Odd");
		even.setName("Even");
		odd.start();
		even.start();
	}

	@Override
	public void run() {
		while (i <= 10) {
			if (i % 2 == 0 && Thread.currentThread().getName().equals("Even")) {
				synchronized (lock) {
					System.out.println(Thread.currentThread().getName() + "-" + i);
					i++;
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if (i % 2 == 1 && Thread.currentThread().getName().equals("Odd")) {
				synchronized (lock) {
					System.out.println(Thread.currentThread().getName() + "-" + i);
					i++;
					lock.notify();
				}
			}
		}
	}
}
