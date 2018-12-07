package org.usingAnonymousClassConcept;

public class AltEvenOdd {
	// print evenOdd without synchronization
	static boolean flag = true;

	public static void main(String[] args) {
		Runnable odd = () -> {
			for (int i = 1; i <= 9;) {
				if (AltEvenOdd.flag) {
					System.out.println(i + "-->" + Thread.currentThread().getName());
					i += 2;
					AltEvenOdd.flag = false;
				}
			}
		};

		Runnable even = () -> {
			for (int i = 2; i <= 10;) {
				if (!AltEvenOdd.flag) {
					System.out.println(i + "-->" + Thread.currentThread().getName());
					i += 2;
					AltEvenOdd.flag = true;
				}
			}
		};

		Thread t1 = new Thread(odd, "ODD");
		Thread t2 = new Thread(even, "EVEN");
		t1.start();
		t2.start();
	}
}
