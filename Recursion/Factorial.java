package recursion;

import java.util.Scanner;

//factorial using recursion

public class Factorial {

	private static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("Enter number to calculate Factorial !!!");
		int no = new Scanner(System.in).nextInt();
		int res = fact(no);
		System.out.println("Factorial of " + no + " is : " + res);
	}
}
