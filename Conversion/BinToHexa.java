package convertion;

import java.util.Scanner;

public class BinToHexa {

	public static void main(String[] args) {
		System.out.println("Enter Binary Number to convert it in Hexadecimal");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int bin = BinToDec.binToDec(num);
		String hex = DecToHex.hexFormat(bin);
		System.out.println(hex);
		sc.close();

	}

}
