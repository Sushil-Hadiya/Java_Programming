package patterns;

import java.util.Scanner;

public class ScannerReader {
	public static int readInt() {
		System.out.println("Enter Int value : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		return num;
	}

	public static String readString() {
		System.out.println("Enter String Value");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		return str;
	}
}
