package convertion;

import java.util.Scanner;

public class HexaToOctal {

	public static void main(String[] args) {
		System.out.println("Enter HexaDecimal number to convert it in Octal");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int dec = HexaToDec.hexaToDec(num);
		String octal = DecToOctal.octalFormat(dec);
		System.out.println(octal);
		sc.close();


	}

}
