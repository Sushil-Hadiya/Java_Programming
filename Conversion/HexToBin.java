package convertion;

import java.util.Scanner;

public class HexToBin {

	public static void main(String[] args) {
		System.out.println("Enter HexaDecimal number to convert it in Binary");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int dec = HexaToDec.hexaToDec(num);
		String bin = DecToBin.binaryFormat(dec);
		System.out.println(bin);
		sc.close();

	}

}
