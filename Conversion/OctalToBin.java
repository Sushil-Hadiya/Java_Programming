package convertion;

import java.util.Scanner;

public class OctalToBin {
	public static void main(String[] args) {
		System.out.println("Enter Octal number to convert it in Binary");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dec = OctalToDec.octToDec(num);
		String bin = DecToBin.binaryFormat(dec);
		System.out.println(bin);
		sc.close();
	}
}
