package misc;

import java.util.Scanner;

//Write a JAVA program to reverse the words in a sentence in place
public class ReverseWord {

	private static String reverseWord(String str) {
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++) {
			int j = i;
			while (i < ch.length && ch[i] != ' ') {
				i++;
			}
			int k = i - 1;
			while (k >= j) {
				str = str + ch[k];
				k--;
			}
			if (i < ch.length) {
				str = str + ch[i];
			}
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println("Enter String to reverse the string");
		String str = new Scanner(System.in).nextLine();
		str = reverseWord(str);
		System.out.println(str);

	}
}
