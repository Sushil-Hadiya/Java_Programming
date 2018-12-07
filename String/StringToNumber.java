package stringModification;

import java.util.Scanner;

public class StringToNumber {

	public static int aa(String st) {
		char[] ch = st.toCharArray();
		int num = 0;
		for (int i = 0; i < ch.length; i++) {
			num = num * 10 + (st.charAt(i) - 48);
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println("Enter String to reverse Each word... ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int num = aa(st);
		System.out.println(num);
		sc.close();
	}

}
