package numberSystemProgramCollection;

import java.util.Scanner;

public class PerfectNumber {

	static private int isPerfect(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			return sum;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Nummber to check for Perfect Nummber");
		Scanner sc = new Scanner(System.in);
		int perfect = sc.nextInt();
		int num = isPerfect(perfect);
		if (num == perfect) {
			System.out.println("Number is Perfect");
		} else {
			System.out.println("Given Number is Not Perfect : ");
		}
		sc.close();
	}

}
