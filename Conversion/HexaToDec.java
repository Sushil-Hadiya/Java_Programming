package convertion;

import java.util.Scanner;

// please improve if it's possible
public class HexaToDec {

	static int hexaToDec(String hex) {
		String digits = "0123456789ABCDEF";
		hex = hex.toUpperCase();
		int val = 0;
		for (int i = 0; i < hex.length(); i++) {
			char c = hex.charAt(i);
			int d = digits.indexOf(c);
			val = 16 * val + d;
		}
		return val;
	}

	public static void main(String[] args) {
		System.out.println("Enter Hexadecimal number to convert it in Decimal");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int dec = hexaToDec(num);
		System.out.println(dec);
		// Inbuilt method
		System.out.print("Using Inbuilt Method : ");
		System.out.println(Integer.parseInt("2d", 16));
		sc.close();

	}

}
