package misc;

import java.util.Scanner;

// Write a JAVA program to calculate pow(x,n)?
public class PowerOfNumber {

	private static double power(double x, int n) {
		double res = 1;
		while (n != 0) {
			res = res * x;
			n--;
		}
		return res;
	}

	private static double recursive(double x, int n) {
		if (n == 0 || n == 1) {
			return (n == 0 ? 1.0 : x);
		} else if (n > 1) {
			return x * power(x, n - 1);
		} else {
			return (1 / power(x, -n));
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		double x = new Scanner(System.in).nextDouble();
		int n = new Scanner(System.in).nextInt();
		double res = power(x, n);
		System.out.println("Using Normal Method....." + res);
		double recur = recursive(x, n);
		System.out.println("Using Recursive Method..." + recur);
	}
}
