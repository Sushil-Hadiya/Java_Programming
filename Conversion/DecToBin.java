package convertion;

import java.util.Scanner;

public class DecToBin {

	static String binaryFormat(int num) {
		String bin = "";
		while (num != 0) {
			int rem = num % 2;
			bin = rem + " " + bin;
			num /= 2;
		}
		return bin;
	}

	public static void main(String[] args) {
		System.out.println("Enter Decimal number to convert it in Binary : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String bin = binaryFormat(num);
		System.out.println(bin);
		sc.close();
	}

}
