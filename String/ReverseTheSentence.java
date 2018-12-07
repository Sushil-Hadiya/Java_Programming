package stringModification;

import java.util.Scanner;

public class ReverseTheSentence {

	public static String reverseTheSentence(String st) {
		char[] ch = st.toCharArray();
		st = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			st = st + ch[i];
		}
		return st;
	}

	public static void main(String[] args) {
		System.out.println("Enter String to reverse Each word... ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String reverse = reverseTheSentence(st);
		System.out.println(reverse);
		sc.close();
	}
}
