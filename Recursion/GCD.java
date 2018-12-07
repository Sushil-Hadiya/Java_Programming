package recursion;

import java.util.Scanner;

public class GCD {
	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public static void main(String[] args) {
		System.out.println("enter two numbers");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int gcd = gcd(a, b);
		System.out.println("GCD Using Recursion is " + gcd);
	}
}
