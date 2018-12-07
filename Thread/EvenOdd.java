package org.usingAnonymousClassConcept;

public class EvenOdd implements Runnable {
	private static boolean evenFlag = true;

	@Override
	public void run() {
		if (EvenOdd.evenFlag) {
			printOdd();
		} else {
			printEven();
		}
	}

	static void printEven() {
		for (int j = 2; j <= 10;) {
			if (EvenOdd.evenFlag) {
				System.out.println(j + "-" + Thread.currentThread().getName());
				j += 2;
				evenFlag = false;
			}
		}
	}

	static void printOdd() {
		for (int i = 1; i <= 9;) {
			if (!EvenOdd.evenFlag) {
				System.out.println(i + "-" + Thread.currentThread().getName());
				i += 2;
				evenFlag = true;
			}
		}
	}

	public static void main(String[] args) {
		EvenOdd t1 = new EvenOdd();
		Thread td1 = new Thread(t1);
		Thread td2 = new Thread(t1);
		td1.start();
		td2.start();
	}

}
