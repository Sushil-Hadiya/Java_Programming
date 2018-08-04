package numberSystemProgramCollection;

import java.util.Scanner;

public class PrimeNumUptoN {

	static private void isPrime(int num) {
		for (int i = 1; i <= num; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
				}
			}
			if (flag) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter number to check prime number or not Upto given nummber");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		isPrime(i);
		sc.close();

	}

}
