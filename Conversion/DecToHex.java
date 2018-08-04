package convertion;

import java.util.Scanner;

public class DecToHex {

	static String hexFormat(int num) {
		String hex = "";
		while (num != 0) {
			int rem = num % 16;
			if (rem >= 10 && rem <= 15) {
				hex = (char) ('A' - 10 + rem) + hex; // here suppose rem = 12 then 65-10 = 55 + 12 = 67 so char value of
														// 67 is C...
			} else {
				hex = rem + hex;
			}
			num /= 16;
		}
		return hex;
	}

	public static void main(String[] args) {
		System.out.println("Enter Decimal number to convert it in Octal : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String hex = hexFormat(num);
		System.err.print("0x" + hex);
		sc.close();

	}

}
