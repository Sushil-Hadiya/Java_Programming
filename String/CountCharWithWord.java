package stringModification;

import java.util.Scanner;

public class CountCharWithWord {

	public static void countCharWithWord(String st) {
		for (int i = 0; i < st.length(); i++) {
			String t = " ";
			int c = 0;
			while (i < st.length() && st.charAt(i) != ' ') {
				t = t + st.charAt(i);
				c++;
				i++;
			}
			if (c > 0) {
				System.out.println(t + "->" + c);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter String to count character of each word ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		countCharWithWord(st);
		sc.close();
	}
}
