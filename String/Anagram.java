package stringModification;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static boolean anagram(String st1, String st2) {

		if (st1.length() != st2.length()) {
			return false;
		}
		st1 = st1.toLowerCase();
		st2 = st2.toLowerCase();
		char[] ch = st1.toCharArray();
		char[] ch2 = st2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch2);
		
		for (int i = 0; i < ch2.length; i++) {
			if (ch[i] != ch2[i]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println("Enter TWO WORD to check wether it is ANAGRAM or not... ");
		Scanner sc = new Scanner(System.in);
		String st1 = sc.nextLine();
		String st2 = sc.nextLine();
		boolean res = anagram(st1, st2);
		if (res) {
			System.out.println("Given String's are anagram");
		} else {
			System.out.println("Not Anagram");
		}
		sc.close();
	}
}
