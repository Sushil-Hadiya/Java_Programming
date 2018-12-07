package stringModification;

import java.util.Scanner;

public class CountCharInEachWord {

	public static void countCharInWord(String st) {
		int wc = 0;
		for (int i = 0; i < st.length(); i++) {
			int character = 0;
			while (i < st.length() && st.charAt(i) != ' ') {
				character++;
				i++;
			}
			if (character > 0) {
				wc++;
				System.out.println(wc + "->" + character);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter String to count each word character..");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		countCharInWord(st);
		sc.close();
	}
}
