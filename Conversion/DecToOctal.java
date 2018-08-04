package convertion;

import java.util.Scanner;

public class DecToOctal {

	static String octalFormat(int num) {
		String octal = "";
		while (num != 0) {
			int rem = num % 8;
			octal = rem + octal;
			num /= 8;
		}
		return octal;
	}

	public static void main(String[] args) {
		System.out.println("Enter Decimal number to convert it in Octal : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String octal = octalFormat(num);
		System.err.print(0);
		System.out.println(octal);
		sc.close();

	}

}
