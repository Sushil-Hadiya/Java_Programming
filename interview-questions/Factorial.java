package misc;

import java.util.Scanner;

//Write a JAVA program for calculating the factorial of a number

public class Factorial {
	private static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	private static int recursive(int n) {
		if (n == 1 || n ==0) {
			return 1;
		}
		return n * recursive(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		int fact = new Scanner(System.in).nextInt();
		int res = factorial(fact);
		System.out.println("Fact Of given number is ..." + res);
		int rec = recursive(fact);
		System.out.println("Fact Of given number is USING RECURSIVE ..." + rec);
	}
}
