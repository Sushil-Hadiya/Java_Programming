package stringModification;

// The quick brown fox jumps over the lazy dog - PANAGRAM Sentence 

import java.util.Scanner;

public class Panagram {

	static boolean isPanagram(String st) {
		int n = st.length();
		if (n < 26) {
			return false;
		}
		int c[] = new int[26];
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
				c[st.charAt(i) - 97]++;
			} else if (st.charAt(i) >= 'A' && st.charAt(i) <= 'Z') {
				c[st.charAt(i) - 65]++;
			}
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Enter String to reverse Each word... ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		boolean res = isPanagram(st);
		if (res) {
			System.out.println("Given String is panagram");
		} else {
			System.out.println("Not panagram");
		}
		sc.close();
	}

}
