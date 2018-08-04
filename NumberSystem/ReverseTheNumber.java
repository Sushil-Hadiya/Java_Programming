package numberSystemProgramCollection;

import java.util.Scanner;

public class ReverseTheNumber {

	static int reverseNum(int i) {

		int reverse = 0;
		while (i != 0) {
			int rem = i % 10;
			reverse = reverse * 10 + rem;
			i = i / 10;
		}

		return reverse;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number to reverse");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int reverse = reverseNum(i);
		System.out.println(reverse);
		sc.close();
	}

}
