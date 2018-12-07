package stringModification;

import java.util.Scanner;

public class ReverseTheWord {

	public static String reverseTheWord(String st) {
		char[] ch = st.toCharArray();
		st = "";
		for (int i = 0; i < ch.length; i++) {
			int j = i;
			while (i < ch.length && ch[i] != ' ') {
				i++;
			}
			int k = i - 1;
			while (k >= j) {
				st = st + ch[k];
				k--;
			}
			if (i < ch.length) {
				st = st + ch[i];
			}
		}
		return st;
	}

	public static void main(String[] args) {
		System.out.println("Enter String to reverse Each word... ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String reverse = reverseTheWord(st);
		System.out.println(reverse);
		sc.close();
	}
}
