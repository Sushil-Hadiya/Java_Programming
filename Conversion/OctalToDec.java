package convertion;

import java.util.Scanner;

public class OctalToDec {
	static int octToDec(int num) {
		int dec = 0;
		int power = 0;
		while (num != 0) {
			int rem = num % 10;
			dec = dec + ((int) Math.pow(8, power) * rem);
			num /= 10;
			power++;
		}

		return dec;
	}

	public static void main(String[] args) {
		System.out.println("Enter octal number to convert it into Decimal");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dec = octToDec(num);
		System.out.println(dec);
		sc.close();

	}

}
