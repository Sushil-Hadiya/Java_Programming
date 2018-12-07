package misc;

import java.util.Scanner;

public class GCD {

	private static void findGCD(int a, int b) {
		int gcd = 1;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println("GCD of two number is "+gcd);
	}

	public static void main(String[] args) {
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();

		findGCD(a, b);
	}
}
