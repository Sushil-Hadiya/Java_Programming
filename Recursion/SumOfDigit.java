package recursion;

import java.util.Scanner;

public class SumOfDigit {

	private static int sumOfDigit(int n) {
		if (n < 10) {
			return n;
		}
		return n % 10 + sumOfDigit(n / 10);
	}

	public static void main(String[] args) {
		System.out.println("enter the number");
		String input = new Scanner(System.in).next();
		int sum = sumOfDigit(Integer.parseInt(input));
		System.out.println("Sum of Enter digit is " + sum);
	}
}
