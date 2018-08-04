package numberSystemProgramCollection;

import java.util.Scanner;

public class StrongNumber {

	static private int fact(int num) {
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum *= i;
		}
		return sum;
	}

	static private int isStrong(int num) {
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			int res = fact(rem);
			sum += res;
			num /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		// sum of each factorial digit is equal to given number called Strong number exp
		// = 145 -> 1! + 4! + 5! = 145
		System.out.println("Enter nummber to check num is Strong or Not");
		Scanner sc = new Scanner(System.in);
		int fact = sc.nextInt();
		int strong = isStrong(fact);
		if (strong == fact) {
			System.out.println("Given number is Strong : ");
		} else {
			System.out.println("Not a Strong number");
		}
		sc.close();

	}

}
