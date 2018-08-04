package convertion;

import java.util.Scanner;

public class OctalToHexa {

	public static void main(String[] args) {
		System.out.println("Enter Octal number to convert it in Hexadecimal");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dec = OctalToDec.octToDec(num);
		String hex = DecToHex.hexFormat(dec);
		System.out.println(hex);
		sc.close();

	}

}
