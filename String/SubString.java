package stringModification;

import java.util.Scanner;

public class SubString {

	private static boolean subString(String a, String b) {
		if (a.length() < b.length() || b.length() < 0) {
			return false;
		}
		char c1[] = a.toCharArray();
		char c2[] = b.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			int j = 0, k = i;
			while (k < c1.length && j < c2.length && c1[k] == c2[j]) {
				k++;
				j++;
			}
			if (j == c2.length) {
				// This Condition check Whether it is a word or Not
				if ((i == 0 || c1[i - 1] == ' ') && (k == c1.length || c1[k] == ' ')) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter Sentence : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println("Enter String to check whether it is Substring or Not ");
		String s2 = sc.nextLine();
		boolean res = subString(s1, s2);
		if (res) {
			System.out.println(s2 + " is a SubString of " + s1.trim());
		} else {
			System.out.println(s2 + " is NOT a SubString of " + s1.trim());
		}
		sc.close();
	}
}
