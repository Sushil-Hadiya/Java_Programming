package convertion;

import java.util.Scanner;

public class BinToDec {

	static int binToDec(int num) {
		int dec = 0;
		int power = 0;
		while (num != 0) {
			int rem = num % 10;
			dec = dec + (rem * (int) Math.pow(2, power));
			num /= 10;
			power++;
		}
		return dec;
	}

	public static void main(String[] args) {
		System.out.println("Enter Binary number to convert it in Decimal : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dec = binToDec(num);
		System.out.println(dec);
		sc.close();

	}

}
