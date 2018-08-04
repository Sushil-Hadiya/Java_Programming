package numberSystemProgramCollection;

import java.util.Scanner;

public class HappyNumberBetN {

	static private int square(int i) {
		return i * i;
	}

	static private int isHappy(int i) {
		int sum = 0;
		while (i != 0) {
			int rem = i % 10;
			sum = sum + square(rem);
			i = i / 10;
		}
		if (sum >= 1 && sum <= 9) {
			// System.out.println("Number is not Happy Number : ");
			return sum;
		} else {
			sum = isHappy(sum);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Upto Number TO check Number is Happy Or Not :");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int happy = isHappy(i);
			if (happy == 1) {
				count++;
				System.out.println(i + " ");
			}
		}
		System.out.println("Total happy nuber between 1 to " + n + " " + count);
		sc.close();

	}

}
