package convertion;

import java.util.Scanner;

public class BinaryToOctal {

	public static void main(String[] args) {
		System.out.println("Enter Binary number to convert it in Decimal : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dec = BinToDec.binToDec(num);
		String hex = DecToOctal.octalFormat(dec);
		System.out.println(hex);
		sc.close();

	}

}
