package recursion;

import java.util.Scanner;

public class Power {

	private static double power(double x, int n) {
		if (n == 0 || n == 1) {
			return (n == 0 ? 1.0 : x);
		} else if (n > 1) {
			return x * power(x, n - 1);
		} else {
			return (1.0 / power(x, -n));
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Number to Perform Power of given Number ");
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		System.out.println("Enter Exponents :");
		int expo = sc.nextInt();
		double power = power(number, expo);
		System.out.println("Power of " + power);
	}
}
