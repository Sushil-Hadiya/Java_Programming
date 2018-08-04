package numberSystemProgramCollection;

import java.util.Scanner;

public class PrimeNumber {

	static void isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Given number suspected as Prime Number :) HAPPY CODING");
		} else {
			System.out.println("Given Number is not prime");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter number to check prime number or not");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		isPrime(i);
		sc.close();
	}

}
