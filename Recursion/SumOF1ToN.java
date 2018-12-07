package recursion;

import java.util.Scanner;

public class SumOF1ToN {

	private static int sum(int num) {
		int sum = 0;
		if (num == 1) {
			return 1;
		} else {
			sum = num + sum(num - 1);
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter number to calculate sum from 1 to given number");
		int a = new Scanner(System.in).nextInt();
		int sum = sum(a);
		System.out.println("Sum is " + sum);
	}
}
